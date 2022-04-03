package br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain

import java.math.BigDecimal

data class LoanRequest(
    val customerId: String,
    val amount: BigDecimal,
    val installments: Int
)
