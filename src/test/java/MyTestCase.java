import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTestCase {
    @Test
    public void testAddition() {
        int result = Calculator.add(3, 7);
        assertEquals(10, result); // Checks if result equals 10
    }
}
