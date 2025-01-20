import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SingleNumberTest{
	@Test                                                                   
	public void testThatFunctionReturnsCorrectValue(){
		SingleNumber onlyNumber = new SingleNumber();
		assertEquals(1, onlyNumber.singleNumber(new int[] {2, 2, 1}));
	}
}

