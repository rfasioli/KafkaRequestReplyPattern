package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.loan.LoanAnalysisRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.LoanRequest

fun LoanAnalysisRequestDTO.toDomain(): LoanRequest =
    LoanRequest(
        customerId,
        amount,
        installments)