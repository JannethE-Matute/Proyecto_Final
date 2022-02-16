package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Certificado;


@Stateless
public class CertificadoDAO {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Certificado c) {
		em.persist(c);
	}
	
	public void update(Certificado c) {
		em.merge(c);
	}
	
	public Certificado read(String id) {
		Certificado c= em.find(Certificado.class, id);
		return c;
	}
	
	
	public void delete(int id) {
		Certificado c= em.find(Certificado.class, id);
		em.remove(c);
	}
	public List<Certificado> getList(){
		List<Certificado> listado=new ArrayList<Certificado>();
		String jpql="SELECT c FROM Certificado c";
		Query query= em.createQuery(jpql,Certificado.class);
		listado = query.getResultList();
		return listado;
	}
}
