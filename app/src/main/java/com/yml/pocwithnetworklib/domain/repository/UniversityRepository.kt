package com.yml.pocwithnetworklib.domain.repository

import com.yml.pocwithnetworklib.domain.model.University


interface UniversityRepository {
    suspend fun getUniversities(): List<University>
}