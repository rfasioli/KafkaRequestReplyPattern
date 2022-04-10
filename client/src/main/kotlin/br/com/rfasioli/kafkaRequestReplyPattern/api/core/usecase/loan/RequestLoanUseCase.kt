package br.com.rfasioli.kafkaRequestReplyPattern.api.core.usecase.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.LoanRequest
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.loan.RequestLoanPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.customer.FindCustomerPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan.PersistLoanPort
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan.RequestLoanAnalysisForCustomerPort
import org.springframework.stereotype.Service

@Service
class RequestLoanUseCase(
    val findCustomer: FindCustomerPort,
    val persistLoan: PersistLoanPort,
    val requestLoanAnalysisForCustomer: RequestLoanAnalysisForCustomerPort
): RequestLoanPort {

    override fun request(request: LoanRequest): Loan =
        findCustomer.find(request.customerId)
            .let { persistLoan.create(Loan.build(request, it)) }
            .also { requestLoanAnalysisForCustomer.requestAnalysis(it) }

}