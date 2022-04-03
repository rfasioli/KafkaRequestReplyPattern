package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CreateCustomerRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CreateCustomerResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.customer.CustomerDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.customer.toCreateCustomerResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.customer.toCustomerDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.toDomain
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.customer.CreateCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.customer.GetCustomerPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/customer")
class CustomerResource(
    val createCustomer: CreateCustomerPort,
    val getCustomer: GetCustomerPort
) {

    @PostMapping
    fun create(
        @RequestBody dto: CreateCustomerRequestDTO,
        request: HttpServletRequest
    ): ResponseEntity<CreateCustomerResponseDTO> =
        createCustomer.createFoo(dto.toDomain())
            .toCreateCustomerResponseDTO()
            .let { ResponseEntity.created(
                URI.create(request.requestURL.append("/${it.id}").toString())
            ).body(it) }

    @GetMapping("/{id}")
    fun get(@PathVariable id: String): ResponseEntity<CustomerDTO> =
        getCustomer.get(id).toCustomerDTO()
            .let { ResponseEntity.ok(it) }

}
