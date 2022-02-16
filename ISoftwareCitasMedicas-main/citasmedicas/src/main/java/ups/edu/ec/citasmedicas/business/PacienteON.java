package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.MedicoDAO;
import ups.edu.ec.citasmedicas.dao.PacienteDAO;
import ups.edu.ec.citasmedicas.modelo.Medico;
import ups.edu.ec.citasmedicas.modelo.Paciente;



@Stateless
public class PacienteON implements PacienteONLocal {
	
	
	@Inject
	private PacienteDAO daoPaciente;
	
	public void insertPaciente(Paciente paciente) throws Exception {
		daoPaciente.insert(paciente);	
	}
	public List<Paciente> getpacientes(){
		return daoPaciente.getList();
	}
}
