package com.medicine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.UserDAO;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
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
		String uname = request.getParameter("User_id");
		String pwd = request.getParameter("Pass_id");

		UserDAO udao = new UserDAO();
		boolean bool = udao.login(uname, pwd);
		if(bool)
		{
			response.sendRedirect("Userhome.jsp");
		}
		else
		{
			request.setAttribute("errorMsg", "Please enter valid id or password!!!");
			RequestDispatcher rd=request.getRequestDispatcher("Userlogin.jsp");
			rd.forward(request, response);
			//response.sendRedirect("Login.jsp");
		} 
	}
	
}
