package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.CreateFooResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.FooDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.toCreateFooResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.toDomain
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.CreateFooPort
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/foo")
class FooResource(
    val createFoo: CreateFooPort
) {

    @PostMapping
    fun create(dto: FooDTO): CreateFooResponseDTO =
        createFoo.apply(dto.toDomain())
            .toCreateFooResponseDTO();

}