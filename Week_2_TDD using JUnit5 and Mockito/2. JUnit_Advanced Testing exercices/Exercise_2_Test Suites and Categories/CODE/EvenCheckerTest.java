import org.example.EvenChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    private final EvenChecker checker = new EvenChecker();

    @Test
    void testIsEven(){
        assertTrue(checker.isEven(4));
    }

}
