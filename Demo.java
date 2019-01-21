package com.zoho.sample;
import java.sql.*;
public class Demo
{
	public static void main(String x)
	{
		System.out.println("Trial run");
	}
	public static void main(String ar[]) {
		Demo d=new Demo();
		System.out.println("First run");
		//d.main("naveen");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("came here");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3360/df","root","12345678");
			if(con.isClosed())
				System.out.println("not connected");
			PreparedStatement stmt=con.prepareStatement("insert into dummy(name,post) values('kumar','member technical staff')");
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
