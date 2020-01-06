

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        String user = "root";
        String password = "root";
        String database = "foo_db";

        String urlConn = String.format(
                "jdbc:mysql://localhost:3306/%s?useSSL=false&user=%s&password=%s", database, user, password);

        try (
                Connection conn = DriverManager.getConnection(urlConn);

                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM foo")) {

            while (rs.next()) { // Itera em cada registro retornado pela consulta

                // Exibe o valor da coluna “foo_name” de cada registro
                System.out.println("Foo Name: " + rs.getString("foo_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}