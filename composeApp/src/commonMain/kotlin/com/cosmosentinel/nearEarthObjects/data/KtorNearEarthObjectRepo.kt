package com.cosmosentinel.nearEarthObjects.data

import com.cosmosentinel.nearEarthObjects.domain.NearEarthObjectRepository
import io.ktor.client.HttpClient

class KtorNearEarthObjectRepo(
    private val httpClient: HttpClient
) : NearEarthObjectRepository {

    override suspend fun getNearEarthObjects(): List<String> {
        return (1..10).map {
            "Space Object $it"
        }
    }
}
