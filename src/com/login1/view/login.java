package com.login1.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h1 align='center'>用户登录</h1>");
		out.print("<form action='/test_login1/logincheck' method='post'>");
		out.print("<p align='center'>");
		out.print("用户名 <input type='text' name='username'/><br/>");
		out.print("<br/>");
		out.print("密 码：<input type='password' name='code'/><br/><br/>");
		out.print("<p align='center'>");
		out.print("<input type='submit' value='登录'<br/>");
		out.print("  <input type='submit' value='注册'");		
		out.print("</p>");
		out.print("</p>");
		out.print("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
