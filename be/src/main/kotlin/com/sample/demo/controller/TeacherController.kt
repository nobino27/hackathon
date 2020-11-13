package com.sample.demo.controller

import com.sample.demo.service.sample.SampleService
import com.sample.demo.service.teacher.TeacherService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@Api(produces = "application/json", tags = ["Teacher"])
@CrossOrigin
@RequestMapping(path = ["/teacher"])
class TeacherController {
    @Autowired
    private lateinit var teacherService: TeacherService

    @GetMapping
    fun getTeacher() = teacherService.getTeacher()
}