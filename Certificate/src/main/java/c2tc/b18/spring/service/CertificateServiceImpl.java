package c2tc.b18.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import c2tc.b18.spring.entities.Certificate;
import c2tc.b18.spring.repo.CertificateRepo;

@Service
public class CertificateServiceImpl implements CertificateService {
@Autowired
CertificateRepo repo;
	@Override
	public int addCertificate(Certificate certificate) {
		Certificate c=repo.save(certificate);
	if(c!=null)
		return 1;
	else 
		return 0;
	}

	@Override
	public Certificate UpdateCertificate(Certificate certificate) {
		Certificate c=repo.save(certificate);
		return c;
	}

	@Override
	public Certificate GetCertificate(int id) {
		Certificate c=repo.findById(id).get();
		return c;
	}

	@Override
	public boolean DeleteCertificate(int id) {
		Certificate c=GetCertificate(id);
		if (c!=null)
		{
			repo.delete(c);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Certificate> GetCertificates() {
		List<Certificate> certificates=repo.findAll();
		return certificates;
	}

}
