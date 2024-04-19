package com.seunghoon.core.network

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json

internal val ktorClient = HttpClient {
    expectSuccess = true
    install(ContentNegotiation) {
        json()
    }
    install(Logging) {
        logger = object : Logger {
            override fun log(message: String) {
                Log.d("ktor", message)
            }
        }
        level = LogLevel.BODY
    }
    defaultRequest {
        url(BuildConfig.BASE_URL)
        header(HttpHeaders.ContentType, ContentType.Application.Json)
        header(HttpHeaders.Authorization, "Bearer $")
    }
}
