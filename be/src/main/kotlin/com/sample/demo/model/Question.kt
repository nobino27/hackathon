package com.sample.demo.model

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "question")
class Question {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0
    @Column(name = "thread")
    private var thread: String = ""
    @Column(name = "choiceNo1")
    private var choiceNo1: String = ""
    @Column(name = "choiceNo2")
    private var choiceNo2: String = ""
    @Column(name = "choiceNo3")
    private var choiceNo3: String = ""
    @Column(name = "choiceNo4")
    private var choiceNo4: String = ""
    @Column(name = "correctAnswer")
    private var correctAnswer: String = ""

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseid")
    private lateinit var course: Course
}