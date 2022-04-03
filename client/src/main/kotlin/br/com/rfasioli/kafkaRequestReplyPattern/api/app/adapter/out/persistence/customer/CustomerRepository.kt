package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.customer

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository: MongoRepository<CustomerDocument, ObjectId> {
}