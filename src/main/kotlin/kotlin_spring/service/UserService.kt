package kotlin_spring.service

import kotlin_spring.DTO.UserDTO
import kotlin_spring.models.tables.records.TbUsersRecord
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable


interface UserService {
    fun getByID(id: Int) : TbUsersRecord;
    fun getAll(pageable: Pageable) : Page<TbUsersRecord>;
    fun save(userDTO: UserDTO) : TbUsersRecord;
    fun verifyFields(userDTO: UserDTO) : Boolean;
}