package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.FooDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Foo
import java.util.*

fun FooDTO.toDomain(): Foo =
    Foo(
        id = UUID.randomUUID(),
        name = name,
        birthDate = birthDate)