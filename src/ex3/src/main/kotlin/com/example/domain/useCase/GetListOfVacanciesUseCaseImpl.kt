package com.example.domain.useCase

import com.example.domain.entity.VacancyModel
import com.example.domain.repository.CompanyRepository

class GetListOfVacanciesUseCaseImpl(private val companyRepository: CompanyRepository) : GetListOfVacanciesUseCase {
    override suspend fun execute(): List<VacancyModel> {
        return companyRepository.getListOfVacancies()
    }
}
