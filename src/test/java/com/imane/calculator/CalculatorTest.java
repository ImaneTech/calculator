package com.imane.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
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
    }
