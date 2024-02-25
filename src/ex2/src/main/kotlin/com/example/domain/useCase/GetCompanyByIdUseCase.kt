package com.example.domain.useCase

import com.example.domain.entity.CompanyModel

interface GetCompanyByIdUseCase {
    suspend fun execute(id: Int?): CompanyModel?
}
