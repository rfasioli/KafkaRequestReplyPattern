package br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.LoanRequest

interface RequestLoanPort {
    fun request(request: LoanRequest): Loan
}