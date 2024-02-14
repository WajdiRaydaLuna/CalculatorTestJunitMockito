import com.codeforall.online.Display;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayTest {
    private Display dispaly;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        dispaly = new Display();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testshow() {
        dispaly.show(5);
        assertEquals("Result: 5\n", outContent.toString());
    }
    // Add a test to check that the show method throws an IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testshowshouldNotshowingNegativeNumbers() {
        dispaly.show(-5);
    }
}
