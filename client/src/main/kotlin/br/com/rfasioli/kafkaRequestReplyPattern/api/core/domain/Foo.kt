package br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain

import java.time.LocalDate
import java.util.UUID

data class Foo(
    val id: UUID,
    val name: String,
    val birthDate: LocalDate
) {
    fun getAge() =
        LocalDate.now().minusYears(
            birthDate.getYear().toLong())
}
