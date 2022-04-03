package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.customer

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Customer
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.exception.CustomerNotFoundException
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer.FindCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer.PersistCustomerPort
import org.bson.types.ObjectId
import org.springframework.stereotype.Component

@Component
class CustomerPersistenceAdapter(
    val customerRepository: CustomerRepository
) : PersistCustomerPort, FindCustomerPort {

    override fun save(customer: Customer): Customer =
        getExistingCustomerDocument(customer).let {
            customerRepository.save(customer.toDocument(it))
        }.toDomain()


    private fun getExistingCustomerDocument(customer: Customer): CustomerDocument? =
        customer.id?.let {
            customerRepository.findById(ObjectId(it))
                .orElse(null)
        }

    override fun find(id: String): Customer =
        customerRepository.findById(ObjectId(id))
            .orElseThrow { CustomerNotFoundException() }
            .toDomain()

}