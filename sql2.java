import java.sql.*;

class Sql1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "y@m@n7380");
        // Statement s = c.createStatement();

        // System.out.println(s.executeUpdate("Insert into students values
        // (110,'Harsh',11,2100,'A')"));

        PreparedStatement p = c.prepareStatement("insert into students value (?,?,?,?,?)");
        p.setInt(1, 112);
        p.setString(2, "Nina");
        p.setInt(3, 11);
        p.setInt(4, 1100);
        p.setString(5, "D");
        System.out.println(p.executeUpdate());
    }
}