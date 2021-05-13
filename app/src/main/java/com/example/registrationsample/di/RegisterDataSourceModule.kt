package com.example.registrationsample.di

import com.example.registrationsample.data.network.FakeRegisterDataSource
import com.example.registrationsample.data.model.RegisterDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RegisterDataSourceModule {
    //TODO here go Qualifiers for other data source impls
    @Binds
    abstract fun bindRegisterDataSource(
        impl: FakeRegisterDataSource
    ): RegisterDataSource
}