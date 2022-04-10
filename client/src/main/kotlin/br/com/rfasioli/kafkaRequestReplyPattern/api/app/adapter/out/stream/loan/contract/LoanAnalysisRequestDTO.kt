package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan.contract

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan

data class LoanAnalysisRequestDTO(
    val loan: Loan,
    val responseGroup: String
)
