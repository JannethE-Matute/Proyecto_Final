package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.MedicoDAO;
import ups.edu.ec.citasmedicas.modelo.Medico;

;

@Stateless
public class MedicoON implements MedicoONLocal {
	
	
	@Inject
	private MedicoDAO daoMedico;
	
	public void insertMedico(Medico medico) throws Exception {
		daoMedico.insert(medico);	
	}
	public List<Medico> getClientes(){
		return daoMedico.getList();
	}
}
