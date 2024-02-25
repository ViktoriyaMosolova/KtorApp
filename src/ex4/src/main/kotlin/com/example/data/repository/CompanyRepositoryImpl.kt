package com.example.data.repository

import com.example.data.mappers.mapToDomainModel
import com.example.data.models.CompanyList
import com.example.data.sources.companyListJson
import com.example.domain.entity.VacancyModel
import kotlinx.serialization.json.Json
import com.example.domain.repository.CompanyRepository

class CompanyRepositoryImpl : CompanyRepository {
    private val json = Json.decodeFromString<CompanyList>(companyListJson)

    override suspend fun getVacancyById(id: Int?): VacancyModel? {
        val vacancies = json.listOfCompanies.flatMap { it.vacancies }
        return if(id == null || id < 0 || id >= vacancies.size) null
        else json.mapToDomainModel()[id]
    }
}
