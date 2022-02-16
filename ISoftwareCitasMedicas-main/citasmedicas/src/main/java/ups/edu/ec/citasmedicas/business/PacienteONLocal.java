package ups.edu.ec.citasmedicas.business;



import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Medico;
import ups.edu.ec.citasmedicas.modelo.Paciente;

@Local
public interface PacienteONLocal{
	public void insertPaciente(Paciente paciente) throws Exception;
	public List<Paciente> getpacientes();
}
