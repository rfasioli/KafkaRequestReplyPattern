package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface LoanRepository: MongoRepository<LoanDocument, ObjectId> {
}