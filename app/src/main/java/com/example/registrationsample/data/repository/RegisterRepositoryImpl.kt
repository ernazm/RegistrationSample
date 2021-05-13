package com.example.registrationsample.data.repository

import com.example.registrationsample.data.network.FakeRegisterDataSource
import com.example.registrationsample.data.model.User
import com.example.registrationsample.domain.repository.RegisterRepository
import javax.inject.Inject

class RegisterRepositoryImpl @Inject constructor(val dataSource: FakeRegisterDataSource) :
    RegisterRepository {

    override var user: User? = null //TODO make it StateFlow probably
        private set

    override suspend fun register(username: String, email: String, password: String): User {
        return dataSource.register(username, email, password)
            .also { user = it }
    }
}