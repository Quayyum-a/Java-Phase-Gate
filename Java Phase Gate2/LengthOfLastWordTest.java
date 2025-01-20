import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LengthOfLastWordTest{
	
	@Test
	public void testThatFunctionExist(){
		LengthOfLastWord length = new LengthOfLastWord();
		assertEquals(2, length.lenOfWord("Hello This Is a test oh"));
	}
	@Test
	public void testThatFunctionReturnCorrectValue(){
		LengthOfLastWord length = new LengthOfLastWord();
		assertEquals(5, length.lenOfWord("Hello, world"));
	}
}