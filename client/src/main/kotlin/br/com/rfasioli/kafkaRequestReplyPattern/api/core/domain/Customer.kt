package br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain

import java.time.LocalDate

data class Customer(
    val id: String?,
    val name: String,
    val birthDate: LocalDate
) {
    fun getAge() =
        LocalDate.now().minusYears(
            birthDate.getYear().toLong())
}
