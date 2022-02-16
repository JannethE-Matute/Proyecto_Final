package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Factura;



@Local
public interface FacturacionONLocal {
	public void insertFactura(Factura factura) throws Exception;
	public List<Factura> getfFacturas();

}
