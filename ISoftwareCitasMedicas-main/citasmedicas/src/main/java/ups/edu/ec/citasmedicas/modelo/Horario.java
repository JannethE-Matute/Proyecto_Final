package ups.edu.ec.citasmedicas.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "TBL_Horario")
public class Horario {
	@Id
	@Column(name = "hor_id")
	private int id;
	@OneToMany
	@JoinColumn(name = "hor_id")
	private List<Medico> Medicos;
	private String dia;
	private String horainicio;
	private String horafinal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Medico> getMedicos() {
		return Medicos;
	}
	public void setMedicos(List<Medico> medicos) {
		Medicos = medicos;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}
	public String getHorafinal() {
		return horafinal;
	}
	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}
	
	
	
}
