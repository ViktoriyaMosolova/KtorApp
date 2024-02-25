package com.example.domain.repository

import com.example.domain.entity.VacancyModel

interface CompanyRepository {
    suspend fun getVacancyById(id: Int?): VacancyModel?
}
