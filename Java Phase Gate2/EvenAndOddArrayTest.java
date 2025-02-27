import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class EvenAndOddArrayTest {

    @Test
    public void testThatFunctionReturnsCorrectValue() {
        EvenAndOddArray convert = new EvenAndOddArray();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] expectedArray = {1, 0, 1, 0, 1, 0};
        
        assertArrayEquals(expectedArray, convert.convertArray(inputArray));
    }
}
