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
import sk.host.arabasso.bassolve.core.visitor.HeuristicExpressionVisitor;
import sk.host.arabasso.bassolve.core.visitor.PrintExpressionVisitor;
import sk.host.arabasso.bassolve.web.form.ExpressionForm;
import sk.host.arabasso.bassolve.web.service.HeuristicService;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabasso on 02/10/2016.
 */
@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index"})
    public String index(
            Model model) {

        //model.addAttribute("form", new ExpressionForm("100 + 2 - 3 * 4 + 8 / 4 - 2 ^ 3"));
		model.addAttribute("form", new ExpressionForm(""));

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

        try {
            List<String> visit = visit(form.getValue());

            model.addAttribute("result", visit);

        } catch (Exception e) {
            bindingResult.reject("value", "" + e.getMessage());

            e.printStackTrace();
        }

        return "index";
    }

    public List<String> visit(String value)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException {
        PrintExpressionVisitor printExpressionVisitor = new PrintExpressionVisitor();

        List<String> list = new ArrayList<>();

        ExpressionNode ast = AstVisitor.visit(value);

        list.add(printExpressionVisitor.visit(ast));

        int previousHashCode = -1;
        int hashCode = ast.hashCode();

        List<HeuristicExpressionVisitor> visitors = heuristicService.getHeuristics();

        while(previousHashCode != hashCode) {
            previousHashCode = hashCode;

            for (AstVisitor<ExpressionNode> visitor : visitors) {
                ast = visitor.visit(ast);

                hashCode = ast.hashCode();


                if (previousHashCode != hashCode) {
                    list.add(printExpressionVisitor.visit(ast));

                    break;
                }
            }
        }

        return list;
    }
}
