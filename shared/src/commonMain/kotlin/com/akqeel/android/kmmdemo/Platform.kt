package com.akqeel.android.kmmdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform