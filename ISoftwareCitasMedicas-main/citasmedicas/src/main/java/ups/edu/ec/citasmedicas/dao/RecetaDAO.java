package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Receta;

@Stateless
public class RecetaDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Receta r) {
		em.persist(r);
	}
	
	public void update(Receta r) {
		em.merge(r);
	}
	
	public Receta read(String id) {
		Receta r= em.find(Receta.class, id);
		return r;
	}
	
	public void delete(int id) {
		Receta r= em.find(Receta.class, id);
		em.remove(r);
	}
	public List<Receta> getList(){
		List<Receta> listado=new ArrayList<Receta>();
		String jpql="SELECT r FROM Receta r";
		Query query= em.createQuery(jpql,Receta.class);
		listado = query.getResultList();
		return listado;
	}
}
