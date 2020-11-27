package com.spring.boot.with.kotlin.example.services

import com.spring.boot.with.kotlin.example.entities.User
import com.spring.boot.with.kotlin.example.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class UserServices @Autowired constructor(private val repository: UserRepository){
    fun listAll(pageable: Pageable): Page<User> = repository.findAll(pageable)
}