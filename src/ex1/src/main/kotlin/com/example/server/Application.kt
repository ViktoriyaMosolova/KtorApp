package com.example.server

import com.example.domain.useCase.GetCompanyListUseCase
import com.example.data.repository.CompanyRepositoryImpl
import com.example.domain.useCase.GetCompanyListUseCaseImpl
import com.example.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main() {
    val companyRepository = CompanyRepositoryImpl()
    val companyListUseCase = GetCompanyListUseCaseImpl(companyRepository)
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = { module(companyListUseCase) }).start(wait = true)
}

fun Application.module(companyListUseCase: GetCompanyListUseCase) {
    configureRouting(companyListUseCase)
    configureSerialization()
}
