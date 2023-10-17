import java.sql.*;
class Database
{
public static void main(String st[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent","root","root"); 

//query fire

//Statement s=c.createStatement();

//System.out.println(s.executeUpdate("insert into students values(3,'bca','asd',2023)"));

PreparedStatement ps=c.prepareStatement("insert into students values(?,?,?,?)");
ps.setInt(1,5);
ps.setString(2,"bca");
ps.setString(3,"ajay");
ps.setInt(4,2023);

System.out.println(ps.executeUpdate());

}catch(ClassNotFoundException e)
{
System.out.println(e);
}
catch(SQLException e)
{
System.out.println(e);
}
}
}