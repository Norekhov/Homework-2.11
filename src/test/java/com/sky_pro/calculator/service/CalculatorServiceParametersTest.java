package com.sky_pro.calculator.service;

import com.sky_pro.calculator.service.exception.ValidationException;
import com.sky_pro.calculator.service.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceParametersTest {
	private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
	@MethodSource("paramsForPlus")
    void plusTest(int num1, int num2, int expected) {
		int actual = calculatorService.plus(num1, num2);
		Assertions.assertEquals(expected, actual);
    }

	static Stream<Arguments> paramsForPlus() {
		return Stream.of(
				Arguments.of(1, 1, 2),
				Arguments.of(5, 5, 10),
				Arguments.of(3, 2, 5)
		);
	}

	@ParameterizedTest
	@MethodSource("paramsForMinus")
	void minusTest(int num1, int num2, int expected) {
		int actual = calculatorService.minus(num1, num2);
		Assertions.assertEquals(expected, actual);
	}

	static Stream<Arguments> paramsForMinus() {
		return Stream.of(
				Arguments.of(1, 1, 0),
				Arguments.of(6, 5, 1),
				Arguments.of(3, 2, 1)
		);
	}

	@ParameterizedTest
	@MethodSource("paramsForMultiply")
	void multiplyTest(int num1, int num2, int expected) {
		int actual = calculatorService.multiply(num1, num2);
		Assertions.assertEquals(expected, actual);
	}

	static Stream<Arguments> paramsForMultiply() {
		return Stream.of(
				Arguments.of(1, 1, 1),
				Arguments.of(6, 5, 30),
				Arguments.of(3, 2, 6)
		);
	}

	@ParameterizedTest
	@MethodSource("paramsForDivide")
	void divideTest(int num1, int num2, int expected) {
		int actual = calculatorService.divide(num1, num2);
		Assertions.assertEquals(expected, actual);
	}

	static Stream<Arguments> paramsForDivide() {
		return Stream.of(
				Arguments.of(1, 1, 1),
				Arguments.of(10, 5, 2),
				Arguments.of(60, 2, 30)
		);
	}

	@ParameterizedTest
	@MethodSource("paramsForDivideExceptionTest")
	void divideExceptionTest(int num1, int num2) {
		Assertions.assertThrows(ValidationException.class, () -> calculatorService.divide(num1, num2));
	}

	static Stream<Arguments> paramsForDivideExceptionTest() {
		return Stream.of(
				Arguments.of(5, 0),
				Arguments.of(6, 0),
				Arguments.of(-1, 0)
		);
	}
}
