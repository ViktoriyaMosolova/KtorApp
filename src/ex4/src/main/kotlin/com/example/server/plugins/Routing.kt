package com.example.server.plugins

import com.example.domain.useCase.GetVacancyByIdUseCase
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(companyListUseCase: GetVacancyByIdUseCase) {
    routing {
        get("/vacancies/{id}") {
            val vacancyId = call.parameters["id"]?.toIntOrNull()
            val listVacancies = companyListUseCase.execute(vacancyId)
            if (listVacancies != null) {
                call.respond(listVacancies)
            } else {
                call.respondText("")
            }
        }
    }
}
