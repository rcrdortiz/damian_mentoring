package com.rortiz.hello

import com.rortiz.HelloResponseMother
import de.jodamob.kotlin.testrunner.OpenedPackages
import de.jodamob.kotlin.testrunner.SpotlinTestRunner
import org.junit.runner.RunWith
import spock.lang.Specification

@OpenedPackages("com.rortiz")
@RunWith(SpotlinTestRunner.class)
class HelloControllerTest extends Specification {

    def controller = new HelloController()

    def "Greeting case for get endpoint"() {
        given: "We get a greeting"
            def greet = HelloResponseDto.Type.GREETING
        and: "We will expect an OK hello response"
            def expectedResponse = HelloResponseMother.getGreetingHelloResponse()
        when:
            def response = controller.getHello(greet)
        then: "The response is an OK response as expected"
            response == expectedResponse
    }

    def "Hate case for get endpoint"() {
        given: "We are in an odd millisecond"
            def fuck = HelloResponseDto.Type.HATE
        and: "We will expect a KO hello response"
            def expectedResponse = HelloResponseMother.getHateHelloResponse()
        when:
            def response = controller.getHello(fuck)
        then: "The response is a KO response as expected"
            response == expectedResponse
    }
}
