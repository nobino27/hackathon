package com.sample.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(
        scanBasePackages = ["com.sample.demo.service", "com.sample.demo.controller",
            "com.sample.demo.config","com.sample.demo.mapper"]
)
@EnableJpaRepositories(basePackages = ["com.sample.demo.repository"])
@EntityScan(basePackages = ["com.sample.demo.model"])
class SampleApplication

fun main(args: Array<String>) {
    runApplication<SampleApplication>(*args)
}

