import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JDBCDemo {

    public static void main(String[] args) {

        // Kreiranje DataSource objekta
        DataSource dataSource = createDataSource();

        ArrayList<String> drzave = new ArrayList<>(
                Arrays.asList(
                        "Tunguzija5",
                        "Kina5",
                        "Poljska5",
                        "Tajland5",
                        "Njemačka5",
                        "Francuska5",
                        "Italija5",
                        "Španjolska5",
                        "Portugal5",
                        "Austrija5"
                )
        );

        // Spajanje na bazu podataka
        System.out.println("Spajanje...");

        try {
            Connection connection = dataSource.getConnection();
            CallableStatement callStmt = connection.prepareCall("{CALL InsertDrzava(?)}");

            // id-jevi veci od 6
            for (int i=0; i<drzave.size(); i++) {
                callStmt.setString(1, drzave.get(i));
                callStmt.execute();
            }



            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Drzava ORDER BY IdDrzava ASC");
            while (rs.next()) {
                System.out.println(rs.getInt("IdDrzava") + ". " + rs.getString("Naziv"));
            }

            CallableStatement callStmt2 = connection.prepareCall("{CALL DeleteDrzava(?)}");
            callStmt2.setInt("IdDrzavaVeciOd", 5);
            callStmt2.execute();

            ResultSet rs2 = stmt.executeQuery("SELECT * FROM Drzava ORDER BY IdDrzava ASC");
            while (rs2.next()) {
                System.out.println(rs2.getInt("IdDrzava") + ". " + rs2.getString("Naziv"));
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