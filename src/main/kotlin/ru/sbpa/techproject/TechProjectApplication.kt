package ru.sbpa.techproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TechProjectApplication

fun main(args: Array<String>) {
    runApplication<TechProjectApplication>(*args)
}
