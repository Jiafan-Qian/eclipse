package com.classboxes.mvcapplication.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classboxes.mvcapplication.dao.UserDao;
import com.classboxes.mvcapplication.entity.User;

@WebServlet("/")
public class RegisterServlet extends HttpServlet
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
			case "/register":
				showRegistrationPage(request,response);
				break;
			case "/insert":
				insertUser(request,response);
				break;
			case "/list":
				listUser(request,response);
				break;
			case "/welcome":
				showWelcomePage(request,response);
				break;
			case "/signin":
				showHomePage(request,response);
				break;
			default:
				showLoginPage(request, response);
			}//switch close
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void showHomePage(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		
		//check whether email and password matches for database record
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = userDao.checkUser(email, password);
		if (user != null)
		{
			request.setAttribute("user", user);
			//HttpSession session = request.getSession();
			//session.setAttribute("user",user);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
			rd.forward(request, response);
		}
		
		
		
	}

	private void showWelcomePage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		
	}

	private void showLoginPage(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		
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

	/*
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstname");
		String middleName = request.getParameter("middlename");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		User newUser = new User(id,firstName,middleName,lastName,email);
		userDao.updateUser(newUser);
		response.sendRedirect("list");
		
	}
	*/
	
	/*
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
	*/
	
	/*
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		userDao.deleteUser(id);
		response.sendRedirect("list");
	}
	*/
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstname");
		String middleName = request.getParameter("middlename");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User newUser = new User(firstName,middleName,lastName,email,password);
		userDao.saveUser(newUser);
		response.sendRedirect("welcome");
		
		
		
	}

	private void showRegistrationPage(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException,IOException,ServletException
	{
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
		
		
	}
}
