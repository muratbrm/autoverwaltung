package de.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import de.business.Select;
import de.model.Auto;

/**
 * Servlet implementation class SelectAutoServlet
 */
@WebServlet("/SelectAutoServlet")
public class SelectAutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAutoServlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Select sel  = new Select();
		Auto auto = sel.selectAutoMD(new Auto(request.getParameter("fin"), "", 0, 0, "", 0, null, "", "", 0));
		request.setAttribute("auto", auto);
	}
}
