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
 * Servlet implementation class Registrationcontroller
 */
@WebServlet("/Registrationcontroller")
public class Registrationcontroller extends HttpServlet {
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
		String uid=request.getParameter("Uid");
		String dob=request.getParameter("dob");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date jdob=sdf.parse(dob);
		java.sql.Date sdob= new java.sql.Date(jdob.getTime());
		String gen=request.getParameter("gen");
		long mob=Long.parseLong(request.getParameter("Mnumber"));
		String em=request.getParameter("email");
		String pass=request.getParameter("pword");
		User uobj= new User();
		uobj.setUserid(uid);
        uobj.setDob(sdob);
        uobj.setGender(gen);
        uobj.setMobno(mob);
        uobj.setEmail(em);
        uobj.setPassword(pass);
        UserDAO udao =new UserDAO();
        
        int res=udao.addUser(uobj);
        if(res>0)
        {
        	request.setAttribute("uMsg", "Registered succesfully");
        	RequestDispatcher rd=request.getRequestDispatcher("Userlogin.jsp");
            rd.forward(request, response);
        	//response.sendRedirect("Userlogin.jsp");
        }
        else
        {
        	request.setAttribute("errorMsg", "Not Registered");
        	RequestDispatcher rd=request.getRequestDispatcher("Userregister.jsp");
            rd.forward(request, response);

        }

		}
		catch(ParseException p)
		{
			System.out.println(p);
		}
	}

}