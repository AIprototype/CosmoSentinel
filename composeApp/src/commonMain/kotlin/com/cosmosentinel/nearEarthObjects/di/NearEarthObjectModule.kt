package com.cosmosentinel.nearEarthObjects.di

import com.cosmosentinel.nearEarthObjects.data.KtorNearEarthObjectRepo
import com.cosmosentinel.nearEarthObjects.domain.NearEarthObjectRepository
import com.cosmosentinel.nearEarthObjects.presentation.NearEarthObjectViewModel
import io.ktor.client.HttpClient
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
class NearEarthObjectModule {

    @Factory(binds = [NearEarthObjectRepository::class]) //factory here as the repo instance needs to be re-created everytime we inject it
    fun nearEarthObjectRepository(httpClient: HttpClient) = KtorNearEarthObjectRepo(httpClient)

    @KoinViewModel
    fun nearEarthObjectViewModel(nearEarthObjectRepository: NearEarthObjectRepository) =
        NearEarthObjectViewModel(nearEarthObjectRepository)

}
