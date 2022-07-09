package kotlin_spring.service

import kotlin_spring.DTO.UserDTO
import kotlin_spring.exceptions.BadRequestException
import kotlin_spring.exceptions.InternalErrors
import kotlin_spring.models.tables.records.TbUsersRecord
import kotlin_spring.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserServiceImpl (
    @Autowired
    private val userRepository:UserRepository
) : UserService {

    override fun getByID(id: Int): TbUsersRecord {
        val userOP:Optional<TbUsersRecord> = userRepository.findByID(id);
        if(userOP.isEmpty){
            throw BadRequestException(InternalErrors.A100.message.format(id), InternalErrors.A100.code)
        }
        return userOP.get();
    }

    override fun getAll(pageable: Pageable): Page<TbUsersRecord> {
        TODO("Not yet implemented")
    }

    override fun save(userDTO: UserDTO): TbUsersRecord {
        TODO("Not yet implemented")
    }

    override fun verifyFields(userDTO: UserDTO): Boolean {
        TODO("Not yet implemented")
    }

}