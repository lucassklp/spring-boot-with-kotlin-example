package com.spring.boot.with.kotlin.example.controllers

import com.spring.boot.with.kotlin.example.entities.User
import com.spring.boot.with.kotlin.example.services.UserServices
import io.swagger.annotations.*;
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController constructor(val services: UserServices) {

    private val LOGGER: Logger = LoggerFactory.getLogger(UserController::class.java)

    @ApiOperation(value = "Get users")
    @GetMapping
    fun getUsers(): Page<User> = services.listAll(Pageable.unpaged())
}