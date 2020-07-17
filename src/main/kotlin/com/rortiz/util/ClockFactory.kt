package com.rortiz.util

import io.micronaut.context.annotation.Factory
import java.time.Clock
import javax.inject.Singleton

@Factory
open class ClockFactory {

    @Singleton
    fun systemUTCClock(): Clock = Clock.systemUTC()
}