package com.sky_pro.calculator.service;

import com.sky_pro.calculator.service.exception.ValidationException;
import com.sky_pro.calculator.service.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusTest() {
        int num1 = 1;
        int num2 = 2;
        int expected = 3;
        int actual  = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 4;
        num2 = 6;
        expected = 10;
        actual  = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = -8;
        num2 = 10;
        expected = 2;
        actual  = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        int num1 = 1;
        int num2 = 2;
        int expected = -1;
        int actual  = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 6;
        num2 = 4;
        expected = 2;
        actual  = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = -8;
        num2 = 10;
        expected = -18;
        actual  = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiplyTest() {
        int num1 = 1;
        int num2 = 2;
        int expected = 2;
        int actual  = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 6;
        num2 = 4;
        expected = 24;
        actual  = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = -8;
        num2 = 10;
        expected = -80;
        actual  = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideTest() {
        int num1 = 2;
        int num2 = 1;
        int expected = 2;
        int actual  = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 5;
        num2 = 5;
        expected = 1;
        actual  = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);

        num1 = 10;
        num2 = 2;
        expected = 5;
        actual  = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideExceptionTest() {
        Assertions.assertThrows(ValidationException.class, () -> calculatorService.divide(5, 0));
    }
}