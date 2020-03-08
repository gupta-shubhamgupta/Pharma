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
import com.details.model.User;
import com.medicine.dao.AdmiDAO;

/**
 * Servlet implementation class Adminforgetcontroller
 */
@WebServlet("/Adminforgetcontroller")
public class Adminforgetcontroller extends HttpServlet {
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
		try
		{
		String uid=request.getParameter("fUser_id");
		String dob=request.getParameter("fdob");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jdob=sdf.parse(dob);
		java.sql.Date sdob= new java.sql.Date(jdob.getTime());
		String pass=request.getParameter("fpass");
		Admin ur=new Admin();
		ur.setUserid(uid);
		ur.setDob(sdob);
		ur.setPassword(pass);
		
		AdmiDAO adaoo=new AdmiDAO();
		int res=adaoo.forgetpass(ur);
		if(res>0)
		{
			request.setAttribute("ffpsMsg", "Password changed succesfully");
        	RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");
            rd.forward(request, response);
		}
		else
		{
			request.setAttribute("fferrorMsg", "Invalid entry");
        	RequestDispatcher rd=request.getRequestDispatcher("Adminforget.jsp");
            rd.forward(request, response);
		}
		
		}
		catch(ParseException p)
		{
			System.out.println(p);
		}
	}

}