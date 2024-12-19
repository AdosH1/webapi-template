package change.`this`.`package`.rest

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        applicationRouting()
    }
    install(StatusPages) {
        exception<BadRequestException> { call, cause ->
            cause.fillInStackTrace()
            call.respond(HttpStatusCode.BadRequest)
        }
    }
}