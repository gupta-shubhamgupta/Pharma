package com.medicine.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbfactory {
	
		Connection con;
			public Connection getMySqlCon()
			{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver successfully installed");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","root"); 
			System.out.println("Connection successfully installed");
			if(con!=null)
			{
				con.setAutoCommit(false);
			}
			
			}
			catch(ClassNotFoundException | SQLException e)
			{
				System.out.println(e);
			}
			return con;
			} 
		 

}
