package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import ups.edu.ec.citasmedicas.modelo.Paciente;
@Stateless
public class PacienteDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Paciente p) {
		em.persist(p);
	}
	
	public void update(Paciente p) {
		em.merge(p);
	}
	
	public Paciente read(String id) {
		Paciente p= em.find(Paciente.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		Paciente p= em.find(Paciente.class, id);
		em.remove(p);
	}
	public List<Paciente> getList(){
		List<Paciente> listado=new ArrayList<Paciente>();
		String jpql="SELECT p FROM Paciente p";
		Query query= em.createQuery(jpql,Paciente.class);
		listado = query.getResultList();
		return listado;
	}
	
}
