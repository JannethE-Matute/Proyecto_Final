package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.ConsultaMedica;
import ups.edu.ec.citasmedicas.modelo.Horario;
import ups.edu.ec.citasmedicas.modelo.Medico;




@Stateless
public class ConsultaMedicaDAO {
	
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(ConsultaMedica p) {
		em.persist(p);
	}
	
	public void update(ConsultaMedica p) {
		em.merge(p);
	}
	
	public ConsultaMedica read(String id) {
		ConsultaMedica p= em.find(ConsultaMedica.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		ConsultaMedica p= em.find(ConsultaMedica.class, id);
		em.remove(p);
	}
	public List<ConsultaMedica> getList(){
		List<ConsultaMedica> listado=new ArrayList<ConsultaMedica>();
		String jpql="SELECT p FROM ConsultaMedica p";
		Query query= em.createQuery(jpql,ConsultaMedica.class);
		listado = query.getResultList();
		return listado;
	}
	
}
