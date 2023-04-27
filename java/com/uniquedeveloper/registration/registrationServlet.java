package com.uniquedeveloper.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registration
 */
@WebServlet("/register")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String uname = request.getParameter("name");
			String uemail = request.getParameter("email");
			String upwd = request.getParameter("pass");
			String Reupwd = request.getParameter("re_pass");
			String umobile = request.getParameter("contact");			
			PrintWriter out = response.getWriter();
			RequestDispatcher dispatcher =null;
			Connection con = null;
			if (uname==null||uname.equals("")) {
				request.setAttribute("status", "InvalidName");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
			else	if (uemail==null||uemail.equals("")) {
				request.setAttribute("status", "InvalidEmail");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
			else 	if (upwd==null||upwd.equals("")) {
				request.setAttribute("status", "Invalidupwd");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
			else if(!upwd.equals(Reupwd)){
				request.setAttribute("status", "InvaliduConfirmpwd");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
				
			
			else if (umobile==null||umobile.equals("")) {
				request.setAttribute("status", "InvalidMobile");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
			else if (umobile.length()>=10) {
				request.setAttribute("status", "InvalidMobileLength");
				dispatcher  = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
			}
			
			
			
			
			
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL=false","root","root");
				PreparedStatement pst = con.prepareStatement("insert into users(uname,uemail,upwd,umobile) values(?,?,?,?)");
				pst.setString(1, uname);
				pst.setString(2, uemail);
				pst.setString(3, upwd);
				pst.setString(4, umobile);						
				int rowCount = pst.executeUpdate();
				dispatcher = request.getRequestDispatcher("registration.jsp");
				if (rowCount > 0) {
					request.setAttribute("status", "success");
				} else {
					request.setAttribute("status", "failed");
				}
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
	}

}
