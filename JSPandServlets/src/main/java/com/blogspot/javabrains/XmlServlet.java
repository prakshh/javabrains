package com.blogspot.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		out.println("Hello from GET method! " + userName + ". Your userID is " + userId);
		// url : http://localhost:8080/SimpleServletProject/xmlServletPath?userName=abc&userId=xyz
	}
		
		// For POST parameter, we need an HTML form
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String userId = request.getParameter("userId");
			String fullName = request.getParameter("fullName");
			out.println("Hello from POST method! " + userId + ". We know your fullName is " + fullName);
			String prof = request.getParameter("prof");
			out.println(". You are a " + prof);
//			String location = request.getParameter("location");
			String[] location = request.getParameterValues("location");
			out.println(". You are at " + location.length + " places : ");
			for(int i=0; i<location.length; i++)
				out.println(location[i]);
			
			// url doesn't show IDs		;
	}
}
