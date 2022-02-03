package com.yml.pocwithnetworklib.data.mapper

import com.yml.networklib.model.UniversityResponse
import com.yml.pocwithnetworklib.domain.model.University

fun UniversityResponse.getUiModel(): University {
    return University(name = name, webLink = if (webPages.isNullOrEmpty()) "" else webPages!![0])
}