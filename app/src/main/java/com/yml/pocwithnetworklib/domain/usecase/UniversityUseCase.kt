package com.yml.pocwithnetworklib.domain.usecase

import com.yml.pocwithnetworklib.domain.repository.UniversityRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UniversityUseCase @Inject constructor(private val repository: UniversityRepository) {
    suspend fun getUniversities() = flow {
        emit(repository.getUniversities())
    }
}