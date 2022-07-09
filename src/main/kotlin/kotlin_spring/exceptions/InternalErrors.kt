package kotlin_spring.exceptions

enum class InternalErrors(val code: String, val message: String) {
    A100("A100","User [%s] does not exists"),
    A200("A200","User [%s] already exists")
}
