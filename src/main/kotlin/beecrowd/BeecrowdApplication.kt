package beecrowd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeecrowdApplication

fun main(args: Array<String>) {
	runApplication<BeecrowdApplication>(*args)
}
