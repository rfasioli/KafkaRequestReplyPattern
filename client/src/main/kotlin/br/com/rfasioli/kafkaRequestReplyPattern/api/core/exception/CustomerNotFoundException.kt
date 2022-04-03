package br.com.rfasioli.kafkaRequestReplyPattern.api.core.exception

class CustomerNotFoundException: DataNotFoundException {
    companion object {
        const val MESSAGE: String = "Customer not found"
    }
    constructor() : super(MESSAGE)
    constructor(cause: Throwable?) : super(MESSAGE, cause)
}