package com.medicine.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.details.model.Admin;
import com.medicine.dao.AdmiDAO;

/**
 * Servlet implementation class Adminregistration
 */
@WebServlet("/Adminregistration")
public class Adminregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
		String auid=request.getParameter("Aid");
		String pas=request.getParameter("pord");
		String dob=request.getParameter("adob");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jdob=sdf.parse(dob);
		java.sql.Date sdob= new java.sql.Date(jdob.getTime());
		Admin ad=new Admin();
		ad.setUserid(auid);
		ad.setPassword(pas);
		ad.setDob(sdob);
		
		AdmiDAO ado=new AdmiDAO();
		int res=ado.addadmin(ad);
		if(res>0)
        {
        	request.setAttribute("uadMsg", "Registered succesfully");
        	RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");
            rd.forward(request, response);
        	//response.sendRedirect("Userlogin.jsp");
        }
        else
        {
        	request.setAttribute("adrrorMsg", "Not Registered");
        	RequestDispatcher rd=request.getRequestDispatcher("Adminregister.jsp");
            rd.forward(request, response);

        }
		
		
		}
		catch(ParseException p)
		{
			System.out.println(p);
		}
		
		
	}

}