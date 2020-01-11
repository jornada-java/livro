import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

public class DatabaseTest {

    @Rule //Rule do JUnit 4
    public MySQLContainer mysql = new MySQLContainer();

    @Test
    public void testMySQL() {
        // Quando for executado este método, o banco de dados já estará iniciado
        System.out.println(mysql.getJdbcUrl());
    }

}
