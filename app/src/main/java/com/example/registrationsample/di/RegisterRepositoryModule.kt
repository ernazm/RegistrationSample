package com.example.registrationsample.di

import com.example.registrationsample.data.repository.RegisterRepositoryImpl
import com.example.registrationsample.domain.repository.RegisterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RegisterRepositoryModule {
    @Binds
    abstract fun bindRegisterRepository(
        impl: RegisterRepositoryImpl
    ): RegisterRepository
}