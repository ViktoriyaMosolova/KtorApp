package com.example.server

import com.example.domain.useCase.GetResumeUseCase
import com.example.data.repository.ResumeRepositoryImpl
import com.example.domain.useCase.GetResumeUseCaseImpl
import com.example.domain.useCase.SaveResumeUseCase
import com.example.domain.useCase.SaveResumeUseCaseImpl
import com.example.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    val resumeRepository = ResumeRepositoryImpl()
    val getResumeUseCase = GetResumeUseCaseImpl(resumeRepository)
    val saveResumeUseCase = SaveResumeUseCaseImpl(resumeRepository)
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = { module(getResumeUseCase, saveResumeUseCase) }).start(wait = true)
}

fun Application.module(companyListUseCase: GetResumeUseCase, saveResumeUseCase: SaveResumeUseCase) {
    configureRouting(companyListUseCase, saveResumeUseCase)
    configureSerialization()
}
