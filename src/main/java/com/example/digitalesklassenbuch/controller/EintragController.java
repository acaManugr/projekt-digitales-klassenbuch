package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.service.EintragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/eintrag/neu")
    public String createEintrag(Model model) {
        Eintrag eintrag = new Eintrag();
        model.addAttribute("eintrag", eintrag);
        return "eintrag_hinzufügen";
    }

    @PostMapping("/eintrag")
    public String speichereEintrag(@ModelAttribute("eintrag") Eintrag eintrag) {
        eintragService.saveEintrag(eintrag);
        return "redirect:/eintrag";
    }

    @GetMapping("/eintrag/edit/{id}")
    public String editEintrag(@PathVariable Long id, Model model) {
        model.addAttribute("eintrag", eintragService.getEintragById(id));
        return "eintrag_bearbeiten";
    }

    @PostMapping("/eintrag/{id}")
    public String updateEintrag(@PathVariable Long id, @ModelAttribute("eintrag") Eintrag eintrag, Model model) {
        Eintrag vorhandenerEintrag = eintragService.getEintragById(id);
        vorhandenerEintrag.setId(id);
        vorhandenerEintrag.setFirstName(eintrag.getFirstName());
        vorhandenerEintrag.setLastName(eintrag.getLastName());
        vorhandenerEintrag.setEmail(eintrag.getEmail());

        eintragService.updateEintrag(vorhandenerEintrag);
        return "redirect:/eintrag";
    }

    @GetMapping("/eintrag/{id}")
    public String deleteEintrag (@PathVariable Long id) {
        eintragService.deleteEintragById(id);
        return "redirect:/eintrag";
    }
}
