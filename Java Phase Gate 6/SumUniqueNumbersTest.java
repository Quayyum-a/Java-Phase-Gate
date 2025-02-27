import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumUniqueNumbersTest {
    
    @Test                                                                   
    public void testThatMethodReturnsTheSumOfUniqueNumbers() {
        int  actual = SumUniqueNumbers.sumOfUniqueElements(new int []{1,2,3,2});
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test                                                                   
    public void testThatMethodReturnsTheSumOfUniqueNumbersTestTwo() {
        int  actual = SumUniqueNumbers.sumOfUniqueElements(new int []{1,1,1,1,1});
        int expected = 0;
        assertEquals(expected, actual);
    }
}



