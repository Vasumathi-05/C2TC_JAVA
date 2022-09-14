package c2tc.b18.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import c2tc.b18.spring.entities.Placement;

public interface PlacementRepo  extends JpaRepository<Placement,Integer> {

}
