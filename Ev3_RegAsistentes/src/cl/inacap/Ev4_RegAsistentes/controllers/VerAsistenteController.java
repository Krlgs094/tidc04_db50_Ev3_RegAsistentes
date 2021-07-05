package cl.inacap.Ev4_RegAsistentes.controllers;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Ev_3RegAsistentesModel.dao.AsistenteDAOLocal;
import cl.inacap.Ev_3RegAsistentesModel.dto.Asistente;

/**
 * Servlet implementation class VerAsistenteController
 */
@WebServlet("/VerAsistenteController.do")
public class VerAsistenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@Inject
	private AsistenteDAOLocal asistenteDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerAsistenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Asistente> asistentes = asistenteDAO.getAll();
		
		request.setAttribute("asistentes", asistentes);
		
		request.getRequestDispatcher("WEB-INF/vistas/verAsistentes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
