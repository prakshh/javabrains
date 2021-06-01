package com.blogspot.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Xml Servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		out.println("Hello! " + userName + ". Your userID is " + userId);
		// url : http://localhost:8080/SimpleServletProject/xmlServletPath?userName=abc&userId=xyz
		;
	}
}
