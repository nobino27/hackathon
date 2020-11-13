package com.sample.demo.model

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "question_student")
class QuestionStudent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questionid")
    private val question: Question? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentid")
    private val student: Student? = null


}