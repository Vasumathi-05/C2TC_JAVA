package c2tc.b18.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import c2tc.b18.spring.entities.Placement;
import c2tc.b18.spring.repo.PlacementRepo;

@Service
public class PlacementServiceImpl implements PlacementService {
@Autowired
PlacementRepo repo;
	@Override
	public int addPlacement(Placement placement) {
	Placement p=repo.save(placement);
	if(p!=null)
		return 1;
	else 
		return 0;
	}

	@Override
	public Placement UpdatePlacement(Placement placement) {
		Placement p=repo.save(placement);
		return p;
	}

	@Override
	public Placement GetPlacement(int uid) {
		Placement p=repo.findById(uid).get();
		return p;
	}

	@Override
	public boolean DeletePlacement(int uid) {
		Placement p=GetPlacement(uid);
		if (p!=null)
		{
			repo.delete(p);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Placement> GetPlacements() {
		List<Placement> placements=repo.findAll();
		return placements;
	}

}
