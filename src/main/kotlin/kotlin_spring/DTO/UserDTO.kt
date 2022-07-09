package kotlin_spring.DTO

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin_spring.models.tables.records.TbUsersRecord
import org.hibernate.validator.constraints.br.CPF
import java.sql.Timestamp
import java.time.LocalDateTime
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UserDTO (
    var id: Int?,
    @field:NotBlank
    var name: String?,
    @field:NotNull
    var birthdate: LocalDateTime?,
    @field:NotBlank @field:CPF
    var cpf: String?,
    @field:NotBlank @field:Email
    var email: String?,
    @field:NotBlank
    var phone: String?
    ){

    constructor():this(null,null,null,null,null,null)

    constructor(record: TbUsersRecord) : this() {
        this.id = record.userId;
        this.name = record.userName;
        this.phone = record.userPhone;
        this.email = record.userEmail;
        this.cpf = record.userCpf;
        this.birthdate = record.userBirthdate;
    }

}
