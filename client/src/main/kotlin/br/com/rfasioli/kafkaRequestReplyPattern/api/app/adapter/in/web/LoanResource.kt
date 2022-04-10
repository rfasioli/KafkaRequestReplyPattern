package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web

import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.contract.loan.LoanAnalysisRequestDTO
import br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web.mapper.loan.toDomain
import br.com.rfasioli.kafkaRequestReplyPattern.api.core.port.`in`.loan.RequestLoanPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/loan")
class LoanResource(
    val requestLoan: RequestLoanPort
) {

    @PostMapping
    fun requestLoan(
        @RequestBody body: LoanAnalysisRequestDTO,
        request: HttpServletRequest
    ): ResponseEntity<Void> =
        requestLoan.request(body.toDomain())
            .let {  ResponseEntity.created(
                URI.create(request.requestURL.append("/${it.id}").toString())
            ).build() }

}