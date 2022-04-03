package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer

import java.time.LocalDate
import java.util.*

data class CustomerDTO(
    var id: String?,
    var name: String,
    var birthDate: LocalDate
)
