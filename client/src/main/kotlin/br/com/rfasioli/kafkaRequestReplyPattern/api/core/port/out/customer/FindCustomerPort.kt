package br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer

interface FindCustomerPort {
    fun find(id: String): Customer
}