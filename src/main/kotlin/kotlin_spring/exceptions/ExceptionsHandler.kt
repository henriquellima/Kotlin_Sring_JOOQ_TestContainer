package kotlin_spring.exceptions

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ExceptionsHandler {
    @ExceptionHandler(BadRequestException::class)
    fun BadRequestException(e: BadRequestException, request: WebRequest): ResponseEntity<ErrorResponse>{
        return ResponseEntity.status(400).body(ErrorResponse(400, e.message, e.internalCode))
    }

    @ExceptionHandler(NotFoundException::class)
    fun NotFoundException(e: NotFoundException, request: WebRequest): ResponseEntity<ErrorResponse>{
        return ResponseEntity.status(404).body(ErrorResponse(404, e.message, e.internalCode))
    }

    @ExceptionHandler(Exception::class)
    fun Exception(e: Exception, request: WebRequest): ResponseEntity<ErrorResponse> {
        return ResponseEntity.status(500).body(ErrorResponse(500, e.message, "0000"))
    }
}