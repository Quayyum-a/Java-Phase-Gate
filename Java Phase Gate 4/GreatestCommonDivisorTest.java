import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreatestCommonDivisorTest{

	@Test
	public void testThatGreatestCommonDivisorWorks(){
		GreatestCommonDivisor divide = new GreatestCommonDivisor();
		assertEquals(1, divide.divisor(1,0));

	}
}