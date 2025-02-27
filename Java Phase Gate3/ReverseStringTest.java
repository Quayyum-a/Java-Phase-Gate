import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseStringTest{
	
	@Test                                                                   
	public void testThatFunctionReturnsWordReversed(){
		ReverseString reverse = new ReverseString();
		assertEquals("DCBA", reverse.reverseString("ABCD"));
	}
	
	@Test                                                                   
	public void testThatFunctionReturnsAllReversed(){
		ReverseString reverse = new ReverseString();
		assertEquals("uoy era woh", reverse.reverseString("how are you"));
	}
}