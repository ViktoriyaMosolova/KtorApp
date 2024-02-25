package com.example.domain.useCase

import com.example.domain.entity.VacancyModel

interface GetListOfVacanciesUseCase {
    suspend fun execute(): List<VacancyModel>
}
