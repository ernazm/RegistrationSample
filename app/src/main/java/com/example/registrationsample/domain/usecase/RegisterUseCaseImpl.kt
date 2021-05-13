package com.example.registrationsample.domain.usecase

import com.example.registrationsample.data.model.User
import com.example.registrationsample.domain.repository.RegisterRepository
import javax.inject.Inject

class RegisterUseCaseImpl @Inject constructor(
    private val repository: RegisterRepository
) : RegisterUseCase {
    override suspend operator fun invoke(
        username: String,
        email: String,
        password: String
    ): Result<User> {
        return try {
            Result.success(repository.register(username, email, password))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}