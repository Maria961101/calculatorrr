import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(7,3);
        int expected = 10;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtraction(4,3);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiplication(2,3);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void division() {
        Calculator calculator = new Calculator();
        int actual = calculator.division(8,2);
        int expected = 4;
        assertEquals(expected,actual);
    }




}