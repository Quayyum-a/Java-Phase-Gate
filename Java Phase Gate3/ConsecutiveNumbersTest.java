import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ConsecutiveNumbersTest{
	
	@Test
	public void testThatFunctionReturnsCorrectValue(){
		int[] inputArray = {1, 2, 2, 2, 2, 3};
		ConsecutiveNumbers conNumber = new ConsecutiveNumbers();
		assertEquals(true, conNumber.con(inputArray));

	}
	
	@Test
	public void testThatFunctionReturnsFalse(){
		int[] inputArray = {1, 2, 2, 3, 2};
		ConsecutiveNumbers conNumber = new ConsecutiveNumbers();
		assertEquals(true, conNumber.con(inputArray));

	}
}