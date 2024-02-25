package com.example.domain.useCase

import com.example.domain.entity.VacancyModel
import com.example.domain.repository.CompanyRepository

class GetVacancyByIdUseCaseImpl(private val companyRepository: CompanyRepository) : GetVacancyByIdUseCase {
    override suspend fun execute(id: Int?): VacancyModel? {
        return companyRepository.getVacancyById(id)
    }
}
