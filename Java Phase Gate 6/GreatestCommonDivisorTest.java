import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest{
	
    @Test
    public void testFunctionReturnsGreatestDivisorOfTwoNumbers() {
        int actual = GreatestCommonDivisor.getGreatestCommonDivisor(5, 10);
        int expected = 5;
        assertEquals(expected, actual);
    }
	 @Test
    public void testFunctionReturnsGreatestDivisorOfTwoNumbersTestTwo() {
        int actual = GreatestCommonDivisor.getGreatestCommonDivisor(125, 2525);
        int expected = 25;
        assertEquals(expected, actual);
    }
	 @Test
    public void testFunctionReturnsGreatestDivisorOfTwoNumbersAgainTestThree() {
        int actual = GreatestCommonDivisor.getGreatestCommonDivisor(16, 24);
        int expected = 8;
        assertEquals(expected, actual);
    }
}