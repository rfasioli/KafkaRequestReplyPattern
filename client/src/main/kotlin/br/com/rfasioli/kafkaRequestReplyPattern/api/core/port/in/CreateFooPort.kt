package br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Foo

interface CreateFooPort {
    fun apply(foo: Foo): Foo
}