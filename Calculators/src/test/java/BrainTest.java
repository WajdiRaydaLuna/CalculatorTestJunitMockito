import com.codeforall.online.Brain;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrainTest {
    private Brain brain;
    @Before
    public void setUp(){
        brain = new Brain();
    }
    @Test
    public void testAdd(){
        int result = brain.add(5, 3);
        assertEquals(8, result);
    }
    @Test
    public void testSubstact(){
        int result = brain.subtract(5, 3);
        assertEquals(2, result);
    }
    @Test
    public void testMultiply(){
        int result = brain.multiply(5, 3);
        assertEquals(15, result);
    }
    @Test
    public void testDivide(){
        int result = brain.divide(6, 3);
        assertEquals(2, result);
    }

    // Add a test to check that the add method throws an IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testaddshouldNotaddingNegativeNumbers(){
            brain.add(-5, 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testsubtractshouldNotsubtractingNegativeNumbers(){
            brain.subtract(-5, 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testmultiplyshouldNotmultiplyingNegativeNumbers(){
            brain.multiply(-5, 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testdivideshouldNotdividingNegativeNumbers(){
            brain.divide(-5, 3);
    }
}
