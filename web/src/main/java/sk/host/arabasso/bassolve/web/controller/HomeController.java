package sk.host.arabasso.bassolve.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sk.host.arabasso.bassolve.web.form.ExpressionForm;

import javax.validation.Valid;

/**
 * Created by arabasso on 02/10/2016.
 *
 */
@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index", "/home"})
    public String index(
            Model model){

        model.addAttribute("form", new ExpressionForm());

        return "index";
    }

    @PostMapping(value = {"/", "/index", "/home"})
    public String index(
            @Valid @ModelAttribute("form")  ExpressionForm form,
            BindingResult result,
            Model model){

        if (result.hasErrors()){
            return "index";
        }

        model.addAttribute("form", form);

        return "index";
    }
}
