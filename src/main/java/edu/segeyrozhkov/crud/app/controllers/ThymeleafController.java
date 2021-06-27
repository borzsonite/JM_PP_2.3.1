package edu.segeyrozhkov.crud.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/test")
    public String test(Model model) {
model.addAttribute("message", "test message");
        return "thymeleaf";
    }
}
