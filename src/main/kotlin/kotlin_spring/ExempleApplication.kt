package kotlin_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExempleApplication

fun main(args: Array<String>) {
	runApplication<ExempleApplication>(*args)
}
