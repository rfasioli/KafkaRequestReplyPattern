package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence"])
class MongoConfiguration  {
    constructor() {
        println("MongoConfiguration started")
    }
}
