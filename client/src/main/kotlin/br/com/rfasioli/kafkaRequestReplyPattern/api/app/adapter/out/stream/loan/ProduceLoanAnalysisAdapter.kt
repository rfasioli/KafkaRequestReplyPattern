package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.stream.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan.RequestLoanAnalysisForCustomerPort
import org.springframework.stereotype.Component

@Component
class ProduceLoanAnalysisAdapter: RequestLoanAnalysisForCustomerPort {
    override fun requestAnalysis(loan: Loan) {
        TODO("Not yet implemented")
    }
}