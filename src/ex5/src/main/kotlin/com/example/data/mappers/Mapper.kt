package com.example.data.mappers

import com.example.data.models.*
import com.example.domain.entity.*

fun Resume.mapToDomainModel(): ResumeModel {
    return ResumeModel(
        candidateInfo = candidateInfo.mapToDomainModel(),
        education = education.map{ it.mapToDomainModel() },
        jobExperience = jobExperience.map{ it.mapToDomainModel() },
        freeForm = freeForm
    )
}

fun JobExperience.mapToDomainModel(): JobExperienceModel {
    return JobExperienceModel(
        dateStart = dateStart,
        dateEnd = dateEnd,
        companyName = companyName,
        description = description
    )
}

fun Education.mapToDomainModel(): EducationModel {
    return EducationModel(
        type = type,
        yearStart = yearStart,
        yearEnd = yearEnd,
        description = description
    )
}

fun CandidateInfo.mapToDomainModel(): CandidateInfoModel {
    return CandidateInfoModel(
        name = name,
        profession = profession,
        sex = sex,
        birthDate = birthDate,
        contacts = contacts.mapToDomainModel(),
        relocation = relocation
    )
}

fun Contacts.mapToDomainModel(): ContactsModel {
    return ContactsModel(
        phone = phone,
        email = email
    )
}