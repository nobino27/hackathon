package com.sample.demo.service.teacher

import com.sample.demo.dto.TeacherDTO
import com.sample.demo.model.Teacher
import com.sample.demo.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class TeacherServiceImp : TeacherService {

    @Autowired
    private lateinit var teacherRepository: TeacherRepository

    override fun getTeacher(): List<TeacherDTO?> {
        return teacherRepository.findAll()
                .stream()
                .map {
                    it?.let { teacher ->
                        return@let TeacherDTO(teacher.id, teacher.name)
                    }
                }
                .toList()
    }

    override fun createTeacher(dto: TeacherDTO): Boolean {
        return try {
            val teacher = Teacher()
            teacher.name = dto.name
            teacherRepository.save(teacher)
            true
        } catch (e: Exception) {
            false
        }
    }

    override fun removeTeacher(id: Int): Boolean {
        return if (teacherRepository.findById(id).isPresent) {
            teacherRepository.deleteById(id)
            true
        } else {
            false
        }
    }
}