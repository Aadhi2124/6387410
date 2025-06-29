import org.example.ExceptionThrower;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testThrowException() {
        ExceptionThrower thrower = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, thrower::throwException);
    }
    @Test
    void testThrowExceptionWithMessage() {
        ExceptionThrower thrower = new ExceptionThrower();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                thrower::throwException
        );

        // Verify the exception message
        assertEquals("Invalid input Provided", exception.getMessage());
    }

}
