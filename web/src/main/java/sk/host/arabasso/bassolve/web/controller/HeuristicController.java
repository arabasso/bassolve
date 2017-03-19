package sk.host.arabasso.bassolve.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.host.arabasso.bassolve.web.form.ExpressionForm;
import sk.host.arabasso.bassolve.web.form.HeuristicForm;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
@Controller
@RequestMapping("/heuristic")
public class HeuristicController {

    @GetMapping(value ={"/", "/index"})
    public String index(
            Model model){
        model.addAttribute("list", new ArrayList<ExpressionForm>());

        return "heuristic/index";
    }

    @GetMapping("/create")
    public String create(
            Model model){
        model.addAttribute("form", new HeuristicForm());

        return "heuristic/create";
    }

    @PostMapping("/create")
    public String create(
            @Valid @ModelAttribute("form") HeuristicForm form,
            BindingResult bindingResult){
        return "heuristic/create";
    }

    @GetMapping("/edit")
    public String edit(
            long id,
            Model model){

        return "heuristic/edit";
    }

    @PostMapping("/edit")
    public String edit(
            @Valid @ModelAttribute("form") HeuristicForm form,
            BindingResult bindingResult){
        return "heuristic/edit";
    }

    @GetMapping("/delete")
    public String delete(
            long id){

        return "heuristic/index";
    }
}
