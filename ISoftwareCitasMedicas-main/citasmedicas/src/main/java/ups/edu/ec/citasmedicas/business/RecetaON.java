package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.RecetaDAO;
import ups.edu.ec.citasmedicas.modelo.Receta;

@Stateless
public class RecetaON implements RecetaONLocal{
	@Inject
	private RecetaDAO daoReceta;
	
	public void insertReceta(Receta receta) throws Exception {
		daoReceta.insert(receta);	
	}
	public List<Receta> getRecetas(){
		return daoReceta.getList();
	}
}
