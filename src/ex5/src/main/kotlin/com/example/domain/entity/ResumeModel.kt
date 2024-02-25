package com.example.domain.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CandidateInfoModel(
    val name: String,
    val profession: String,
    val sex: String,
    @SerialName("birth_date") val birthDate: String,
    val contacts: ContactsModel,
    val relocation: String,
)

@Serializable
data class ContactsModel(
    val phone: String,
    val email: String
)

@Serializable
data class EducationModel(
    val type: String,
    @SerialName("year_start") val yearStart: String,
    @SerialName("year_end")  val yearEnd: String,
    val description: String,
)

@Serializable
data class JobExperienceModel(
    @SerialName("date_start")val dateStart: String,
    @SerialName("date_end")  val dateEnd: String,
    @SerialName("company_name") val companyName: String,
    val description: String
)

@Serializable
data class ResumeModel(
    @SerialName("candidate_info") val candidateInfo: CandidateInfoModel,
    val education: List<EducationModel>,
    @SerialName("job_experience") val jobExperience: List<JobExperienceModel>,
    @SerialName("free_form") val freeForm: String
)