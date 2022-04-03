package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CreateCustomerResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer

fun Customer.toCreateCustomerResponseDTO(): CreateCustomerResponseDTO =
        CreateCustomerResponseDTO(id)