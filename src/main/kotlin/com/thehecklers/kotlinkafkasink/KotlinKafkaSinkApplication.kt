package com.thehecklers.kotlinkafkasink

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Sink

@EnableBinding(Sink::class)
@SpringBootApplication
class KotlinKafkaSinkApplication

fun main(args: Array<String>) {
    runApplication<KotlinKafkaSinkApplication>(*args)
}
