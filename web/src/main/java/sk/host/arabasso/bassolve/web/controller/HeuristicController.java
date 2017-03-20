package sk.host.arabasso.bassolve.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.host.arabasso.bassolve.web.entity.Heuristic;
import sk.host.arabasso.bassolve.web.form.HeuristicForm;
import sk.host.arabasso.bassolve.web.repository.HeuristicRepository;

import javax.validation.Valid;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
@Controller
@RequestMapping("/heuristic")
public class HeuristicController {

    @Autowired
    HeuristicRepository heuristicRepository;

    @GetMapping(value ={"/", "/index"})
    public String index(Model model){

        model.addAttribute("list", heuristicRepository.findAll());

        return "heuristic/index";
    }

    @GetMapping(value = "/create")
    public String create(Model model){

        model.addAttribute("form", new HeuristicForm());

        return "heuristic/heuristic";
    }

    @PostMapping(value = "/create")
    public String create(@Valid @ModelAttribute("form") HeuristicForm form, BindingResult bindingResult){
        Heuristic heuristic = new Heuristic(form.getName(), form.getDate(), form.getSource());

        try {
            heuristic.compile();
        } catch (Exception e) {
            bindingResult.reject("source", e.getMessage());
        }

        if (bindingResult.hasErrors()) {
            return "heuristic/heuristic";
        }

        heuristicRepository.save(heuristic);

        return "redirect:/heuristic/index";
    }

    @GetMapping(value = "/edit")
    public String edit(long id, Model model){
        model.addAttribute("form", heuristicRepository.findOne(id));

        return "heuristic/heuristic";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("form") HeuristicForm form, BindingResult bindingResult){
        Heuristic heuristic = heuristicRepository.findOne(form.getId());

        heuristic.setName(form.getName());
        heuristic.setDate(form.getDate());
        heuristic.setSource(form.getSource());

        try {
            heuristic.compile();
        } catch (Exception e) {
            bindingResult.reject("source", e.getMessage());
        }

        if (bindingResult.hasErrors()) {
            return "heuristic/heuristic";
        }

        heuristicRepository.save(heuristic);

        return "redirect:/heuristic/index";
    }

    @GetMapping("/delete")
    public String delete(long id){
        heuristicRepository.delete(id);

        return "redirect:/heuristic/index";
    }
}
