package com.cosmosentinel.nearEarthObjects.domain

interface NearEarthObjectRepository {

    suspend fun getNearEarthObjects(): List<String>

}
