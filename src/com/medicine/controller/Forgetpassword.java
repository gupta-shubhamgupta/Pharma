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

import com.details.model.User;
import com.medicine.dao.UserDAO;

/**
 * Servlet implementation class Forgetpassword
 */
@WebServlet("/Forgetpassword")
public class Forgetpassword extends HttpServlet {
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
		String uid=request.getParameter("User_id");
		String dob=request.getParameter("dob");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jdob=sdf.parse(dob);
		java.sql.Date sdob= new java.sql.Date(jdob.getTime());
		String pass=request.getParameter("pass");
		User ur=new User();
		ur.setUserid(uid);
		ur.setDob(sdob);
		ur.setPassword(pass);
		
		
		UserDAO ud= new UserDAO();
		int res=ud.forgetpassword(ur);
		if(res>0)
		{
			request.setAttribute("psMsg", "Password changed succesfully");
        	RequestDispatcher rd=request.getRequestDispatcher("Userlogin.jsp");
            rd.forward(request, response);
		}
		else
		{
			request.setAttribute("rorMsg", "Invalid entry");
        	RequestDispatcher rd=request.getRequestDispatcher("Forgetpassword.jsp");
            rd.forward(request, response);
		}
		}
		catch(ParseException p)
		{
			System.out.println(p);
		}
	}

}