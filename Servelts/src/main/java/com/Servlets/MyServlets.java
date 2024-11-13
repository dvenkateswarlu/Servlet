package com.Servlets;

import java.io.IOException;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hell")
public class MyServlets extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		String register = req.getParameter("Register");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Test2.html");
		requestDispatcher.forward(req, resp);
		
		System.out.println(name+" "+pass);
		
		
	}


}
