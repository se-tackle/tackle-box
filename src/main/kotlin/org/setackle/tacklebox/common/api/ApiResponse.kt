package org.setackle.tacklebox.common.api

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

        fun success(): ApiResponse<Unit> =
            ApiResponse(
                code = ResponseCode.SUCCESS.code,
                message = ResponseCode.SUCCESS.message,
            )

        fun error(errorCode: ResponseCode): ApiResponse<Nothing> =
            ApiResponse(
                code = errorCode.code,
                message = errorCode.message
            )

        fun error(errorCode: ResponseCode, message: String): ApiResponse<Nothing> =
            ApiResponse(
                code = errorCode.code,
                message = message,
            )
    }
}