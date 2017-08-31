package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String) request.getAttribute("username");
		response.getWriter().println("<html>");    
        response.getWriter().println("<head>");       
        response.getWriter().println("<title>��¼��Ϣ</title>");        
        response.getWriter().println("</head>");      
        response.getWriter().println("<body algin=center>");       
        response.getWriter().println("��ӭ��" + username + "���û���¼�ɹ�������");      
        response.getWriter().println("</body>");      
        response.getWriter().println("</html>");   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
