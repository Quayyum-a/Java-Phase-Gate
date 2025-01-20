import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class DescendingTest {

    @Test
    public void testThatFunctionReturnsCorrectValue() {
        int[] inputArray = {4, 8, 5, 6};
        int[] expectedArray = {8, 6, 5, 4};

        Descending sortDescending = new Descending();
        assertArrayEquals(expectedArray, sortDescending.descendingOrder(inputArray));
    }
}