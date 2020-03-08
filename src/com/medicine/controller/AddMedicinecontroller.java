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
 * Servlet implementation class AddMedicinecontroller
 */
@WebServlet("/AddMedicinecontroller")
public class AddMedicinecontroller extends HttpServlet {
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
		
		String bid=request.getParameter("Bid");
		//System.out.println(bid);
		String mcode=request.getParameter("Mcode");
		//System.out.println(mcode);
		float wei=Float.parseFloat(request.getParameter("weight"));
	//	System.out.println(wei);
		float pri=Float.parseFloat(request.getParameter("price"));
	//	System.out.println(pri);
		String mtype=request.getParameter("Mtype");
	//	System.out.println(mtype);
		String rtype=request.getParameter("uu");
	//	System.out.println(rtype);
		Medicine mm=new Medicine();
		mm.setBatchcode(bid);
		mm.setMedicinecode(mcode);
		mm.setWeight(wei);
		mm.setPrice(pri);
		mm.setMedicinetype(mtype);
		mm.setRefrigeration(rtype);
		
		MedicineDAO mdao= new MedicineDAO();
		int res=mdao.addMedicine(mm);
		if(res>0)
		{
			request.setAttribute("aMsg", "Added details sucessfully");
        	RequestDispatcher rd=request.getRequestDispatcher("Userhome.jsp");
            rd.forward(request, response);
			//response.sendRedirect("Userhome.jsp");
		}
		else
        {
        	request.setAttribute("errorMsg", "Not Added details");
        	RequestDispatcher rd=request.getRequestDispatcher("Addbatch.jsp");
            rd.forward(request, response);

        }
	}

}
