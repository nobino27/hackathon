package com.sample.demo.model

import lombok.Data
import java.io.Serializable
import javax.persistence.*

@Data
@Entity
@Table(name = "teacher")
class Teacher : Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0

    @Column(name = "name")
    var name: String = ""

    @OneToMany(mappedBy = "teacher", cascade = [CascadeType.ALL])
    var listCourse: List<Course> = emptyList()
}