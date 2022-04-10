package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import org.bson.types.ObjectId
import java.time.LocalDateTime

fun Loan.toLoanDocument(): LoanDocument =
    LoanDocument(
        id?.let { ObjectId(it) },
        customer,
        amount,
        installments,
        status,
        LocalDateTime.now(),
        LocalDateTime.now())

fun LoanDocument.toDomain(): Loan =
    Loan(
        id?.let { it.toHexString() },
        customer,
        amount,
        installments,
        status
    )
