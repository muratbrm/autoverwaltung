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
 * Servlet implementation class LogUserServlet
 */
@WebServlet("/LogUserServlet")
public class LogUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogUserServlet() {
        super();
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		Select sel = new Select();
		sel.setUserType(new Users(id, pwd));
		req.setAttribute(Users.userType, "usertype");
		req.getRequestDispatcher("/SelectAllAutoServlet").forward(req, resp);
	}

}
