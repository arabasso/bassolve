package sk.host.arabasso.bassolve.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.host.arabasso.bassolve.web.entity.Heuristic;

/**
 * Created by arabasso on 19/03/2017.
 */
@Repository
public interface HeuristicRepository extends JpaRepository<Heuristic, Long> {

}
