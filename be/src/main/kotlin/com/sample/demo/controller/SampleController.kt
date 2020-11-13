package com.sample.demo.controller

import com.sample.demo.service.sample.SampleService
import io.swagger.annotations.Api
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@Api(produces = "application/json", tags = ["Sample"])
@CrossOrigin
@RequestMapping(path = ["/sample"])
class SampleController {

    @Autowired
    private lateinit var sampleService: SampleService

    @GetMapping
    fun getGreeting() = sampleService.get()

    @PostMapping
    fun postGreeting(@RequestBody name: String) = sampleService.post(name)

    @PutMapping
    fun updateGreeting() = sampleService.update()

    @DeleteMapping
    fun deleteGreeting() = sampleService.delete()
}