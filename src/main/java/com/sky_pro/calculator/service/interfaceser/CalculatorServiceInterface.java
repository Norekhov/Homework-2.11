package com.sky_pro.calculator.service.interfaceser;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorServiceInterface {
    String welcome();

    int plus(Integer num1, Integer num2);

    int minus(Integer num1, Integer num2);

    int multiply(Integer num1, Integer num2);

    int divide(Integer num1, Integer num2);
}
