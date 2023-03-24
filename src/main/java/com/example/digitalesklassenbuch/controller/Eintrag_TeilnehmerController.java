package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.service.EintragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Eintrag_TeilnehmerController {

    private EintragService eintragService;

    public Eintrag_TeilnehmerController(EintragService eintragService) {
        super();
        this.eintragService = eintragService;
    }

    @GetMapping("/eintrag_teilnehmer")
    public String listEinträge(Model model) {
        model.addAttribute("eintrag", eintragService.getAllEinträge());
        return "eintrag_teilnehmer";
    }
}