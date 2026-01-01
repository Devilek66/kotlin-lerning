package com.example.kotlin_lerning

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<KotlinLerningApplication>().with(TestcontainersConfiguration::class).run(*args)
}
