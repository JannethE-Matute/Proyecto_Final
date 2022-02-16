package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.CitasMedicasDAO;

import ups.edu.ec.citasmedicas.modelo.Cita;

@Stateless
public class CitasON implements CitasONLocal{
	@Inject
	private CitasMedicasDAO daocitas;
	
	public void insertCita(Cita cita) throws Exception {
		daocitas.insert(cita);	
	}
	public List<Cita> getcitas(){
		return daocitas.getList();
	}

}
