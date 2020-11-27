package com.spring.boot.with.kotlin.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringBootWithKotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootWithKotlinExampleApplication>(*args)
}
