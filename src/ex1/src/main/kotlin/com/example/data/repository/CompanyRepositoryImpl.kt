package com.example.data.repository

import com.example.data.mappers.mapToDomainModel
import com.example.data.models.CompanyList
import com.example.data.sources.companyListJson
import com.example.domain.entity.CompanyModel
import kotlinx.serialization.json.Json
import com.example.domain.repository.CompanyRepository

class CompanyRepositoryImpl : CompanyRepository {
    override suspend fun getCompanyList(): List<CompanyModel> {
        val json = Json.decodeFromString<CompanyList>(companyListJson)
        return json.mapToDomainModel()
    }
}
