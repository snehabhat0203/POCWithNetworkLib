package com.yml.pocwithnetworklib.di

import com.yml.pocwithnetworklib.domain.repository.UniversityRepository
import com.yml.pocwithnetworklib.domain.usecase.UniversityUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideUniversityUseCase(repository: UniversityRepository): UniversityUseCase {
        return UniversityUseCase(repository)
    }
}