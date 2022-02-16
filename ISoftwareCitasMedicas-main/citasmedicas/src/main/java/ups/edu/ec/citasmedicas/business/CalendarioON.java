package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.CalendarioDAO;
import ups.edu.ec.citasmedicas.modelo.Cita;
import ups.edu.ec.citasmedicas.modelo.Horario;

@Stateless
public class CalendarioON implements CalendarioONLocal{
	@Inject
	private CalendarioDAO daocalendario;
	public void insertCalendario(Horario horario) throws Exception {
		daocalendario.insert(horario);	
	}
	public List<Horario> getcitas(){
		return daocalendario.getList();
	}
	

}
