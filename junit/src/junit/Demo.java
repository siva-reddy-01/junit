package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.sql.*;
@SuppressWarnings("unused")
public class Demo
{
	@Test
	public void test()
	{
		try
		{
			Connection con=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded..");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd","root","root");
			if(con!=null)
			{
				System.out.println("connected");
			}
			else
			{
				System.out.println("Not connected");
				
			}
			
			
			assertNull(con);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
