import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class UniqueNumbersTest {
    
    @Test                                                                   
    public void testThatFunctionReturnsUniqueNumber() {
        UniqueNumbers unique = new UniqueNumbers();
        int[] actual = {0, 5, 3, 4, 3};
        int[] expected = {0, 5, 4};
        assertArrayEquals(expected, unique.findUnique(actual));
    }
}



