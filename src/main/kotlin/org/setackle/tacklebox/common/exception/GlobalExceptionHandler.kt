package org.setackle.tacklebox.common.exception

import org.setackle.tacklebox.common.response.ApiResponse
import org.setackle.tacklebox.common.response.ResponseCode
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ResponseEntity<ApiResponse<Nothing>> =
        ResponseEntity(
            ApiResponse.error(ResponseCode.SERVER_ERROR),
            HttpStatus.INTERNAL_SERVER_ERROR
        )
}