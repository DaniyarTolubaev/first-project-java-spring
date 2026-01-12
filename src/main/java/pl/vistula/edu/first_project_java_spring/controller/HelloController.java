package pl.vistula.edu.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @GetMapping("/text")
    @ResponseBody
    public String text() {
        return "Hello, this is my first Spring controller!";
    }


    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "Daniyar");
        return "greeting";
    }
}

//http://localhost:8080
