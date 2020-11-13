package com.sample.demo.model

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "course")
class Course {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0
    @Column(name = "name")
    private var name: String = ""
    @Column(name = "price")
    private var price: Int = 0

    @ManyToOne
    @JoinColumn(name = "teacherid")
    private lateinit var teacher: Teacher

    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    private lateinit var listCourseStudent: List<CourseStudent>

    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    private lateinit var listQuestion: List<Question>
}