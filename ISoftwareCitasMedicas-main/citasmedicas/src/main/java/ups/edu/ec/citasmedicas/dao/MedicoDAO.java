package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Medico;



@Stateless
public class MedicoDAO {

	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Medico p) {
		em.persist(p);
	}
	
	public void update(Medico p) {
		em.merge(p);
	}
	
	public Medico read(String id) {
		Medico p= em.find(Medico.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		Medico p= em.find(Medico.class, id);
		em.remove(p);
	}
	public List<Medico> getList(){
		List<Medico> listado=new ArrayList<Medico>();
		String jpql="SELECT p FROM Paciente p";
		Query query= em.createQuery(jpql,Medico.class);
		listado = query.getResultList();
		return listado;
	}
	

}
