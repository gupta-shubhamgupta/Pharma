package com.medicine.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.details.model.Medicine;
import com.medicine.dao.MedicineDAO;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
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
		
		String bod=request.getParameter("Bcode");
		MedicineDAO mdao= new MedicineDAO();
		Medicine mm= new Medicine();
		mm=mdao.searchMedicine(bod);
		if(mm!=null)
		{
			request.setAttribute("sussMsg", mm);
        	RequestDispatcher rd=request.getRequestDispatcher("Displaymedicine.jsp");
        	 rd.forward(request, response);
			//response.sendRedirect("Displaymedicine.jsp");
		}
		else
        {
        	request.setAttribute("errorMsg", "Enter correct detail");
        	RequestDispatcher rd=request.getRequestDispatcher("Search.jsp");
            rd.forward(request, response);

        }
		
	}

}
