package com.medicine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.details.model.Admin;
import com.details.model.User;
import com.medicine.util.Dbfactory;

public class AdmiDAO {

	int result;
	Dbfactory db;
	Connection con;
	PreparedStatement ps;
	
	public AdmiDAO()
	{
		db=new Dbfactory();
		con=db.getMySqlCon();
	}
	public int deleteuser(String uid)
	{
		try
		{
			ps=con.prepareStatement(Queries.DELETE_USER);
			ps.setString(1,uid);
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
	public int addadmin(Admin a)
	{
		try
		{
			ps=con.prepareStatement(Queries.ADD_ADMINUSER);
			ps.setString(1,a.getUserid() );
			ps.setString(2,a.getPassword());
			ps.setDate(3,a.getDob());
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
			ps = con.prepareStatement(Queries.ADMIN_LOGNIN);
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
 	
	public int forgetpass(Admin pa)
	{
		try
		{
			ps = con.prepareStatement(Queries.ADMINFORGETPASS);
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