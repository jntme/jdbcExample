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

//        Connection conn = DriverManager.getConnection(url, props);

        Connection conn1 = DriverManager.getConnection(url, "mij2", "");

        Statement statement = conn1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = statement.executeQuery("select * from student where sid <= 10");

        while(rs.next()) {
            System.out.println(rs.getString("vorname"));

            rs.updateString(1, "hannibal");
            rs.updateRow();

            if(rs.previous()) {
                System.out.println(rs.getString("vorname"));
            }
        }
    }
}
