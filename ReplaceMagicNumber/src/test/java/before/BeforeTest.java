package before;

import com.example.demo.StandardOutputTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeforeTest extends StandardOutputTest {
    @Test
    public void testMain() {
        // Expected
        String expected = getExpectedOutput(
                "Andrew walks.",
                "Andrew stops.",
                "Andrew jumps.");

        // Actual
        Main.main(new String[0]);
        String actual = getActualOutput();

        // Assert
        Assertions.assertEquals(expected, actual);
    }

}
