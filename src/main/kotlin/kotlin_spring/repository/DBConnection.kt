package kotlin_spring.repository

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException


class DBConnection {
    companion object {
        fun DBConnection(): DSLContext {
            val url: String = "jdbc:postgresql://localhost:5432/nftcommerce_users";
            val userName: String = "henrique";
            val password: String = "henrique";

            try {
                val conn: Connection = DriverManager.getConnection(url, userName, password);
                val dsl: DSLContext = DSL.using(conn, SQLDialect.POSTGRES);

                return dsl;
            } catch (e: Exception) {
                e.printStackTrace();
                throw SQLException(e.message);
            }
        }
    }
}