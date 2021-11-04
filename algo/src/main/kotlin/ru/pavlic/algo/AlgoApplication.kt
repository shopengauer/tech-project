package ru.pavlic.algo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class AlgoApplication

fun main(args: Array<String>) {
    runApplication<AlgoApplication>(*args)
}
