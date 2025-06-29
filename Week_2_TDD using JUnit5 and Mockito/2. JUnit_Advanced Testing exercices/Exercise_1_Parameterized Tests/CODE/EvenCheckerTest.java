import org.example.EvenChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    private final EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,100})
    void testIsEven(int input){
        assertTrue(checker.isEven(input),input + " Should be Even");
    }

}
