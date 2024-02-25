package com.example.server.plugins

import com.example.domain.useCase.GetCompanyByIdUseCase
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(companyListUseCase: GetCompanyByIdUseCase) {
    routing {
        get("/company/{id}") {
            val companyId = call.parameters["id"]?.toIntOrNull()
            val companyList = companyListUseCase.execute(companyId)
            if (companyList != null) {
                call.respond(companyList)
            } else {
                call.respondText("")
            }
        }
    }
}
