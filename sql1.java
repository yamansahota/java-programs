import java.sql.*;

class db
{
 public static void main(String a[]) throws ClassNotFoundException , SQLException
{
Class.forName("com.mysql.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","y@m@n7380");

Statement s=c.createStatement();
System.out.println(s.executeUpdate("Insert into students values (109,'Gita',12,2500,'B')"));

}
}