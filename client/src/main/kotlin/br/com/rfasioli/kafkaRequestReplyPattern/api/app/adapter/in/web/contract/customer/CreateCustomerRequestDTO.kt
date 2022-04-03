package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer

import java.time.LocalDate

data class CreateCustomerRequestDTO(
    var name: String,
    var birthDate: LocalDate
)
