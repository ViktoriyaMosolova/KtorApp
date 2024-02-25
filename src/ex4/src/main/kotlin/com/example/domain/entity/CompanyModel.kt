package com.example.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class VacancyModel(
    val companyName: String,
    val fieldOfActivity: String,
    val profession: String,
    val level: String,
    val salary: Int,
    val contact: String,
)
