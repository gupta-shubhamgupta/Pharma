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
 * Servlet implementation class Updatemedicinecontroller
 */
@WebServlet("/Updatemedicinecontroller")
public class Updatemedicinecontroller extends HttpServlet {
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

			String btcode=request.getParameter("Bcode");
			String mcode=request.getParameter("medicinecode");
			float wit=Float.parseFloat(request.getParameter("weight"));
			float pri=Float.parseFloat(request.getParameter("price"));
			String mt=request.getParameter("mtype");
			String ref=request.getParameter("ref");
			
			MedicineDAO mdao = new MedicineDAO();
			int res=mdao.updateMedicine(mcode, wit, pri, mt, ref, btcode);
			if(res>0)
			{
				
				request.setAttribute("msg","Updated Successfully!!!");
				RequestDispatcher rd=request.getRequestDispatcher("Userhome.jsp");
				rd.forward(request, response);
				//response.sendRedirect("Userhome.jsp");
			}
			else
			{
				request.setAttribute("errorMsg","Not done");
				RequestDispatcher rd=request.getRequestDispatcher("Displaymedicine.jsp");
				rd.forward(request, response);
			}
	}

}