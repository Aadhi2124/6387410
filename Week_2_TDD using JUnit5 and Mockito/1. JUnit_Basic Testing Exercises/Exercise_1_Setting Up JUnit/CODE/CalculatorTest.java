import org.example.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(3,4);
        assertEquals(7,result);
    }
}
