package com.medicine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medicine.dao.MedicineDAO;

/**
 * Servlet implementation class Deletecontroller
 */
@WebServlet("/Deletecontroller")
public class Deletecontroller extends HttpServlet {
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
		
			String bco=request.getParameter("Bcode");
			MedicineDAO  mdo=new MedicineDAO();
			int res=mdo.deleteMedicine(bco);
			if(res>0)
			{
				request.setAttribute("sMsg", "Deleted sucessfully");
				RequestDispatcher rd=request.getRequestDispatcher("Userhome.jsp");
	            rd.forward(request, response);
				//response.sendRedirect("Userhome.jsp");
			}
			else
			{

	        	request.setAttribute("errorMsg", "Not deleted");
	        	RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
	            rd.forward(request, response);
			}
			
	}

}