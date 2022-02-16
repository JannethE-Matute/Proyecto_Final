package ups.edu.ec.citasmedicas.modelo;

import javax.persistence.Column;

public class FacturaDetalle {
	@Column(name = "cit_id")
	private int id;
	private Cita cita;
	private double precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cita getCita() {
		return cita;
	}
	public void setCita(Cita cita) {
		this.cita = cita;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
