import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegersDivisibleByThreeTest{
	
	@Test
	public void testThatMethodReturnsSumOfIntegersDivisibleByThree(){
		int actual = IntegersDivisibleByThree.getSumOfDivisors(30);
		int expected = 135;
		
		assertEquals(expected, actual);
	}
}