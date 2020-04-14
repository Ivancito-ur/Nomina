package Nomina.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Nomina.modelo.Nomina;
import Nomina.modelo.NominaDAO;

/**
 * Servlet implementation class RegistrarNomina
 */
@WebServlet("/RegistrarNomina")
public class RegistrarNomina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarNomina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("/Nomina/index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);	
		
	Nomina nomina = new Nomina();
		
		nomina.setCodigo((String)request.getParameter("codigo"));
		nomina.setCedula((String)request.getParameter("cedula"));
		nomina.setNombre(request.getParameter("nombre"));
		nomina.setNacimiento(request.getParameter("fechaN"));
		nomina.setRetiro(request.getParameter("fechaR"));
		nomina.setIngreso(request.getParameter("fechaI"));
		
		try {
			NominaDAO nominaDAO = new NominaDAO();
			nominaDAO.registrar(nomina);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
		
	}

}
