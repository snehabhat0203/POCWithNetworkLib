package com.yml.pocwithnetworklib.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yml.pocwithnetworklib.domain.model.University
import com.yml.pocwithnetworklib.domain.usecase.UniversityUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UniversityViewModel @Inject constructor(private val useCase: UniversityUseCase) :
    ViewModel() {
    private val _liveData: MutableLiveData<List<University>> = MutableLiveData<List<University>>()
    val dataObserver: LiveData<List<University>> = _liveData

    fun getUniversities() {
        viewModelScope.launch {
            useCase.getUniversities().collect {
                _liveData.value = it
            }
        }
    }
}