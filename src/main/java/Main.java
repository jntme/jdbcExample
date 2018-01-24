import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost/school";
        Properties props = new Properties();
        props.setProperty("user","mij2");
        props.setProperty("password","");
        props.setProperty("ssl","false");

        Connection conn = DriverManager.getConnection(url, props);

        Statement statement = conn.createStatement();

        ResultSet rs = statement.executeQuery("select * from student");

        while(rs.next()) {

            System.out.println(rs.getString("vorname"));
        }
    }
}
