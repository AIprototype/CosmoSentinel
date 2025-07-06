package com.cosmosentinel.core.di

import com.cosmosentinel.nearEarthObjects.di.NearEarthObjectModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.ksp.generated.module

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(
            AppModule().module,
            NearEarthObjectModule().module
        )
    }
}
