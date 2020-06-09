import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

public class TesteMySQL {

    @ClassRule //Rule do JUnit 4
    public static MySQLContainer mysql = new MySQLContainer();

    @Test
    public void testeMySQL() {
        // Quando for executado este método, o banco de dados já estará iniciado
        System.out.println(mysql.getJdbcUrl());
    }

}
