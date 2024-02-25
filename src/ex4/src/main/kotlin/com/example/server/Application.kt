package com.example.server

import com.example.domain.useCase.GetVacancyByIdUseCase
import com.example.data.repository.CompanyRepositoryImpl
import com.example.domain.useCase.GetVacancyByIdUseCaseImpl
import com.example.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    val companyRepository = CompanyRepositoryImpl()
    val listVacanciesUseCase = GetVacancyByIdUseCaseImpl(companyRepository)
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = { module(listVacanciesUseCase) }).start(wait = true)
}

fun Application.module(listVacanciesUseCase: GetVacancyByIdUseCase) {
    configureRouting(listVacanciesUseCase)
    configureSerialization()
}