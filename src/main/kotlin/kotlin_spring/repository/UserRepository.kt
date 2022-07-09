package kotlin_spring.repository

import kotlin_spring.models.tables.records.TbUsersRecord
import java.util.Optional


interface UserRepository {
    fun findAll(): List<TbUsersRecord>;
    fun findByEmail(email: String?): Optional<TbUsersRecord>;
    fun findByID(id: Int?): Optional<TbUsersRecord>;
    fun findByPhone(phone: String?): Optional<TbUsersRecord>;
    fun findByCpf(cpf: String?): Optional<TbUsersRecord>;
    fun update(tbUsersRecord: TbUsersRecord?, id: Int?): Int
    fun register(tbUsersRecord: TbUsersRecord?)
}