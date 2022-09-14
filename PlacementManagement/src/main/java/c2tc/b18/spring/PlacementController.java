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
import c2tc.b18.spring.entities.Placement;
import c2tc.b18.spring.service.PlacementService;

@RestController
public class PlacementController {
	@Autowired
	PlacementService service;
	@PostMapping("/addPlacement")
	public String AddPlacement(@RequestBody Placement placement) {
		int count=service.addPlacement(placement);
		return (count+" no of values got added");
	}
	
	@PutMapping("/updatePlacement")
    public Placement UpdatePlacement(@RequestBody Placement placement) 
	{
    	return service.UpdatePlacement(placement);
    }
	
	@GetMapping("/getPlacement/{uid}")
    public Placement GetPlacement(@PathVariable int uid)
	{
		return service.GetPlacement(uid);
    	
    }
	
	@DeleteMapping("/deletePlacement/{uid}")
    public String DeletePlacement(@PathVariable int uid)
	{
    	boolean success=service.DeletePlacement(uid);
    	if(success)
    		return "Deletion Successfull";
    	else
    		return "Deletion Failed";
    }
	@GetMapping("/getPlacements")
    public List<Placement> GetPlacements()
    {
    	return service.GetPlacements();
    }
}

