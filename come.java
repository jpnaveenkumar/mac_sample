import java.sql.*;
public class come
{
  public static void main(String a[])
  {
    try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("came here");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hap","root","12345678");
			if(con.isClosed())
				System.out.println("not connected");
			PreparedStatement stmt=con.prepareStatement("insert into dummy(name,post) values('kumar','mtrainee')");
			stmt.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
  }
}
