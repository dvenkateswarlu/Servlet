package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class CookieLoginPage extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String name = req.getParameter("name");
			String pass =req.getParameter("password");
			
			Cookie cookieName = new Cookie("Name","name");
			Cookie cookiePassword = new Cookie("Password","pass");
		

			resp.addCookie(cookieName);
			resp.addCookie(cookiePassword);
			
			PrintWriter writer = resp.getWriter();
			writer.print("<h1>Cookie is Created</h1>");
			
		}
}
