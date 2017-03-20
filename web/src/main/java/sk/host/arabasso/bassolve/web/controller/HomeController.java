package sk.host.arabasso.bassolve.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.visitor.AstVisitor;
import sk.host.arabasso.bassolve.web.form.ExpressionForm;
import sk.host.arabasso.bassolve.web.service.HeuristicService;

import javax.validation.Valid;

/**
 * Created by arabasso on 02/10/2016.
 */
@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index"})
    public String index(
            Model model) {

        model.addAttribute("form", new ExpressionForm());

        return "index";
    }

    @Autowired
    HeuristicService heuristicService;

    @PostMapping(value = {"/", "/index"})
    public String index(
            @Valid @ModelAttribute("form") ExpressionForm form,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        for (AstVisitor<ExpressionNode> visitor : heuristicService.getHeuristics()) {
            form.addVisitor(visitor);
        }

        //form.addHeuristicExpressions(heuristicService.getHeuristicExpressions());

        model.addAttribute("form", form);

        return "index";
    }
}
