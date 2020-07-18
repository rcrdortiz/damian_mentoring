package com.rortiz.hello

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/injection")
class HelloControllerWithCollaborator(
    // This will be injected thanks to the @Controller annotation, you can also use @Singleton annotation
    // to get things injected.
    private val mapper: Mapper
) {

    @Get("{type}")
    fun getHello(type: HelloResponseDto.Type): HelloResponseDto = HelloResponseDto(
        message = mapper.mapToMessage(type),
        code = mapper.mapToCode(type)
    )
}