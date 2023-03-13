package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.service.EintragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EintragController {

    private EintragService eintragService;

    public EintragController(EintragService eintragService) {
        super();
        this.eintragService = eintragService;
    }

    @GetMapping("/eintrag")
    public String listEinträge(Model model) {
        model.addAttribute("eintrag", eintragService.getAllEinträge());
        return "eintrag";
    }
}
