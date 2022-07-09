package kotlin_spring.repository

import kotlin_spring.models.tables.records.TbUsersRecord
import kotlin_spring.models.tables.references.TB_USERS
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepositoryImpl:UserRepository {

    val dbDSL:DSLContext = DBConnection.DBConnection();

    override fun findAll(): List<TbUsersRecord> {
        val users: kotlin.collections.List<TbUsersRecord> = dbDSL.selectFrom(TB_USERS).fetch().into(TbUsersRecord::class.java)

        return users
    }

    override fun findByEmail(email: String?): Optional<TbUsersRecord> {
        val user: org.jooq.Result<TbUsersRecord> = dbDSL.selectFrom(TB_USERS)
            .where(TB_USERS.USER_EMAIL.eq(email)).fetch()

        if (!user.isNotEmpty) {
            return Optional.empty();
        }

        val userDecooded: TbUsersRecord = user[0];

        return Optional.of(userDecooded);
    }

    override fun findByID(id: Int?): Optional<TbUsersRecord> {
        val user: org.jooq.Result<TbUsersRecord> = dbDSL.selectFrom(TB_USERS)
            .where(TB_USERS.USER_ID.eq(id)).fetch()

        if (!user.isNotEmpty) {
            return Optional.empty();
        }

        val userDecooded: TbUsersRecord = user[0];

        return Optional.of(userDecooded);
    }

    override fun findByPhone(phone: String?): Optional<TbUsersRecord> {
        val user: org.jooq.Result<TbUsersRecord> = dbDSL.selectFrom(TB_USERS)
            .where(TB_USERS.USER_PHONE.eq(phone)).fetch()

        if (!user.isNotEmpty) {
            return Optional.empty();
        }

        val userDecooded: TbUsersRecord = user[0];

        return Optional.of(userDecooded);
    }

    override fun findByCpf(cpf: String?): Optional<TbUsersRecord> {
        val user: org.jooq.Result<TbUsersRecord> = dbDSL.selectFrom(TB_USERS)
            .where(TB_USERS.USER_PHONE.eq(cpf)).fetch()

        if (!user.isNotEmpty) {
            return Optional.empty();
        }

        val userDecooded: TbUsersRecord = user[0];

        return Optional.of(userDecooded);
    }

    override fun update(updatedUser: TbUsersRecord?, id: Int?): Int {
        val userID: Int =
            dbDSL.update(TB_USERS)
                 .set(TB_USERS.USER_NAME, updatedUser?.userName)
                 .set( TB_USERS.USER_EMAIL, updatedUser?.userEmail)
                 .set(TB_USERS.USER_PHONE, updatedUser?.userPhone)
                 .set(TB_USERS.USER_CPF, updatedUser?.userCpf)
                 .set(TB_USERS.USER_BIRTHDATE, updatedUser?.userBirthdate)
                 .set( TB_USERS.USER_PASSWORD, updatedUser?.userPassword)
                 .where(TB_USERS.USER_ID.eq(id)).execute();

        return userID;
    }

    override fun register(tbUsersRecord: TbUsersRecord?) {
        val user:
    }
}