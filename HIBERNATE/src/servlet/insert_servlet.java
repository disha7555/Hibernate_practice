package servlet;
import vo.insert_vo;
import dao.insert_dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class insert_servlet
 */
@WebServlet("/insert_servlet")
public class insert_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		insert_vo vo = new insert_vo();
		insert_dao d1 = new insert_dao();
		String firstname = request.getParameter("fn");
		String lastname = request.getParameter("ln");
		String flag1=request.getParameter("flagg");
		out.println(flag1);
		
		
	
		if(flag1.equals("insert"))
		{
		vo.setFn(firstname);
		vo.setLn(lastname);
		}
		d1.insert(vo);
		response.sendRedirect("insert_last_jsp");
		
		if(flag1.equals("search")){
		int iddd=Integer.parseInt(request.getParameter("iddd"));
		vo.setId(iddd);
		List ls = new ArrayList();
		ls=d1.select(vo);
		HttpSession s=request.getSession();
		s.setAttribute("list",ls);
		response.sendRedirect("search2_jsp.jsp");
		}
		if(flag1.equals("delete")){
			int iddd1=Integer.parseInt(request.getParameter("iddd"));
			vo.setId(iddd1);
			d1.delete(vo);
			response.sendRedirect("insert_last_jsp");
		}
		
		}
	}

