import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils utils = new MathUtils();
        int result = utils.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        MathUtils utils = new MathUtils();
        int result = utils.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testSquare() {
        MathUtils utils = new MathUtils();
        int result = utils.square(5);
        assertEquals(25, result);
    }
}
