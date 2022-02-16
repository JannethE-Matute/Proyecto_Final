package ups.edu.ec.citasmedicas.business;



import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Medico;

@Local
public interface MedicoONLocal{
	public void insertMedico(Medico medico) throws Exception;
	public List<Medico> getClientes();
}
