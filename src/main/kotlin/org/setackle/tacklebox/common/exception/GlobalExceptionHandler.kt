package org.setackle.tacklebox.common.exception

import org.setackle.tacklebox.common.api.ApiResponse
import org.setackle.tacklebox.common.api.ResponseCode
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleException(e: Exception) =
        ApiResponse.error(ResponseCode.SERVER_ERROR)

    @ExceptionHandler(IllegalArgumentException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleBadRequest(e: IllegalArgumentException) =
        ApiResponse.error(
            ResponseCode.BAD_REQUEST,
            e.message?: ResponseCode.BAD_REQUEST.message
        )

    @ExceptionHandler(NoSuchElementException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleNotFound(e: NoSuchElementException) =
        ApiResponse.error(
            ResponseCode.NOT_FOUND,
            e.message?: ResponseCode.NOT_FOUND.message
        )

    @ExceptionHandler(IllegalStateException::class)
    @ResponseStatus(HttpStatus.CONFLICT)
    fun handleConflict(e: IllegalStateException) =
        ApiResponse.error(
            ResponseCode.CONFLICT,
            e.message?: ResponseCode.CONFLICT.message
        )
}