package com.example.data.repository

import com.example.data.mappers.mapToDomainModel
import com.example.data.models.CompanyList
import com.example.data.sources.companyListJson
import com.example.domain.entity.VacancyModel
import kotlinx.serialization.json.Json
import com.example.domain.repository.CompanyRepository

class CompanyRepositoryImpl : CompanyRepository {
    private val json = Json.decodeFromString<CompanyList>(companyListJson)

    override suspend fun getListOfVacancies(): List<VacancyModel> {
        return json.mapToDomainModel()
    }
}
