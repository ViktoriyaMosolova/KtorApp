package com.example.domain.useCase

import com.example.domain.entity.VacancyModel

interface GetVacancyByIdUseCase {
    suspend fun execute(id: Int?): VacancyModel?
}
