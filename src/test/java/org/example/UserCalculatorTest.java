package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("User Calculator Tests")
class UserCalculatorTests {

    private UserCalculator userCalculator;

    @BeforeEach
    void setUp() {
        // This method will be executed before each test
        userCalculator = new UserCalculator();
    }

    @Test
    @DisplayName("Division Test")
    void divideMethod() {
        assertEquals(3.0, userCalculator.Operators(6, "divide", 2));
    }

    @Test
    @DisplayName("Multiplication Test")
    void multiplicationMethod() {
        assertEquals(25.0, userCalculator.Operators(5, "multiplication", 5));
    }

    @Test
    @DisplayName("Addition Test")
    void additionMethod() {
        assertEquals(10.0, userCalculator.Operators(5, "addition", 5));
    }

    @Test
    @DisplayName("Subtraction Test")
    void subtractionMethod() {
        assertEquals(4.0, userCalculator.Operators(6, "subtraction", 2));
    }
}

