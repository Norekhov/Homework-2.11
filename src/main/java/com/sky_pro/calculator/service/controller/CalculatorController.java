package com.sky_pro.calculator.service.controller;

import com.sky_pro.calculator.service.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public int plus(@RequestParam Integer num1,
                    @RequestParam Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam Integer num1,
                     @RequestParam Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam Integer num1,
                        @RequestParam Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam Integer num1,
                      @RequestParam Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
