package de.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.business.Select;
import de.model.Auto;

/**
 * Servlet implementation class SelectAllAutoServlet
 */
@WebServlet("/SelectAllAutoServlet")
public class SelectAllAutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectAllAutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Select sel = new Select();
		List<Auto> autoList = sel.selectAllAutoMD();
		request.setAttribute("autoList", autoList);
		request.getRequestDispatcher("fahrzeugbestand.jsp").forward(request, response);
		System.out.println("funktioniert");
	}

}
