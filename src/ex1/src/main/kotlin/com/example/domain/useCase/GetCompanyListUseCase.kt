package com.example.domain.useCase

import com.example.domain.entity.CompanyModel

interface GetCompanyListUseCase {
    suspend fun execute(): List<CompanyModel>
}
