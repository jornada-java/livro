import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Excecao01 {

    public static void main(String[] args) throws MinhaException {
        String url = "";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new MinhaException("Erro ao conectar ao banco de dados", e);
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
