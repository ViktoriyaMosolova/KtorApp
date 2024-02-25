package com.example.server.plugins

import com.example.domain.useCase.GetCompanyListUseCase
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(companyListUseCase: GetCompanyListUseCase) {
    routing {
        get("/company") {
            val companyList = companyListUseCase.execute()
            call.respond(companyList)
        }
    }
}