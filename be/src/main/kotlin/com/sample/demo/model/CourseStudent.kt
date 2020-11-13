package com.sample.demo.model

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "course_student")
class CourseStudent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id = 0

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseid")
    private val course: Course? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentid")
    private val student: Student? = null
}