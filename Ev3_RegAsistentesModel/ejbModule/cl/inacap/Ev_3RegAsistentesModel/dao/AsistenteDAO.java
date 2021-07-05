package cl.inacap.Ev_3RegAsistentesModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.Ev_3RegAsistentesModel.dto.Asistente;

/**
 * Session Bean implementation class AsistenteDAO
 */
@Stateless
@LocalBean
public class AsistenteDAO implements AsistenteDAOLocal {

	
	private static List<Asistente> asistentes = new ArrayList<>();
    /**
     * Default constructor. 
     */
    public AsistenteDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Asistente asistente) {
		asistentes.add(asistente);
		
	}

	@Override
	public List<Asistente> getAll() {
		// TODO Auto-generated method stub
		return asistentes;
	}

	@Override
	public List<Asistente> filterByName(String estado) {
		// TODO Auto-generated method stub
		return asistentes.stream().filter(c->c.getEstado().contains(estado)).collect(Collectors.toList());
	}

}
