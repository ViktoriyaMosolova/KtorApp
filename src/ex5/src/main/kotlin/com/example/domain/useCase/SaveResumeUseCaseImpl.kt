package com.example.domain.useCase

import com.example.domain.entity.ResumeModel
import com.example.domain.repository.ResumeRepository

class SaveResumeUseCaseImpl(private val resumeRepository: ResumeRepository): SaveResumeUseCase {
    override suspend fun execute(id: String, resume: ResumeModel) {
        resumeRepository.saveResume(id, resume)
    }
}