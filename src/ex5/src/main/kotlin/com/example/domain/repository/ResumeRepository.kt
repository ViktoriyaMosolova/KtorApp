package com.example.domain.repository

import com.example.domain.entity.ResumeModel

interface ResumeRepository {
    suspend fun getResume(): ResumeModel
    suspend fun saveResume(id: String, resume: ResumeModel)
}
