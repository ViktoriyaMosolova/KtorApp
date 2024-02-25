package com.example.data.mappers

import com.example.data.models.CompanyList
import com.example.domain.entity.CompanyModel

fun CompanyList.mapToDomainModel(): List<CompanyModel> {
    return listOfCompanies.map {
        CompanyModel(
            name = it.name,
            fieldOfActivity = it.fieldOfActivity,
            vacancies = emptyList(),
            contacts = it.contacts,
        )
    }
}