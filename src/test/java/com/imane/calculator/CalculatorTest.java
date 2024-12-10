package com.imane.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();}
    @AfterEach
    void tearDown() {
        calculator = null;}
     @Test
        public void testAddition() {
            Calculator calculator = new Calculator();
            int result = calculator.add(2, 3);
            assertEquals(5, result, "2 + 3 doit être égal à 5");}
     @Test
       public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result, "15 / 3 doit être égal à 5");}

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void testAddParameterized(int a, int b, int expectedResult) {
        assertEquals(expectedResult, Calculator.add(a, b));
    }
    @Test
    void testEnsembleChiffresPositiveNumber() {
        Set<Integer> expected = Set.of(6, 7, 9); // Ensemble attendu
        assertEquals(expected, Calculator.ensembleChiffres(7679));
    }
    @Test
    void testEnsembleChiffresNegativeNumber() {
        Set<Integer> expected = Set.of(1); // Ensemble attendu
        assertEquals(expected, Calculator.ensembleChiffres(-11));
    }
    @Test
    void testEnsembleChiffresSingleDigit() {
        Set<Integer> expected = Set.of(5); // Ensemble attendu
        assertEquals(expected, Calculator.ensembleChiffres(5));
    }
    @Test
    void testEnsembleChiffresZero() {
        Set<Integer> expected = Set.of(0); // Ensemble attendu
        assertEquals(expected, Calculator.ensembleChiffres(0));
    }
}


