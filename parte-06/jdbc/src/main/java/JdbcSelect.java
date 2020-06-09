
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {

    public static void main(String[] args) throws Exception {

        // Declara-se o Driver específico do banco de dados em uso (MySQL)
            Class.forName("com.mysql.jdbc.Driver");

        String user = "root";
        String password = "root";
        String database = "jornada_java_db";

        String urlConn = String.format(
                "jdbc:mysql://localhost:3306/%s?useSSL=false&user=%s&password=%s", database, user, password);

        try (
                Connection conn = DriverManager.getConnection(urlConn);

                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM pessoa")) {

            while (rs.next()) { // Itera em cada registro retornado pela consulta

                // Exibe o valor da coluna “nome” de cada registro
                System.out.println("Nome: " + rs.getString("nome"));
            }
        }
    }

}