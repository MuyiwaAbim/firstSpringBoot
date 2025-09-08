package com.abimbomj.firstspringboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Renders index.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Renders about.html
    }
}


