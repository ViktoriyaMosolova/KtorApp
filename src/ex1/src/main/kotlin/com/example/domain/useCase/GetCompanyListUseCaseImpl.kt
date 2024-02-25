package com.example.domain.useCase

import com.example.domain.entity.CompanyModel
import com.example.domain.repository.CompanyRepository

class GetCompanyListUseCaseImpl(private val companyRepository: CompanyRepository) : GetCompanyListUseCase {
    override suspend fun execute(): List<CompanyModel> {
        return companyRepository.getCompanyList()
    }
}
