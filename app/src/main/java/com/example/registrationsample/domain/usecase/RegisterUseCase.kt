package com.example.registrationsample.domain.usecase

import com.example.registrationsample.data.model.User

interface RegisterUseCase {
    suspend operator fun invoke(username: String, email: String, password: String): Result<User>
}