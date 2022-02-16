package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Horario;


@Local
public interface CalendarioONLocal {
	public void insertCalendario(Horario horario) throws Exception;
	public List<Horario> getcitas();

}
