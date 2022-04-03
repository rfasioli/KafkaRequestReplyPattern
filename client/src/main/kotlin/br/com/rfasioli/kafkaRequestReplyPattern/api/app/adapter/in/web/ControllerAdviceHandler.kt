package br.com.rfasioli.kafkaRequestReplyPattern.api.app.adapter.`in`.web

import br.com.rfasioli.kafkaRequestReplyPattern.api.core.exception.DataNotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class ControllerAdviceHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [ DataNotFoundException::class ])
    fun handleUserAlreadyExists(ex: DataNotFoundException, request: WebRequest): ResponseEntity<Void> =
        ResponseEntity.noContent().build()

}