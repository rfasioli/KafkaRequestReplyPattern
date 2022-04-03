package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface LoanRepository: MongoRepository<LoanDocument, UUID> {
}