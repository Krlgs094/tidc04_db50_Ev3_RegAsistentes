package cl.inacap.Ev_3RegAsistentesModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.Ev_3RegAsistentesModel.dto.Asistente;

@Local
public interface AsistenteDAOLocal {

	void save(Asistente asistente);
	List<Asistente> getAll();
	List<Asistente> filterByName (String estado);
	
}
