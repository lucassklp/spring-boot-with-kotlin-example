package com.spring.boot.with.kotlin.example.entities

import org.springframework.data.mongodb.core.mapping.Document

@Document
class User constructor(
        val id: Long,
        val name: String,
        val email: String
)