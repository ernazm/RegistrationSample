package com.example.registrationsample

import com.example.registrationsample.data.network.FakeRegisterDataSource
import com.example.registrationsample.data.repository.RegisterRepositoryImpl
import com.example.registrationsample.domain.usecase.RegisterUseCase
import com.example.registrationsample.domain.usecase.RegisterUseCaseImpl
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterUseCaseTest {
    private lateinit var registerUseCase: RegisterUseCase

    @Before
    fun setUp() {
        val repository = RegisterRepositoryImpl(FakeRegisterDataSource())
        registerUseCase = RegisterUseCaseImpl(repository)
    }

    @Test
    fun invokeTest() = runBlocking {
        val username = "Tad Morose"
        val email = "matter@of.life"
        val password = "ENCRYPTME"

        val result = registerUseCase.invoke(username, email, password)

        assertTrue(result.isSuccess)
        val user = result.getOrNull()
        assertNotNull(user)
        assertEquals(username, user!!.displayName)
    }
}