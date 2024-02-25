package com.example.domain.repository

import com.example.domain.entity.CompanyModel

interface CompanyRepository {
    suspend fun getCompanyList(): List<CompanyModel>
    suspend fun getCompanyById(id: Int?): CompanyModel?
}
