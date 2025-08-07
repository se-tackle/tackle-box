package org.setackle.tacklebox.common.response

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ApiResponse<T>(
    val code: Int,
    val message: String,
    val data: T? = null
) {
    companion object {
        fun <T> success(data: T): ApiResponse<T> =
            ApiResponse(
                code = ResponseCode.SUCCESS.code,
                message = ResponseCode.SUCCESS.message,
                data = data
            )

        fun error(errorCode: ResponseCode): ApiResponse<Nothing> =
            ApiResponse(
                code = errorCode.code,
                message = errorCode.message
            )

        fun error(message: String, errorCode: ResponseCode): ApiResponse<Nothing> =
            ApiResponse(
                code = errorCode.code,
                message = message,
            )
    }
}