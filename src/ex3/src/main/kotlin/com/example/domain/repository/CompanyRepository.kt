package com.example.domain.repository

import com.example.domain.entity.VacancyModel

interface CompanyRepository {
    suspend fun getListOfVacancies(): List<VacancyModel>
}
