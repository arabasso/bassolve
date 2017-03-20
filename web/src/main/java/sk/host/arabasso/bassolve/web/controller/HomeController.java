package sk.host.arabasso.bassolve.web.controller;

import groovy.lang.GroovyClassLoader;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sk.host.arabasso.bassolve.core.HeuristicExpression;
import sk.host.arabasso.bassolve.web.Application;
import sk.host.arabasso.bassolve.web.entity.Heuristic;
import sk.host.arabasso.bassolve.web.form.ExpressionForm;
import sk.host.arabasso.bassolve.web.service.HeuristicService;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.net.URL;

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

        form.addHeuristicExpressions(heuristicService.getHeuristicExpressions());

        model.addAttribute("form", form);

        return "index";
    }
}
