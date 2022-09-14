package c2tc.b18.spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import c2tc.b18.spring.entities.Certificate;
import c2tc.b18.spring.service.CertificateService;

@RestController
public class CertificateController {
	@Autowired
	CertificateService service;
	@PostMapping("/addCertificate")
	public String AddCertificate(@RequestBody Certificate certificate) {
		int count=service.addCertificate(certificate);
		return (count+" no of values got added");
	}
	
	@PutMapping("/updateCertificate")
    public Certificate UpdateCertificate(@RequestBody Certificate certificate) 
	{
    	return service.UpdateCertificate(certificate);
    }
	
	@GetMapping("/getCertificate/{id}")
    public Certificate GetCertificate(@PathVariable int id)
	{
		return service.GetCertificate(id);
    	
    }
	
	@DeleteMapping("/deleteCertificate/{id}")
    public String DeleteCertificate(@PathVariable int id)
	{
    	boolean success=service.DeleteCertificate(id);
    	if(success)
    		return "Deletion Successfull";
    	else
    		return "Deletion Failed";
    }
	@GetMapping("/getCertificates")
    public List<Certificate> GetCertificates()
    {
    	return service.GetCertificates();
    }
}


