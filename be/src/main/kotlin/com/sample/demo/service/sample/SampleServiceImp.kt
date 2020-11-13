package com.sample.demo.service.sample

import com.sample.demo.utils.Constants.*
import org.springframework.stereotype.Service

@Service
class SampleServiceImp : SampleService {
    override fun get(): String {
        return GET.greeting
    }

    override fun post(name: String): String {
        return "${POST.greeting} $name"
    }

    override fun update(): String {
        return UPDATE.greeting
    }

    override fun delete(): String {
        return DELETE.greeting
    }
}