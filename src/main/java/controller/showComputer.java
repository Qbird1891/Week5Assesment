package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Computers;

/**
 * Servlet implementation class showComputer
 */
@WebServlet("/showComputer")
public class showComputer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showComputer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ComputerHelper helper = new ComputerHelper();
		List<Computers> computerlist = helper.showAllComputers();
		request.setAttribute("allComputers", computerlist);
		String path = "/show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
