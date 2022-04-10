package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan.contract.LoanAnalysisRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan.RequestLoanAnalysisForCustomerPort
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import java.util.function.Function
import java.util.function.Supplier


@Component
class ProduceLoanAnalysisAdapter(
    @Value("spring.application.name") val applicationName: String
): RequestLoanAnalysisForCustomerPort {

    override fun requestAnalysis(loan: Loan) {
        loanAnalysisProducer(loan)
    }

    @Bean
    fun loanAnalysisProducer(): Supplier<Flux<LoanAnalysisRequestDTO>>? {
        return Supplier {
            Flux.interval(Duration.ofSeconds(5))
                .map(Function<Long, Any> { value: Long? ->
                    random.nextInt(
                        1000 - 1
                    ) + 1
                }).log()
        }
    }

}