package recursionlab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class TriangleNumberCalculatorTest {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();

    @Test
    void testValue() {
        assertEquals(15, calculator.value(5));
        assertEquals(6, calculator.value(3)); 
        assertEquals(1, calculator.value(1)); 
        assertEquals(0, calculator.value(0)); 
    }

    @Test
    void testAdd() {
        assertEquals(16, calculator.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(30, calculator.subtract(9, 5)); 
    }

    @Test
    void testMultiply() {
        assertEquals(36, calculator.multiply(3, 3)); 
    }

    @Test
    void testDivide() {
        assertEquals(0.047619047619047616, calculator.divide(1, 6), 0.0001); 
    }

    @Test
    void testSequence() {
        assertEquals(List.of(1, 3, 6, 10, 15), calculator.sequence(5)); 
    }
}
