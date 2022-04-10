package br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain

import java.math.BigDecimal

data class Loan(
    val id: String?,
    val customer: Customer,
    val amount: BigDecimal,
    val installments: Int,
    val status: LoanStatus
) {
    companion object {
        fun build(
            loanRequest: LoanRequest,
            customer: Customer
        ): Loan =
            Loan(
                customer = customer,
                amount = loanRequest.amount,
                installments = loanRequest.installments,
                status = LoanStatus.PENDING,
                id = null
            )
    }
}
