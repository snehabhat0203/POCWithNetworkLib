package com.yml.pocwithnetworklib.data.repository

import android.util.Log
import com.yml.networklib.api.UniversityDataSource
import com.yml.networklib.model.APIResponse
import com.yml.pocwithnetworklib.data.mapper.getUiModel
import com.yml.pocwithnetworklib.domain.model.University
import com.yml.pocwithnetworklib.domain.repository.UniversityRepository
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

class UniversityRepositoryImpl @Inject constructor(private val universityDataSource: UniversityDataSource) :
    UniversityRepository {
    override suspend fun getUniversities(): List<University> {
        val list = mutableListOf<University>()
        universityDataSource.getUniversities().collect { response ->

            when (response) {
                is APIResponse.Success -> {
                    response.data.forEach {
                        list.add(it.getUiModel())
                    }
                }
                is APIResponse.Error -> {
                    Log.e("Error: ", response.errorMessage)
                }
                else -> {
                    //Nothing
                }
            }

        }
        return list
    }
}