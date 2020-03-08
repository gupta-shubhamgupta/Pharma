package com.medicine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.AdmiDAO;

/**
 * Servlet implementation class Adminlogincontroller
 */
@WebServlet("/Adminlogincontroller")
public class Adminlogincontroller extends HttpServlet {
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
		
		String uname = request.getParameter("Add_id");
		String pwd = request.getParameter("Pas_id");
		
		AdmiDAO ado= new AdmiDAO();
		boolean bool=ado.login(uname, pwd);
		if(bool)
		{
			response.sendRedirect("Adminhome.jsp");
		}
		else
		{
			request.setAttribute("uaasMsg", "Please enter valid id or password!!!");
			RequestDispatcher rd=request.getRequestDispatcher("Adminlogin.jsp");
			rd.forward(request, response);
			//response.sendRedirect("Login.jsp");
		} 
	}

}