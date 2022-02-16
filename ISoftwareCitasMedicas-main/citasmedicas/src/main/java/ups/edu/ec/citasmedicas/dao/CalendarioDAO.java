package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Horario;
import ups.edu.ec.citasmedicas.modelo.Medico;
@Stateless
public class CalendarioDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Horario p) {
		em.persist(p);
	}
	
	public void update(Horario p) {
		em.merge(p);
	}
	
	public Horario read(String id) {
		Horario p= em.find(Horario.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		Horario p= em.find(Horario.class, id);
		em.remove(p);
	}
	public List<Horario> getList(){
		List<Horario> listado=new ArrayList<Horario>();
		String jpql="SELECT p FROM Horario p";
		Query query= em.createQuery(jpql,Medico.class);
		listado = query.getResultList();
		return listado;
	}

}
