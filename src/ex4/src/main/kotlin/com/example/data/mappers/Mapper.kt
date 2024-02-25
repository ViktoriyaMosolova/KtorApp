package com.example.data.mappers

import com.example.data.models.CompanyList
import com.example.data.models.Vacancy
import com.example.domain.entity.VacancyModel

fun CompanyList.mapToDomainModel(): List<VacancyModel> {
    return listOfCompanies.flatMap { company ->
        company.vacancies.map {
            VacancyModel(company.name, company.fieldOfActivity, it.profession, it.level, it.salary, company.contacts)
        }
    }
}