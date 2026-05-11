import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {

        // Kreiranje DataSource objekta
        DataSource dataSource = createDataSource();

        // Spajanje na bazu podataka
        System.out.println("Spajanje...");

        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Uspješno spojeni na bazu podataka!");

            Statement stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate("UPDATE Drzava SET Naziv= 'Croatia' WHERE idDrzava=1");
            System.out.println("Država je uspješno preimenovana!");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Drzava");
            while (rs.next()) {
                System.out.println(rs.getString("Naziv"));
            }

        } catch (SQLException e) {
            System.err.println("Greška prilikom spajanja na bazu podataka:");
            e.printStackTrace();
        }
        System.out.println("Kraj...");
    }

    // Metoda za stvaranje DataSource objekta
    private static DataSource createDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("AdventureWorksOBP");
        dataSource.setPortNumber(13690);
        dataSource.setUser("sa");
        dataSource.setPassword("sql");
        dataSource.setTrustServerCertificate(true);
        dataSource.setEncrypt(false);
        return dataSource;
    }
}