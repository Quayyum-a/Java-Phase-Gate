import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordTest{
	
	@Test                                                                   
	public void testThatFunctionReturnsReversed(){
		ReverseWord reverse = new ReverseWord();
		assertEquals("woh era uoy", reverse.reverseWord("how are you"));
	}
}
