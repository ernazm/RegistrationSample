package com.example.registrationsample.data.model

interface RegisterDataSource {
    suspend fun register(username: String, email: String, password: String): User
}