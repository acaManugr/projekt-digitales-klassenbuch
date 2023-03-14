package com.example.digitalesklassenbuch.controller;

import com.example.digitalesklassenbuch.service.WochentagService;
import org.springframework.stereotype.Controller;

@Controller
public class WochentagController {

    private WochentagService wochentagService;

    public WochentagController(WochentagService wochentagService) {
        super();
        this.wochentagService = wochentagService;
    }
}
