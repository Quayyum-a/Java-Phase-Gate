import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class HighestNumberTest {
    
    @Test                                                                   
    public void testThatFunctionReturnsHighestNumber() {
        HighestNumber index = new HighestNumber();
        int[][] actual = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
            int[] expected = {2, 2}; 
            assertArrayEquals(expected, index.getHighestIndex(actual));
    }
}
