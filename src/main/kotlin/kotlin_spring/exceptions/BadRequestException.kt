package kotlin_spring.exceptions

class BadRequestException(override val message: String?, val internalCode: String):Exception(message) {
}