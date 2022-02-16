package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Receta;

@Local
public interface RecetaONLocal {
	public void insertReceta(Receta receta) throws Exception;
	public List<Receta> getRecetas();
}
