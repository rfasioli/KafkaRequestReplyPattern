package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.CreateFooResponseDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Foo

fun Foo.toCreateFooResponseDTO(): CreateFooResponseDTO =
        CreateFooResponseDTO(id)