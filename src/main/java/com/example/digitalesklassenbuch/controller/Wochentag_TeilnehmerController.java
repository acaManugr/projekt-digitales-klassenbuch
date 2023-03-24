package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.service.WochentagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Wochentag_TeilnehmerController {

    private WochentagService wochentagService;

    public Wochentag_TeilnehmerController(WochentagService wochentagService) {
        super();
        this.wochentagService = wochentagService;
    }

    @GetMapping("/wochentag_teilnehmer")
    public String listWochentage(Model model) {
        model.addAttribute("wochentag", wochentagService.getAllWochentage());
        return "wochentag_teilnehmer";
    }
}