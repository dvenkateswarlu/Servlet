package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class LoginPage extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("username");
		String pass= req.getParameter("password");
		System.out.println(name+" "+pass);
		
		String nameN ="Krishna";
		String password = "K123";
		if(nameN.equals(name) && password.equals(pass))
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Test2.html");
			requestDispatcher.forward(req, resp);
		}else
		{
			PrintWriter writer = resp.getWriter();
			writer.print("<h1>Invalid login page</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.html");
			requestDispatcher.include(req, resp);
			System.out.println("Invalid password");
		}
	}
}
