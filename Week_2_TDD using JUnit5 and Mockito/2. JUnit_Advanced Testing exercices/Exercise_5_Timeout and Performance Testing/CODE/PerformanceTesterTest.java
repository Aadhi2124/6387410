import org.example.PerformanceTester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformTaskTimeout() {
        PerformanceTester tester = new PerformanceTester();

        // Ensure task completes within 500 milliseconds
        assertTimeout(Duration.ofMillis(500), tester::performTask);
    }
}
