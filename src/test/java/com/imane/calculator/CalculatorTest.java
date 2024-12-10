package com.imane.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
        @Test
        public void testAddition() {
            Calculator calculator = new Calculator();
            int result = calculator.add(2, 3);
            assertEquals(5, result, "2 + 3 doit être égal à 5");
        }
     @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result, "15 / 3 doit être égal à 5");
    }
    }
