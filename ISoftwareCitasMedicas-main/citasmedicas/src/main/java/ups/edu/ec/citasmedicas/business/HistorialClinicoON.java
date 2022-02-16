package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.HistorialClinicoDAO;
import ups.edu.ec.citasmedicas.modelo.HistorialClinico;

@Stateless
public class HistorialClinicoON implements HistorialClinicoONLocal{
	@Inject
	private HistorialClinicoDAO daoHistorial;
	
	public void insertHistorialClinico(HistorialClinico historial) throws Exception {
		daoHistorial.insert(historial);	
	}
	public List<HistorialClinico> getHistorialClinicos(){
		return daoHistorial.getList();
	}
}
