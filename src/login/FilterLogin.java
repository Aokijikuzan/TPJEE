package login;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterLogin
 */
@WebFilter("/FilterLogin")
public class FilterLogin implements Filter {
	public final String nmLogin="florent";
	private  String pasword="1234";
	/**
	 * Default constructor. 
	 */
	public FilterLogin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
		HttpServletRequest request1=(HttpServletRequest) request;
		HttpServletResponse response1=(HttpServletResponse) response;

		HttpSession session= request1.getSession();

		if(session.getAttribute(nmLogin)== null && session.getAttribute(pasword)== null)
		{
			response1.sendRedirect(request1.getContextPath() + "/login.jsp");
		}else
		{
			chain.doFilter(request1, response1);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
