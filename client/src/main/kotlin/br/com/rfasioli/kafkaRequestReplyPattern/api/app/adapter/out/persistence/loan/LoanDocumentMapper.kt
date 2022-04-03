package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import java.time.LocalDateTime

fun Loan.toLoanDocument(): LoanDocument =
    LoanDocument(
        id,
        customer,
        amount,
        installments,
        status,
        LocalDateTime.now(),
        LocalDateTime.now())

fun LoanDocument.toDomain(): Loan =
    Loan(
        id,
        customer,
        amount,
        installments,
        status
    )
