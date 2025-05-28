package com.cyetechnology.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	
    @GetMapping("/web")
    public String web() {
        return "welcome.html"; // Redirect to static resource
    }
}