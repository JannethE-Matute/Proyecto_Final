package ups.edu.ec.citasmedicas.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "TBL_Receta")
public class Receta {
	@Id
	private int id;
	private String diagnostico;
	
	@OneToOne
	@JoinColumn(name = "id")
	private ConsultaMedica consulta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public ConsultaMedica getConsulta() {
		return consulta;
	}
	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}
	
	
	
	
}
