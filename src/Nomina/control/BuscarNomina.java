package Nomina.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nomina.modelo.Nomina;
import Nomina.modelo.NominaDAO;

/**
 * Servlet implementation class BuscarNomina
 */
@WebServlet("/BuscarNomina")
public class BuscarNomina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarNomina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Nomina nomina = new Nomina();
		nomina.setCodigo((String)request.getParameter("codigo"));
		
		
		NominaDAO nominaDAO = new NominaDAO();
		nomina = nominaDAO.buscar(nomina);
		
		request.setAttribute("codigo", nomina.getCodigo());
		request.setAttribute("cedula", nomina.getCedula());
		request.setAttribute("nombre", nomina.getNombre());
		request.setAttribute("fechaN", nomina.getNacimiento());
		request.setAttribute("fechaI", nomina.getIngreso());
		request.setAttribute("fechaR", nomina.getRetiro());
	
		
	    RequestDispatcher rd;
		rd = request.getRequestDispatcher("/informacion.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	
		
		
		
	}

}
