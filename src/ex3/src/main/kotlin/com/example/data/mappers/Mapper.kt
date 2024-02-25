package com.example.data.mappers

import com.example.data.models.CompanyList
import com.example.domain.entity.VacancyModel

fun CompanyList.mapToDomainModel(): List<VacancyModel> {
//  flatMap объединяет все элементы вложенных коллекций в одну коллекцию.
    return listOfCompanies.flatMap { company ->
        company.vacancies.map {
            VacancyModel(company.name, it.profession, it.level, it.salary)
        }
    }
}