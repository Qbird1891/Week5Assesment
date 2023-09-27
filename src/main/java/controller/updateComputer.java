package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Computers;

/**
 * Servlet implementation class updateComputer
 */
@WebServlet("/updateComputer")
public class updateComputer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateComputer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ComputerHelper helper = new ComputerHelper();
		String oldMake = request.getParameter("oldMake");
		String make = request.getParameter("make");
		String model = request.getParameter("model"); 
		double size = Double.valueOf(request.getParameter("size"));
		
		Computers computersToUpdate = helper.searchByComputerName(oldMake);
		computersToUpdate.setMake(make);
		computersToUpdate.setModel(model);
		computersToUpdate.setSize(size);
		helper.update(computersToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
