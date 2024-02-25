package com.example.data.repository

import com.example.data.mappers.mapToDomainModel
import com.example.data.models.Resume
import com.example.domain.entity.ResumeModel
import kotlinx.serialization.json.Json
import com.example.domain.repository.ResumeRepository
import kotlinx.serialization.encodeToString
import java.io.File

class ResumeRepositoryImpl : ResumeRepository {
    private val path = "src/ex5/src/main/kotlin/com/example/data/sources/resume.json"
    private val jsonString = File(path).readText()
    override suspend fun getResume(): ResumeModel {
        val json = Json.decodeFromString<Resume>(jsonString)
        return json.mapToDomainModel()
    }
    override suspend fun saveResume(id: String, resume: ResumeModel) {
        println("Resume with id $id has been updated:")
        val jsonFormat = Json { prettyPrint = true }
        println(jsonFormat.encodeToString(resume))
    }
}
