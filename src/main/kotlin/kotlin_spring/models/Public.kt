/*
 * This file is generated by jOOQ.
 */
package kotlin_spring.models


import kotlin.collections.List

import kotlin_spring.models.sequences.TB_USERS_USER_ID_SEQ
import kotlin_spring.models.tables.TbUsers

import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC = Public()
    }

    /**
     * The table <code>public.tb_users</code>.
     */
    val TB_USERS get() = TbUsers.TB_USERS

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getSequences(): List<Sequence<*>> = listOf(
        TB_USERS_USER_ID_SEQ
    )

    override fun getTables(): List<Table<*>> = listOf(
        TbUsers.TB_USERS
    )
}
