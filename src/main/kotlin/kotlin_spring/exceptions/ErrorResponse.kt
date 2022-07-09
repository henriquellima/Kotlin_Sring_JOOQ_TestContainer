package kotlin_spring.exceptions

class ErrorResponse(
    var status: Int,
    var message: String?,
    var internalCode: String
)