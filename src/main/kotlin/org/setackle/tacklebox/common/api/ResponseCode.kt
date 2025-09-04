package org.setackle.tacklebox.common.api

enum class ResponseCode(
    val code: Int,
    val message: String,
) {
    SUCCESS(200, "요청 성공"),

    BAD_REQUEST(400, "잘못된 요청"),
    NOT_FOUND(404, "요청 결과 찾을 수 없음"),
    CONFLICT(409, "서버 충돌"),

    SERVER_ERROR(500, "서버 에러"),

}