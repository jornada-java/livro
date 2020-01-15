
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

    public static void main(String[] args) {

        /**
         Declara objetos de sessão com o banco de dados; neste caso, a referência de conexão (Connection) e o gerenciador de consultas (Statement).
         */
        Connection conn = null;
        Statement stmt = null;

        try {
            // Declara-se o Driver específico do banco de dados em uso (MySQL)
            Class.forName("com.mysql.jdbc.Driver");

            String user = "root";
            String password = "root";
            String database = "jornada_java_db";

            String urlConn = String.format(
                    "jdbc:mysql://localhost:3306/%s?useSSL=false&user=%s&password=%s", database, user, password);

            // Obtém-se o objeto gerenciador de conexão, informando uma URL com
            // o nome do banco de dados “jornada_java_db” bem como usuario e senha do SGBD
            conn = DriverManager.getConnection(urlConn);

            // Obtém-se o objeto gerenciador de consultas SQL
            stmt = conn.createStatement();

            // Declara-se uma String com o comando SQL a ser executado
            String sql = "INSERT INTO pessoa (nome) VALUES ('Fulano')";

            // Executa-se o comando SQL declarado anteriormente
            stmt.executeUpdate(sql);

            System.out.println("Registro inserido com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close(); // Fechamento do cursor de Querys
                } catch (SQLException e) {}
            }
            if (conn != null) {
                try {
                    conn.close(); // Fechamento da conexão com o Banco de Dados
                } catch (SQLException e) {}
            }
        }
    }
}