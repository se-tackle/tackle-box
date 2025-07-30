package org.swenbe.tacklebox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TackleBoxApplication

fun main(args: Array<String>) {
    runApplication<TackleBoxApplication>(*args)
}
