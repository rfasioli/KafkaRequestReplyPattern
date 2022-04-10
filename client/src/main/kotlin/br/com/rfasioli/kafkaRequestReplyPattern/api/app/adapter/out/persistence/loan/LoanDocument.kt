package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.LoanStatus
import org.bson.types.ObjectId
import java.math.BigDecimal
import java.time.LocalDateTime

data class LoanDocument(
    var id: ObjectId?,
    var customer: Customer,
    var amount: BigDecimal,
    var installments: Int,
    var status: LoanStatus,
    var createdDateTime: LocalDateTime,
    var updatedDateTime: LocalDateTime
)

