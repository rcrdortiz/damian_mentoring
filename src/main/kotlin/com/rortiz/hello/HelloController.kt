package com.rortiz.hello

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/")
class HelloController {

    @Get("{type}")
    fun getHello(type: HelloResponseDto.Type): HelloResponseDto = HelloResponseDto(
        message = type.mapToMessage(),
        code = type.mapToCode()
    )

    @Post
    fun postHello(): HelloResponseDto = HelloResponseDto(
        message = FUCK_MESSAGE,
        code = HelloResponseDto.Code.OK
    )

    private fun HelloResponseDto.Type.mapToCode(): HelloResponseDto.Code = when(this) {
        HelloResponseDto.Type.GREETING -> HelloResponseDto.Code.OK
        HelloResponseDto.Type.HATE -> HelloResponseDto.Code.KO
    }

    private fun HelloResponseDto.Type.mapToMessage(): String = when(this) {
        HelloResponseDto.Type.GREETING -> HELLO_MESSAGE
        HelloResponseDto.Type.HATE -> FUCK_MESSAGE
    }

    companion object {
        const val HELLO_MESSAGE = "Hello World!"
        const val FUCK_MESSAGE = "Fuck You!"
    }
}
