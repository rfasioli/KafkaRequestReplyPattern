package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CreateCustomerRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer

fun CreateCustomerRequestDTO.toDomain(): Customer = Customer(
        id = null,
        name,
        birthDate)
