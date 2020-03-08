package com.medicine.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.details.model.Medicine;
import com.medicine.util.Dbfactory;

public class MedicineDAO {
	
	int result;
	Dbfactory db;
	Connection con;
	PreparedStatement ps;
	
	
	public MedicineDAO()
	{
		db=new Dbfactory();
		con=db.getMySqlCon();
	}
	
	public int addMedicine(Medicine md)
	{
		try
		{
			ps=con.prepareStatement(Queries.ADD_MEDICINE);
			ps.setString(1,md.getBatchcode());
			ps.setString(2,md.getMedicinecode());
			ps.setFloat(3,md.getWeight());
			ps.setFloat(4,md.getPrice());
			ps.setString(5,md.getMedicinetype());
			ps.setString(6,md.getRefrigeration());
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
	public int deleteMedicine(String batchcode)
	{
		try
		{
			ps=con.prepareStatement(Queries.DELETE_MEDICINE);
			ps.setString(1, batchcode);
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
		return result ;
	}
	public Medicine searchMedicine(String batchcode)
	{
		Medicine md=null;
		try
		{
			ps=con.prepareStatement(Queries.SEARCH_MEDICINE);
			ps.setString(1, batchcode);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				md=new Medicine();
				md.setBatchcode(batchcode);
				md.setMedicinecode(rs.getString(2));
				md.setWeight(rs.getFloat(3));
				md.setPrice(rs.getFloat(4));
				md.setMedicinetype(rs.getString(5));
				md.setRefrigeration(rs.getString(6)); 
			}
			
			}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return md;
	}
	public int updateMedicine(String medicinecode,float weight,float price, String medicinetype,String refrigeration,String batchcode)
	{
		try
		{
			ps=con.prepareStatement(Queries.UPDATE_MEDICINE);
			ps.setString(1, medicinecode);
			ps.setFloat(2, weight);
			ps.setFloat(3, price);
			ps.setString(4, medicinetype);
			ps.setString(5, refrigeration);
			ps.setString(6, batchcode);
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
