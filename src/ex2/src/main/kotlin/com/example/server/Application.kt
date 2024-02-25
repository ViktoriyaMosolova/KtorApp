package com.example.server

import com.example.domain.useCase.GetCompanyByIdUseCase
import com.example.data.repository.CompanyRepositoryImpl
import com.example.domain.useCase.GetCompanyByIdUseCaseImpl
import com.example.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    val companyRepository = CompanyRepositoryImpl()
    val companyListUseCase = GetCompanyByIdUseCaseImpl(companyRepository)
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = { module(companyListUseCase) }).start(wait = true)
}

fun Application.module(companyListUseCase: GetCompanyByIdUseCase) {
    configureRouting(companyListUseCase)
    configureSerialization()
}
