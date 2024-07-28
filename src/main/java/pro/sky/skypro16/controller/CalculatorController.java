package pro.sky.skypro16.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro16.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    @GetMapping("/hello")
    public String sayHello(){

        return calculatorService.sayHello();
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "By Mariya";
    }
}
