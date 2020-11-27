package com.spring.boot.with.kotlin.example.repository

import com.spring.boot.with.kotlin.example.entities.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String>{
    override fun findAll(pageable: Pageable): Page<User>
}