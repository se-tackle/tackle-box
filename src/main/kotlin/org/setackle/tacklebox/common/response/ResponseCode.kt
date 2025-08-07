package org.setackle.tacklebox.common.response

enum class ResponseCode(
    val code: Int,
    val message: String,
) {
    SUCCESS(200, "요청 성공"),

    BAD_REQUEST(400, "잘못된 요청"),
    SERVER_ERROR(500, "서버 에러")

}