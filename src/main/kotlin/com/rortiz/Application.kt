package com.rortiz

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
            .packages("com.rortiz")
            .mainClass(Application.javaClass)
            .start()
    }
}