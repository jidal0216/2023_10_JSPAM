package com.koreaIT.java.am;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/home/gugudan")
public class gugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		String inputDan = request.getParameter("dan");
		
		int dan = Integer.parseInt(inputDan);
		
		String inputLimit = request.getParameter("limit");
		
		int limit = Integer.parseInt(inputLimit);
		
		response.getWriter().append(String.format("<div>== %d단 ==\n</div>", dan));
				for(int i = 1; i<= limit; i++) {
					response.getWriter().append(String.format("<div>%d * %d = %d\n</div>",dan ,i, dan * i));
					}
	}


}
