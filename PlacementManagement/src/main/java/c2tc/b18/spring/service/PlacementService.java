package c2tc.b18.spring.service;

import java.util.List;

import c2tc.b18.spring.entities.Placement;

public interface PlacementService {

	int addPlacement(Placement placement);
	
	Placement UpdatePlacement(Placement placement);

	Placement GetPlacement(int uid);

	boolean DeletePlacement(int uid);

	List<Placement> GetPlacements();

}
