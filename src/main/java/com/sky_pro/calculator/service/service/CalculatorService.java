package com.sky_pro.calculator.service.service;

import com.sky_pro.calculator.service.exception.ValidationException;
import com.sky_pro.calculator.service.interfaceser.CalculatorServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ValidationException();
        }
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ValidationException();
        }
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new ValidationException();
        }
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) {
        if (num2== 0) {
            throw new ValidationException();
        }
        else if (num1 == null || num2 == null) {
            throw new ValidationException();
        }
        return num1 / num2;
    }
}
