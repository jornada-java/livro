import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.flywaydb.core.Flyway;
import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

public class TesteMigracaoDados {

    @ClassRule
    public static MySQLContainer mysql = new MySQLContainer();

    @Test
    public void testeMySQL() {
        Flyway f = new Flyway(Flyway.configure().dataSource(mysql.getJdbcUrl()
                , mysql.getUsername(), mysql.getPassword()));
        f.migrate();

        //Verificar migração
        verificaTabelaMigracao(mysql);
    }

    public void verificaTabelaMigracao(MySQLContainer mysql) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            fail();
        }

        try (Connection conn = DriverManager.getConnection(mysql.getJdbcUrl()
                , mysql.getUsername(), mysql.getPassword());
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO")) {
            rs.next();

            assertEquals(rs.getString("NOME"), "SANDRO");

        } catch (SQLException ex) {
            fail();
        }
    }

}
