package com.joao01sb.eventos.data.localdate.service

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject
import javax.inject.Singleton

private const val BASE_URL = ""

@Singleton
class Service @Inject constructor(
    private val client: HttpClient
) {
    suspend fun findEnventos(query: String): Unit {
        return client.get("$BASE_URL/$query/json").body()
    }
}