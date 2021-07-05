package cl.inacap.Ev4_RegAsistentes.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.Ev_3RegAsistentesModel.dao.AsistenteDAO;
import cl.inacap.Ev_3RegAsistentesModel.dto.Asistente;

/**
 * Servlet implementation class AgregarAsistenteControllers
 */
@WebServlet("/AgregarAsistenteController.do")
public class AgregarAsistenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAsistenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.getRequestDispatcher("WEB-INF/vistas/registrarAsistente.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
List<String> errores = new ArrayList<>();
		
		String rut = request.getParameter("rut-txt").trim();
		if(rut.isEmpty()) {
			errores.add("Ingrese rut valido");
		}
		
		String nombre = request.getParameter("nombre-txt").trim();
		if(nombre.isEmpty()) {
			errores.add("Ingrese un nombre");
		}
		
		String apellido = request.getParameter("apellido-txt").trim();
		if(apellido.isEmpty()) {
			errores.add("Ingrese un apellido");
		}
		
		String edad = request.getParameter("edad-txt").trim();
		int edad_1 =18;
		try {
			edad_1 = Integer.parseInt(edad);
		}catch (Exception ex) {
			errores.add("debe tener mas de 18 años");
		}
		
		String empresa = request.getParameter("empresa-txt").trim();
		if(empresa.isEmpty()) {
			errores.add("Ingrese una empresa");
		}
		
		String estado = request.getParameter("estado-select").trim();
		String region = request.getParameter("region-select").trim();
		
		if (errores.isEmpty()) {
			Asistente a = new Asistente();
			a.setRut(rut);
			a.setNombre(nombre);
			a.setApellido(apellido);
			a.setEdad(edad_1);
			a.setEmpresa(empresa);
			a.setEstado(estado);
			a.setRegion(region);
			
			AsistenteDAO asi = new AsistenteDAO();
			asi.save(a);
			request.setAttribute("mensaje", "Asistente agregado correctamente");
		
		} else {
			request.setAttribute("errores", errores);
			
		}
		
		doGet(request, response);
	}

}
