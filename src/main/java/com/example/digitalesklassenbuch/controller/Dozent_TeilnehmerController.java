package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.service.DozentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Dozent_TeilnehmerController {

    private DozentService dozentService;

    public Dozent_TeilnehmerController(DozentService dozentService) {
        super();
        this.dozentService = dozentService;
    }

    @GetMapping("/dozent_teilnehmer")
    public String listDozenten(Model model) {
        model.addAttribute("dozent", dozentService.getAllDozenten());
        return "dozent_teilnehmer";
    }
}