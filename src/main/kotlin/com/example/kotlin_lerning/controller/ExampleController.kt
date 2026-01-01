package com.example.kotlin_lerning.controller

import com.example.kotlin_lerning.service.TestProducer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleController(val producer: TestProducer) {
    @GetMapping()
    fun get(): ExampleDto {
        return ExampleDto("John","Doe");
    }

    @GetMapping("/send")
    fun send(){
        producer.sendTestEvent();
    }
}