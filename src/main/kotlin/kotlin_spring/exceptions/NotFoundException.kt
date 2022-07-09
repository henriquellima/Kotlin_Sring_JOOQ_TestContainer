package kotlin_spring.exceptions

class NotFoundException(override val message: String, val internalCode: String): Exception(message) {

}