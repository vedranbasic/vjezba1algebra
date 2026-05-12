import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JDBCDemo {

    public static void main(String[] args) {

        // Kreiranje DataSource objekta
        DataSource dataSource = createDataSource();

        try(Connection conn = dataSource.getConnection()) {
            // iskljuci automatski commit
            conn.setAutoCommit(false);

            try(Statement stmt1 = conn.createStatement();
                Statement stmt2 = conn.createStatement()) {



                // izvrsi promjene
                String sql1 = "UPDATE Stavka SET CijenaPoKomadu = CijenaPoKomadu + 10 WHERE IDStavka = 8";
                String sql2 = "UPDATE Stavka SET CijenaPoKomadu = CijenaPoKomadu - 10 WHERE IDStavka = 9";


                stmt1.executeUpdate(sql1);
                stmt2.executeUpdate(sql2);

                // komitaj transakciju
                conn.commit();
            }
            catch(SQLException e) {
                conn.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kraj");
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