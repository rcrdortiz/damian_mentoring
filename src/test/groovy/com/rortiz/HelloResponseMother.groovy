package com.rortiz

import com.rortiz.hello.HelloController
import com.rortiz.hello.HelloResponseDto

class HelloResponseMother {

    static HelloResponseDto getGreetingHelloResponse() {
        return new HelloResponseDto(
            HelloController.HELLO_MESSAGE,
            HelloResponseDto.Code.OK
        )
    }

    static HelloResponseDto getHateHelloResponse() {
        return new HelloResponseDto(
            HelloController.FUCK_MESSAGE,
            HelloResponseDto.Code.KO
        )
    }
}
