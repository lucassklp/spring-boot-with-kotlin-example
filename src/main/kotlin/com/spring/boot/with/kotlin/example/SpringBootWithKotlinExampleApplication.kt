package com.spring.boot.with.kotlin.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootWithKotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootWithKotlinExampleApplication>(*args)
}
