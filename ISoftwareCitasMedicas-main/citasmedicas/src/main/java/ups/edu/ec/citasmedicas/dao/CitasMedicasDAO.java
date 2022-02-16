package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Cita;

@Stateless
public class CitasMedicasDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Cita p) {
		em.persist(p);
	}
	
	public void update(Cita p) {
		em.merge(p);
	}
	
	public Cita read(String id) {
		Cita p= em.find(Cita.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		Cita p= em.find(Cita.class, id);
		em.remove(p);
	}
	public List<Cita> getList(){
		List<Cita> listado=new ArrayList<Cita>();
		String jpql="SELECT p FROM Cita p";
		Query query= em.createQuery(jpql,Cita.class);
		listado = query.getResultList();
		return listado;
	}
}
