package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CandidateInfo(
    val name: String,
    val profession: String,
    val sex: String,
    @SerialName("birth_date") val birthDate: String,
    val contacts: Contacts,
    val relocation: String,
)

@Serializable
data class Contacts(
    val phone: String,
    val email: String
)

@Serializable
data class Education(
    val type: String,
    @SerialName("year_start") val yearStart: String,
    @SerialName("year_end")  val yearEnd: String,
    val description: String,
)

@Serializable
data class JobExperience(
    @SerialName("date_start")val dateStart: String,
    @SerialName("date_end")  val dateEnd: String,
    @SerialName("company_name") val companyName: String,
    val description: String
)

@Serializable
data class Resume(
    @SerialName("candidate_info") val candidateInfo: CandidateInfo,
    val education: List<Education>,
    @SerialName("job_experience") val jobExperience: List<JobExperience>,
    @SerialName("free_form") val freeForm: String
)