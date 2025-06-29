import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("Running testSecond");
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("Running testFirst");
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("Running testThird");
    }
}

