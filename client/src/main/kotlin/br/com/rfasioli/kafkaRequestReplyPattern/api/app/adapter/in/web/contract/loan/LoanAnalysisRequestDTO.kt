package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.loan

import java.math.BigDecimal

data class LoanAnalysisRequestDTO(
    var customerId: String,
    var amount: BigDecimal,
    var installments: Int
)
