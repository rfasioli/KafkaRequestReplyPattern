package br.com.rfasioli.kafkaRequestReplyPattern.api.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = [ "br.com.rfasioli.kafkaRequestReplyPattern.api" ])
class KafkaRequestReplyPatternApplication

fun main(args: Array<String>) {
	runApplication<KafkaRequestReplyPatternApplication>(*args)
}
