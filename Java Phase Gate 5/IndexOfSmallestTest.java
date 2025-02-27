import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IndexOfSmallestTest {
    
    @Test                                                                   
    public void testThatFunctionReturnsUniqueNumber() {
        IndexOfSmallest smallest = new IndexOfSmallest();
        int[] actual = {-8, 0, 3, 4, -1};
        int expected = 0; 
        assertEquals(expected, smallest.indexFinder(actual));
    }
}

