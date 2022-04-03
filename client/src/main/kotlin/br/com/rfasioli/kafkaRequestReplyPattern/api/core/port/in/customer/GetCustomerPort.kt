package br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer

interface GetCustomerPort {
    fun get(id: String): Customer
}