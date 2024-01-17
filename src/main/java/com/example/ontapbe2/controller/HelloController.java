package com.example.ontapbe2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HelloController {
    @GetMapping()
    public String homeCalculator (){
        return "/view/home";
    }
    @GetMapping("/calculator")
    public String HellController (@RequestParam ("number1")float number1,
                              @RequestParam ("number2")float number2,
                              @RequestParam ("option") String option,
                              Model model){
        float result = 0;
        switch (option) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        };
        model.addAttribute("calculator",result);
        return "/view/result";
    }
}