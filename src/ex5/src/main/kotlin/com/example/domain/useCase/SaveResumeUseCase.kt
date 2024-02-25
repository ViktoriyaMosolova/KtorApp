package com.example.domain.useCase

import com.example.domain.entity.ResumeModel

interface SaveResumeUseCase {
    suspend fun execute(id: String, resume: ResumeModel)
}