package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer
import org.bson.types.ObjectId
import java.time.LocalDateTime
import java.util.*

fun Customer.toDocument(): CustomerDocument =
    CustomerDocument(
        id?.let { ObjectId(id) },
        name,
        birthDate,
        LocalDateTime.now(),
        LocalDateTime.now())

fun Customer.toDocument(customerDocument: CustomerDocument?): CustomerDocument =
    CustomerDocument(
        customerDocument?.id,
        name,
        birthDate,
        customerDocument?.createdDateTime ?: LocalDateTime.now(),
        LocalDateTime.now())

fun CustomerDocument.toDomain(): Customer =
    Customer (
        id?.toHexString(),
        name,
        birthDate)
