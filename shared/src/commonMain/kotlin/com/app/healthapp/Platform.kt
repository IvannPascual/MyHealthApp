package com.app.healthapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform