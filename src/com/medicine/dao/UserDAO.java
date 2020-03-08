package com.medicine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.details.model.User;
import com.medicine.util.Dbfactory;

public class UserDAO {
	
	int result;
	Dbfactory db;
	Connection con;
	PreparedStatement ps;
	
	public UserDAO()
	{
		db=new Dbfactory();
		con=db.getMySqlCon();
	}
	
	public int addUser(User u)
	{
		try
		{
			ps=con.prepareStatement(Queries.ADD_USER);
			ps.setString(1,u.getUserid());
			ps.setDate(2, u.getDob());
			ps.setString(3,u.getGender());
			ps.setLong(4, u.getMobno());
			ps.setString(5,u.getEmail());
			ps.setString(6,u.getPassword()); 
			result=ps.executeUpdate();
			if(result>0)
			{
				con.commit();
				con.close();
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return result;
 }
	
		public boolean login(String User_Id,String Password)
			{
				boolean bool = false;
				try
				{
					ps = con.prepareStatement(Queries.USER_LOGIN);
					ps.setString(1, User_Id);
					ps.setString(2, Password);
					ResultSet rs = ps.executeQuery();
					if(rs.next())
					{
						bool = true;
						return bool;
					}
				}
				catch(SQLException e)
				{
					System.out.println(e);
				}
				return bool;
			} 
		public int forgetpassword(User pa)
		{
			try
			{
				ps = con.prepareStatement(Queries.FORGET_PASSWORD);
				ps.setString(1,pa.getPassword());
				ps.setString(2, pa.getUserid());
				ps.setDate(3,pa.getDob());
				result=ps.executeUpdate();
				if(result>0)
				{
					con.commit();
					con.close();
				}
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			return result;
		}
		

}