package com.sample.demo.service.teacher

import com.sample.demo.dto.TeacherDTO

interface TeacherService {
    fun getTeacher(): List<TeacherDTO?>
    fun createTeacher(dto: TeacherDTO): Boolean
    fun removeTeacher(id: Int): Boolean
}