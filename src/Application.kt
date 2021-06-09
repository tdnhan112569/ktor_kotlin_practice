package nhantd.io

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.serialization.*
import nhantd.io.router.customerRouting
import nhantd.io.router.registerCustomerRoutes
import nhantd.io.router.registerOrderRoutes

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    install(CallLogging)
    registerCustomerRoutes()
    registerOrderRoutes()
}
