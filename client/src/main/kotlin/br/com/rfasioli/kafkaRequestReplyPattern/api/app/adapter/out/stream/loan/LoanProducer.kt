package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan.contract.LoanAnalysisRequestDTO
import org.springframework.kafka.core.KafkaTemplate

class LoanProducer(
    val kafkaTemplate: KafkaTemplate<String, LoanAnalysisRequestDTO>
) {

    fun send(LoanAnalysisRe)
}