package com.example.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {

    @GetMapping("/map")
    public String showMap(Model model){
        return "showMap";
    }

}
