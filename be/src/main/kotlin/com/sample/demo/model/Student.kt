package com.sample.demo.model

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "student")
class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int = 0

    @Column(name = "name")
    private var name: String = ""

    @Column(name = "wallet")
    private var wallet: Int = 0

    @OneToMany(mappedBy = "student", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    private lateinit var listCourseStudent: List<CourseStudent>

}