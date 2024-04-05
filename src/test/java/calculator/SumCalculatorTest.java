package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new SumCalculator();
    }

    @Test
    void testThatSumOneWorksCorrect() {

        // When
        int actual = calc.sum(1);

        // Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumThreeWorksCorrect() {

        // When
        int actual = calc.sum(3);

        // Then
        int expected = 6; // Should be 6 if you're summing from 1 to 3
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumExceptionWorksCorrect() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}