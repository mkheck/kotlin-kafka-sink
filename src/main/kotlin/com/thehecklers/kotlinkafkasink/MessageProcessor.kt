package com.thehecklers.kotlinkafkasink

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.stereotype.Component

@Component
class MessageProcessor(private val sink: Sink) {
    @StreamListener(Sink.INPUT)
    fun handle(person: Person) = println("Received $person")
}