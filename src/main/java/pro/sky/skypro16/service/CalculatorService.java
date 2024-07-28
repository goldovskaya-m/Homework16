package pro.sky.skypro16.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class CalculatorService {
    public String sayHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public int calculateSum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public int calculateSubtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int calculateMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public double calculateDivision(Integer num1, float num2) {
        return num1 / num2;
    }
}

