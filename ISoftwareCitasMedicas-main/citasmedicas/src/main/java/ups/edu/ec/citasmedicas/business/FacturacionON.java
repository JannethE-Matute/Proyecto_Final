package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.CalendarioDAO;
import ups.edu.ec.citasmedicas.dao.FacturacionDao;

import ups.edu.ec.citasmedicas.modelo.Factura;
import ups.edu.ec.citasmedicas.modelo.Horario;


@Stateless
public class FacturacionON implements FacturacionONLocal{
	@Inject
	private FacturacionDao daofacturacion;
	public void insertFactura(Factura factura) throws Exception {
		daofacturacion.insert(factura);	
	}
	public List<Factura> getfFacturas(){
		return daofacturacion.getList();
	}
	

}
