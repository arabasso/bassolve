package sk.host.arabasso.bassolve.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.host.arabasso.bassolve.core.HeuristicExpression;
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

    public List<HeuristicExpression> getHeuristicExpressions(){
        return heuristicRepository.findAll().parallelStream().map(Heuristic::getExpression).collect(Collectors.toList());
    }
}
