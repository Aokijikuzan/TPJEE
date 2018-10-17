package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestLogin
 */
@WebServlet("/TestLogin")
public class TestLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WebContent/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		final String log="florent";
		String pasword1="1234";
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();


		String login = request.getParameter("login");
		String password =request.getParameter("password");
		
		if(log.equals(login) && pasword1.equals(password))
		{
			request.setAttribute("login",login);
			request.setAttribute("password",password);
			this.getServletContext().getRequestDispatcher("/WebContent/login.jsp").forward(request, response);
		}

		
	}

}
