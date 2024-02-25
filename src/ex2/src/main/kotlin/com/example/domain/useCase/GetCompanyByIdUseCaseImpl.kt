package com.example.domain.useCase

import com.example.domain.entity.CompanyModel
import com.example.domain.repository.CompanyRepository

class GetCompanyByIdUseCaseImpl(private val companyRepository: CompanyRepository) : GetCompanyByIdUseCase {
    override suspend fun execute(id: Int?): CompanyModel? {
        return companyRepository.getCompanyById(id)
    }
}
