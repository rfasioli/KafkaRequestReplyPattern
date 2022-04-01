package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract

import java.time.LocalDate
import java.util.*

data class FooDTO(
    var id: UUID?,
    var name: String,
    var birthDate: LocalDate
)
