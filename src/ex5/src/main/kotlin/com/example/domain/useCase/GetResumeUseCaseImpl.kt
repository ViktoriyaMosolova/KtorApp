package com.example.domain.useCase

import com.example.domain.entity.ResumeModel
import com.example.domain.repository.ResumeRepository

class GetResumeUseCaseImpl(private val resumeRepository: ResumeRepository) : GetResumeUseCase {
    override suspend fun execute(): ResumeModel {
        return resumeRepository.getResume()
    }
}
