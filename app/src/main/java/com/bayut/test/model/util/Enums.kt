package com.bayut.test.model.util

object Enums {

    enum class NetworkResponseCodes(val code: Int) {
        UnAuthorizedUser(401),
        SUCCESS(200),
        ERROR(-1)
    }
}