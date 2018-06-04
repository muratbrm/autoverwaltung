package de.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import de.business.Insert;
import de.model.Auto;
import de.tools.Tools;

/**
 * Servlet implementation class InsertAutoServlet
 */
@WebServlet("/InsertAutoServlet")
public class InsertAutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAutoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Insert insert = new Insert();
		Auto auto = new Auto(request.getParameter("fin"), request.getParameter("motor"), 
				Integer.parseInt(request.getParameter("tueren")), Integer.parseInt(request.getParameter("leistung")), 
				request.getParameter("fahrzeugart"), Integer.parseInt(request.getParameter("sitze")), 
				Tools.stringToDate(request.getParameter("datum")), request.getParameter("austattungen"),
				request.getParameter("modell"), Integer.parseInt(request.getParameter("preis")));
		insert.insertAutoMD(auto);
	}

}
