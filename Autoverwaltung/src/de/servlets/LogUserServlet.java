package de.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.business.Select;
import de.business.Update;
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
		String id = req.getParameter("text");
		String pwd = req.getParameter("password");
		String email = req.getParameter("email");
		Select sel = new Select();
		Update update = new Update();
		Users users = new Users(id, pwd, "");
		sel.setUserType(users);
//		req.setAttribute("usertype", Users.userType);
		update.setLoginState(users);
		req.setAttribute(Users.userType, "usertype");
		
		System.out.println(Users.userType);
//		req.getRequestDispatcher("/SelectAllAutoServlet").forward(req, resp);
//		resp.getWriter().write(id);
//		resp.getWriter().write(pwd);
//		resp.getWriter().write(Users.userType);
		
//		req.getRequestDispatcher("fahrzeugbestand.jsp").forward(req, resp);
		req.getRequestDispatcher("SelectAllAutoServlet").forward(req, resp);
	}

}
