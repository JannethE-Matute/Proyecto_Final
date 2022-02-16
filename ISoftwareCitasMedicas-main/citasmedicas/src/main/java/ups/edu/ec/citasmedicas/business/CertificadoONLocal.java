package ups.edu.ec.citasmedicas.business;

import java.util.List;

import javax.ejb.Local;

import ups.edu.ec.citasmedicas.modelo.Certificado;

@Local
public interface CertificadoONLocal {
	public void insertCertificado(Certificado certificado) throws Exception;
	public List<Certificado> getCertificados();
}
