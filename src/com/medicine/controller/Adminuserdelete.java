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
 * Servlet implementation class Adminuserdelete
 */
@WebServlet("/Adminuserdelete")
public class Adminuserdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminuserdelete() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		String u=request.getParameter("aaUid");
		AdmiDAO adop= new AdmiDAO();
		int res=adop.deleteuser(u);
		if(res>0)
		{
			request.setAttribute("asssMsg", "user Deleted sucessfully");
			RequestDispatcher rd=request.getRequestDispatcher("Adminhome.jsp");
			rd.forward(request, response);
		}
		else
		{

        	request.setAttribute("errMsg", "you enter wrong deleted");
        	RequestDispatcher rd=request.getRequestDispatcher("Adminhome.jsp");
            rd.forward(request, response);
		}
	}

}
