package com.sample.demo.service.sample

interface SampleService {
    fun get(): String
    fun post(name: String): String
    fun update(): String
    fun delete(): String
}