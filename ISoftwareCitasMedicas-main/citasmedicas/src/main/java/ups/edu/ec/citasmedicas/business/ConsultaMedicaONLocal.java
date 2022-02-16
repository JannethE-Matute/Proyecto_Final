package ups.edu.ec.citasmedicas.business;



import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;



@Local
public interface ConsultaMedicaONLocal{
	public void insertConsulta(ConsultaMedica medico) throws Exception;
	public List<ConsultaMedica> getConsultamedica();
}
