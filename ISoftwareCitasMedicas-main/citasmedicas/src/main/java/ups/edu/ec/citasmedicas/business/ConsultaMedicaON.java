package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.ConsultaMedicaDAO;
import ups.edu.ec.citasmedicas.dao.MedicoDAO;
import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;
import ups.edu.ec.citasmedicas.modelo.Medico;

;

@Stateless
public class ConsultaMedicaON implements ConsultaMedicaONLocal {
	
	
	@Inject
	private ConsultaMedicaDAO daoconsulta;
	
	public void insertConsulta(ConsultaMedica consultaMedica) throws Exception {
		daoconsulta.insert(consultaMedica);	
	}
	public List<ConsultaMedica> getConsultamedica(){
		return daoconsulta.getList();
	}
}
