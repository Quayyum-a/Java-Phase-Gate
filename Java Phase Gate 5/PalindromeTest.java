import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest{
	
	@Test                                                                   
	public void testThatFunctionReturnsPalindrome(){
		Palindrome pal = new Palindrome();
		assertEquals(true, pal.isPalindrome(454));
	}
}