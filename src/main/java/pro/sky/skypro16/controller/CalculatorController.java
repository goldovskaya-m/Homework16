package pro.sky.skypro16.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skypro16.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String calculateSum(@RequestParam(value = "num1", required = false) Integer num1,
                               @RequestParam(value = "num2", required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "сумма составляет: [%s]".formatted(calculatorService.calculateSum(num1, num2));
    }

    @GetMapping("/minus")
    public String calculateSubtraction(@RequestParam(value = "num1", required = false) Integer num1,
                                       @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "Разница составляет: [%s]".formatted(calculatorService.calculateSubtraction(num1, num2));
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam(value = "num1", required = false) Integer num1,
                                    @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        return "Умножение составляет: [%s]".formatted(calculatorService.calculateMultiply(num1, num2));
    }

    @GetMapping("/divide")
    public String calculateDivision(@RequestParam(value = "num1", required = false) Integer num1,
                                    @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не передан параметр";
        }
        if (num2 == 0) {
            return "Деление на 0 запрещено";
        }
        return "Деление составляет: [%.2f]".formatted(calculatorService.calculateDivision(num1, num2));
    }
}



