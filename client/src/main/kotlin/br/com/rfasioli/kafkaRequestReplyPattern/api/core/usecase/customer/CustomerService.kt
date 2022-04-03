package br.com.rfasioli.kafkaRequestReplyPattern.api.core.usecase.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.customer.CreateCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.customer.GetCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer.FindCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer.PersistCustomerPort
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val persistFoo: PersistCustomerPort,
    val findCustomerPort: FindCustomerPort
): CreateCustomerPort, GetCustomerPort {

    override fun createFoo(customer: Customer): Customer =
        persistFoo.save(customer)

    override fun get(id: String): Customer =
        findCustomerPort.find(id)

}
