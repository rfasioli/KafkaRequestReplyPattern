package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.out.persistence.loan

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.domain.Loan
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.out.loan.PersistLoanPort
import org.springframework.stereotype.Component

@Component
class LoanPersitenceAdapter(
    val loanRepository: LoanRepository
): PersistLoanPort {
    override fun create(loan: Loan): Loan =
        loanRepository.save(loan.toLoanDocument())
            .toDomain()

}