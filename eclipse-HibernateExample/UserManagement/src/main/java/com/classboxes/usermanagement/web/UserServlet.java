package com.classboxes.usermanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.classboxes.usermanagement.dao.UserDao;
import com.classboxes.usermanagement.entity.User;



/**
 * Servlet implementation class UserServlet
 */

/**
 * Servlet acts as controller for the applications, which
 * handles all the user requests for this application
 * 
 */

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * 
 */

@WebServlet("/")
public class UserServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;
	
	public void init()
	{
		userDao = new UserDao();
		
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
	{
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
	{
		String action = request.getServletPath();
		
		try
		{
			switch(action)
			{
			case "/new":
				showNewForm(request,response);
				break;
			case "/insert":
				insertUser(request,response);
				break;
			case "/delete":
				deleteUser(request,response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateUser(request,response);
				break;
			default:
				listUser(request, response);
				break;
			}//switch close
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		List<User> listUser= userDao.getAllUser();
		request.setAttribute("listUser", listUser);
		RequestDispatcher rd = request.getRequestDispatcher("user-list.jsp");
		rd.forward(request, response);
		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(id,name,email,country);
		userDao.updateUser(newUser);
		response.sendRedirect("list");
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userDao.getUser(id);
		RequestDispatcher rd = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		rd.forward(request, response);
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		userDao.deleteUser(id);
		response.sendRedirect("list");
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name,email,country);
		userDao.saveUser(newUser);
		response.sendRedirect("list");
		
		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("user-form.jsp");
		rd.forward(request, response);
		
		
	}
	
}
