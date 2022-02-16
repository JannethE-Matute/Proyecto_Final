package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;


import ups.edu.ec.citasmedicas.modelo.Cita;

@Local
public interface CitasONLocal {

	public void insertCita(Cita cita) throws Exception;
	public List<Cita> getcitas();

}
