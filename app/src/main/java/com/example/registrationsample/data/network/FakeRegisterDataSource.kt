package com.example.registrationsample.data.network

import com.example.registrationsample.data.model.RegisterDataSource
import com.example.registrationsample.data.model.User
import java.util.*
import javax.inject.Inject

class FakeRegisterDataSource @Inject constructor() : RegisterDataSource {

    override suspend fun register(username: String, email: String, password: String): User {
        return User(UUID.randomUUID().toString(), username)
    }
}