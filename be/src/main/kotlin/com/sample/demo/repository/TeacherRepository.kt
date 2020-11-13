package com.sample.demo.repository

import com.sample.demo.model.Teacher
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface TeacherRepository : JpaRepository<Teacher, Int> {

}