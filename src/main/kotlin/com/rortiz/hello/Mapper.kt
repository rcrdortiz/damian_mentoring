package com.rortiz.hello

class Mapper {

    fun mapToMessage(type: HelloResponseDto.Type): String = when (type) {
        HelloResponseDto.Type.GREETING -> HELLO_MESSAGE
        HelloResponseDto.Type.HATE -> FUCK_MESSAGE
    }

    fun mapToCode(type: HelloResponseDto.Type): HelloResponseDto.Code = when (type) {
        HelloResponseDto.Type.GREETING -> HelloResponseDto.Code.OK
        HelloResponseDto.Type.HATE -> HelloResponseDto.Code.KO
    }

    companion object {
        const val HELLO_MESSAGE = "Hello World!"
        const val FUCK_MESSAGE = "Fuck You!"
    }
}