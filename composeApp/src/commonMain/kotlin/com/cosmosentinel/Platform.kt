package com.cosmosentinel

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform