/*
 * This file is generated by jOOQ.
 */
package kotlin_spring.models.sequences


import kotlin_spring.models.Public

import org.jooq.Sequence
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType



/**
 * The sequence <code>public.tb_users_user_id_seq</code>
 */
val TB_USERS_USER_ID_SEQ: Sequence<Int> = Internal.createSequence("tb_users_user_id_seq", Public.PUBLIC, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null)