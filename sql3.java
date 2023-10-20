import java.sql.*;

public class sql3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "y@m@n7380");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("Select * from students ");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));

        }
    }
}