package de.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.business.Select;
import de.model.Users;

/**
 * Servlet implementation class RecoverPasswordServlet
 */
@WebServlet("/RecoverPasswordServlet")
public class RecoverPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecoverPasswordServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Select sel = new Select();
		Users users = sel.selectUser(new Users(request.getParameter("id"), request.getParameter("pwd"), request.getParameter("email")));
		
	}

}
