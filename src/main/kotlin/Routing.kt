package com.example


import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

inline fun <reified T> Any.isOfType(): Boolean = this is T
fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World! Is This a RoutingCall: ${call.isOfType<RoutingCall>()}")
        }
    }
}
