package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.LoanStatus
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

data class LoanDocument(
    var id: UUID,
    var customer: Customer,
    var amount: BigDecimal,
    var installments: Int,
    var status: LoanStatus,
    var createdDateTime: LocalDateTime,
    var updatedDateTime: LocalDateTime
)

