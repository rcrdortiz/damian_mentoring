package com.rortiz.hello

data class HelloResponseDto(
    val message: String,
    val code: Code
) {
    enum class Code { OK, KO }

    enum class Type { GREETING, HATE }
}