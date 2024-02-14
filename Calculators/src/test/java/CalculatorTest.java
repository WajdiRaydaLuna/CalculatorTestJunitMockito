import com.codeforall.online.Brain;
import com.codeforall.online.Calculator;
import com.codeforall.online.Display;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorTest {
    private Calculator calculator;
    private Brain brain;
    private Display display;

    @Before
    public void setUp() {
        brain = mock(Brain.class);
        display = mock(Display.class);
        this.calculator = new Calculator(brain, display);
    }

    @Test
    public void testSum() {
        //Set up the mock object
        when(brain.add(5, 5)).thenReturn(10);
        //exercise the method
        calculator.sum(5, 5);
        //Verify the method call
        verify(brain).add(5, 5);
        verify(display, times(1)).show(10);
    }
}
