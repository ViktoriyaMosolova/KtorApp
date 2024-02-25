package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CompanyList(
    val listOfCompanies: List<Company>
)

@Serializable
data class Company(
    val name: String,
    @SerialName("field_of_activity") val fieldOfActivity: String,
    val vacancies: List<Vacancy>,
    val contacts: String
)

@Serializable
data class Vacancy(
    val profession: String,
    val level: String,
    val salary: Int
)