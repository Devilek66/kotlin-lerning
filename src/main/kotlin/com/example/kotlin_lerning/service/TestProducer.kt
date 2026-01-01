package com.example.kotlin_lerning.service

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class TestProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    fun sendTestEvent() {
        kafkaTemplate.send("test-topic", "hello from dev kafka")
    }
}