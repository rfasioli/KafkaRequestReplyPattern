package br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan

interface PersistLoanPort {
    fun create(loan: Loan): Loan
}