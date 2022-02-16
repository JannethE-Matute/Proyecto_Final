package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.HistorialClinico;

@Local
public interface HistorialClinicoONLocal {
	public void insertHistorialClinico(HistorialClinico historial) throws Exception;
	public List<HistorialClinico> getHistorialClinicos();
}

