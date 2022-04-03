package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.loan.LoanAnalysisRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.loan.toDomain
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.loan.RequestLoanPort
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/loan")
class LoanResource(
    val requestLoan: RequestLoanPort
) {

    @PostMapping
    fun requestLoan(
        @RequestBody body: LoanAnalysisRequestDTO
    ) = requestLoan.request(body.toDomain())

}