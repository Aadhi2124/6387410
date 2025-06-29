import org.example.EvenChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class OddCheckerTest {
    @Test
    void testOdd(){
        assertFalse(new EvenChecker().isEven(3));
    }
}
