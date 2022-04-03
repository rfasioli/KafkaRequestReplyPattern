package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CustomerDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer

fun Customer.toCustomerDTO(): CustomerDTO =
    CustomerDTO(id, name, birthDate)