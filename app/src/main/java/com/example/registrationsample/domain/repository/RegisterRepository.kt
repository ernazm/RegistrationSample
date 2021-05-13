package com.example.registrationsample.domain.repository

import com.example.registrationsample.data.model.User

interface RegisterRepository {

    val user: User?

    suspend fun register(username: String, email: String, password: String): User
}