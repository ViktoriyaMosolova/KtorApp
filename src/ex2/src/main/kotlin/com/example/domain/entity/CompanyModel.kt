package com.example.domain.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CompanyModel(
    val name: String,
    @SerialName("field_of_activity") val fieldOfActivity: String,
    val vacancies: List<String>,
    val contacts: String,
)