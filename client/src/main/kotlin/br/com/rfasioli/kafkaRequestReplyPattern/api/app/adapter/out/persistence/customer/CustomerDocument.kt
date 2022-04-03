package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.customer

import org.bson.types.ObjectId
import java.time.LocalDate
import java.time.LocalDateTime

data class CustomerDocument(
    var id: ObjectId?,
    var name: String,
    var birthDate: LocalDate,
    var createdDateTime: LocalDateTime,
    var updatedDateTime: LocalDateTime
)
