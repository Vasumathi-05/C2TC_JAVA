package c2tc.b18.spring.service;

import java.util.List;

import c2tc.b18.spring.entities.Certificate;

public interface CertificateService {

	int addCertificate(Certificate certificate);

	Certificate UpdateCertificate(Certificate certificate);

	Certificate GetCertificate(int id);

	boolean DeleteCertificate(int id);

	List<Certificate> GetCertificates();

}
