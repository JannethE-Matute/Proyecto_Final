package ups.edu.ec.citasmedicas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.citasmedicas.modelo.Factura;
import ups.edu.ec.citasmedicas.modelo.Medico;
@Stateless
public class FacturacionDao {
	@PersistenceContext // coge el datasourses que tenemos en el proyecto(persistence.xml)
	private EntityManager em;
	
	public void insert(Factura p) {
		em.persist(p);
	}
	
	public void update(Factura p) {
		em.merge(p);
	}
	
	public Factura read(String id) {
		Factura p= em.find(Factura.class, id);
		return p;
	}
	
	
	public void delete(int id) {
		Factura p= em.find(Factura.class, id);
		em.remove(p);
	}
	public List<Factura> getList(){
		List<Factura> listado=new ArrayList<Factura>();
		String jpql="SELECT p FROM Factura p";
		Query query= em.createQuery(jpql,Factura.class);
		listado = query.getResultList();
		return listado;
	}
}
