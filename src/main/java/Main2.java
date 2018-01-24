import java.sql.*;

public class Main2 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/school";

        Connection conn1 = DriverManager.getConnection(url, "mij2", "");

        Statement statement = conn1.createStatement();

        for(int i = 200000; i > 0; i--) {
            String query = "insert into student(vorname, name, gebdat) values ('jonathan" + i + " ', 'meier " + i +  " ', '1992-04-16')";
            statement.execute(query);
        }

    }
}
