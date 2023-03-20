package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.entity.Wochentag;
import com.example.digitalesklassenbuch.service.WochentagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WochentagController {

    private WochentagService wochentagService;

    public WochentagController(WochentagService wochentagService) {
        super();
        this.wochentagService = wochentagService;
    }

    @GetMapping("/wochentag")
    public String listWochentage(Model model) {
        model.addAttribute("wochentag", wochentagService.getAllWochentage());
        return "wochentag";
    }

    @GetMapping("/wochentag/neu")
    public String createWochentag(Model model) {
        Wochentag wochentag = new Wochentag();
        model.addAttribute("wochentag", wochentag);
        return "wochentag_hinzufügen";
    }

    @PostMapping("/wochentag")
    public String speichereWochentag(@ModelAttribute("wochentag") Wochentag wochentag) {
        wochentagService.saveWochentag(wochentag);
        return "redirect:/wochentag";
    }

    @GetMapping("/wochentag/edit/{id}")
    public String editWochentag(@PathVariable Long id, Model model) {
        model.addAttribute("wochentag", wochentagService.getWochentagById(id));
        return "wochentag_bearbeiten";
    }

    @PostMapping("/wochentag/{id}")
    public String updateEWochentag(@PathVariable Long id, @ModelAttribute("wochentag") Wochentag wochentag, Model model) {
        Wochentag vorhandenerWochentag = wochentagService.getWochentagById(id);
        vorhandenerWochentag.setId(id);
        vorhandenerWochentag.setVertretung(wochentag.getVertretung());
        vorhandenerWochentag.setLernthema(wochentag.getLernthema());
        vorhandenerWochentag.setAufgabe(wochentag.getAufgabe());
        vorhandenerWochentag.setVersaeumnisse(wochentag.getVersaeumnisse());
        vorhandenerWochentag.setVerspaetungen(wochentag.getVerspaetungen());
        vorhandenerWochentag.setBemerkungen(wochentag.getBemerkungen());
        vorhandenerWochentag.setDatum(wochentag.getDatum());

        wochentagService.updateWochentag(vorhandenerWochentag);
        return "redirect:/wochentag";
    }

    @GetMapping("/wochentag/{id}")
    public String deleteWochentag (@PathVariable Long id) {
        wochentagService.deleteWochentagById(id);
        return "redirect:/wochentag";
    }
}
