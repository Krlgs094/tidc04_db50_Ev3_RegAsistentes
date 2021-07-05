package cl.inacap.Ev_3RegAsistentesModel.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asistente
 *
 */
@Entity
@NamedQueries({
	@namedQueriy(name="Asistente.getAll", query="SELECT as FROM Asistente as")
})
public class Asistente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private String rut;
	
	public Asistente() {
		super();
	}
   
}
