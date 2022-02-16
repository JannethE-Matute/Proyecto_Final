package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.HistorialClinico;

@Stateless
public class HistorialClinicoDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(HistorialClinico hc) {
		em.persist(hc);
	}
	
	public void update(HistorialClinico hc) {
		em.merge(hc);
	}
	
	public HistorialClinico read(String id) {
		HistorialClinico hc= em.find(HistorialClinico.class, id);
		return hc;
	}
	
	
	public void delete(int id) {
		HistorialClinico hc= em.find(HistorialClinico.class, id);
		em.remove(hc);
	}
	public List<HistorialClinico> getList(){
		List<HistorialClinico> listado=new ArrayList<HistorialClinico>();
		String jpql="SELECT hc FROM HistorialClinico hc";
		Query query= em.createQuery(jpql,HistorialClinico.class);
		listado = query.getResultList();
		return listado;
	}
}
