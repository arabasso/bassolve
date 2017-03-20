package sk.host.arabasso.bassolve.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.host.arabasso.bassolve.core.visitor.HeuristicExpressionVisitor;
import sk.host.arabasso.bassolve.web.entity.Heuristic;
import sk.host.arabasso.bassolve.web.repository.HeuristicRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by arabasso on 19/03/2017.
 */
@Component
public class HeuristicService {
    @Autowired
    public HeuristicRepository heuristicRepository;

    public List<HeuristicExpressionVisitor> getHeuristics(){
        return heuristicRepository.findAll().parallelStream().map(Heuristic::getHeuristic).collect(Collectors.toList());
    }
}
