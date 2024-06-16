import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Listagem {

    public static List<Peixe> listarPeixes(String url, String user, String password) {
        List<Peixe> peixes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "SELECT nome, tamanho FROM peixe";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                double tamanho = resultSet.getDouble("tamanho");
                Peixe peixe = new Peixe(nome, tamanho);
                peixes.add(peixe);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return peixes;
    }
}