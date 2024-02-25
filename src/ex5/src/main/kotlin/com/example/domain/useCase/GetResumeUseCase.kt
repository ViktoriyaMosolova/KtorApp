package com.example.domain.useCase

import com.example.domain.entity.ResumeModel

interface GetResumeUseCase {
    suspend fun execute(): ResumeModel
}
