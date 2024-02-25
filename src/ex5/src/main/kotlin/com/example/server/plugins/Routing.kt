package com.example.server.plugins

import com.example.domain.entity.ResumeModel
import com.example.domain.useCase.GetResumeUseCase
import com.example.domain.useCase.SaveResumeUseCase
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.util.*

fun Application.configureRouting(getResumeUseCase: GetResumeUseCase, saveResumeUseCase: SaveResumeUseCase) {
    routing {
        get("/resume") {
            val companyList = getResumeUseCase.execute()
            call.respond(companyList)
        }
        post("/resume") {
            val resume = call.receive<ResumeModel>()
            call.respond(resume)
            val id = UUID.randomUUID().toString()
            saveResumeUseCase.execute(id, resume)
        }
    }
}
