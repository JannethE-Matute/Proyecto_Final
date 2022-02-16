package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ups.edu.ec.citasmedicas.dao.CertificadoDAO;
import ups.edu.ec.citasmedicas.modelo.Certificado;

@Stateless
public class CertificadoON implements CertificadoONLocal{
	@Inject
	private CertificadoDAO daoCertificado;
	
	public void insertCertificado(Certificado certificado) throws Exception {
		daoCertificado.insert(certificado);	
	}
	public List<Certificado> getCertificados(){
		return daoCertificado.getList();
	}
}
