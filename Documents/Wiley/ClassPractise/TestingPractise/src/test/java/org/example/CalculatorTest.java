package org.example;

import org.example.exceptions.NegativeNumberException;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Nested
    class checkDivide {
        @DisplayName("Divide 20 by 5")
        @Test
        void T001() throws NegativeNumberException {
            assertEquals(4, calculator.divide(20, 5));
        }

        @DisplayName("Divide -20 by 5")
        @Test
        void T002() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, 5));
        }

        @DisplayName("Divide 20 by -5")
        @Test
        void T003() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.divide(20, -5));
        }

        @DisplayName("Divide -20 by -5")
        @Test
        void T004() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.divide(-20, -5));
        }

        @DisplayName("Divide 0 by 20")
        @Test
        void T005() throws NegativeNumberException {
            assertEquals(0, calculator.divide(0, 20));
        }

        @DisplayName("Divide 20 by 0")
        @Test
        void T006() throws NegativeNumberException {
            assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
        }
    }

    @Nested
    class checkAdd {
        @DisplayName("Add 20 and 5")
        @Test
        void T0012() throws NegativeNumberException {
            assertEquals(25, calculator.add(20, 5));
        }

        @DisplayName("Add -20 and 5")
        @Test
        void T0022() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.add(-20, 5));
        }


        @DisplayName("Add -5 and 20")
        @Test
        void T0032() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.add(20, -5));
        }

        @DisplayName("Add -20 and -5")
        @Test
        void T0042() throws NegativeNumberException {
            assertThrows(NegativeNumberException.class, () -> calculator.add(-20, -5));
        }

        @DisplayName("Add 0 and 20")
        @Test
        void T0052() throws NegativeNumberException {
            assertEquals(20, calculator.add(0, 20));
        }

        @DisplayName("Add 20 and 0")
        @Test
        void T0062() throws NegativeNumberException {
            assertEquals(20, calculator.add(20, 0));
        }
    }
}








