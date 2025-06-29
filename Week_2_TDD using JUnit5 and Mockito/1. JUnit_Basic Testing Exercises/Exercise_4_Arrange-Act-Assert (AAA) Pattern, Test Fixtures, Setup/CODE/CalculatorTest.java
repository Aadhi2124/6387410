import org.example.Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        //setup (runs before each Test)
        calculator = new Calculator();
        System.out.println("SetUp Done");
    }

    @AfterEach
    void tearDown(){
        //Teardown (runs after each Test)
        calculator = null;
        System.out.println("TearDown Done");
    }
    @Test
    public void testAddition(){
        //Arrange
        int a = 5;
        int b = 6;

        //Act
        int result = calculator.add(a,b);

        //Assert
        assertEquals(11,result);
    }
    @Test
    void testMultiplication(){
        //Arrange
        int a = 4;
        int b = 7;

        //Act
        int result = calculator.multiply(a,b);

        //Assert
        assertEquals(28,result);
    }
}
