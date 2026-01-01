package com.example.kotlin_lerning.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class TestConsumer {

    @KafkaListener(
        topics = ["test-topic"],
        groupId = "dev-group"
    )
    fun listen(message: String) {
        println("📩 Otrzymano event: $message")
    }
}