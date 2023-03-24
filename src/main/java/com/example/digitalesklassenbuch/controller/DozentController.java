package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.entity.Dozent;
import com.example.digitalesklassenbuch.service.DozentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DozentController {

    private DozentService dozentService;

    public DozentController(DozentService dozentService){
        super();
        this.dozentService = dozentService;
    }

    @GetMapping("/dozent")
    public String listDozenten(Model model) {
        model.addAttribute("dozent", dozentService.getAllDozenten());
        return "dozent";
    }

    @PostMapping("/dozent")
    public String speichereDozent(@ModelAttribute("dozent") Dozent dozent) {
        dozentService.saveDozent(dozent);
        return "redirect:/dozent";
    }

    @GetMapping("/dozent/neu")
    public String createDozent(Model model) {
        Dozent dozent = new Dozent();
        model.addAttribute("dozent", dozent);
        return "dozent_hinzufügen";
    }

    @GetMapping("/dozent/edit/{id}")
    public String editDozent(@PathVariable Long id, Model model) {
        model.addAttribute("dozent", dozentService.getDozentById(id));
        return "dozent_bearbeiten";
    }

    @PostMapping("/dozent/{id}")
    public String updateDozent(@PathVariable Long id, @ModelAttribute("dozent") Dozent dozent, Model model) {
        Dozent vorhandenerDozent = dozentService.getDozentById(id);
        vorhandenerDozent.setId(id);
        vorhandenerDozent.setFirstName(dozent.getFirstName());
        vorhandenerDozent.setLastName(dozent.getLastName());
        vorhandenerDozent.setEmail(dozent.getEmail());

        dozentService.updateDozent(vorhandenerDozent);
        return "redirect:/dozent";
    }

    @GetMapping("/dozent/{id}")
    public String deleteDozent (@PathVariable Long id) {
        dozentService.deleteDozentById(id);
        return "redirect:/dozent";
    }
}
