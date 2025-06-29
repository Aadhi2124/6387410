
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        OddCheckerTest.class
})
public class AllTests {

}
