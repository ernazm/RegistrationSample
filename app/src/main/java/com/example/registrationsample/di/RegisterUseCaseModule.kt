package com.example.registrationsample.di

import com.example.registrationsample.domain.usecase.RegisterUseCase
import com.example.registrationsample.domain.usecase.RegisterUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RegisterUseCaseModule {
    @Binds
    abstract fun bindRegisterUseCase(
        impl: RegisterUseCaseImpl
    ): RegisterUseCase
}