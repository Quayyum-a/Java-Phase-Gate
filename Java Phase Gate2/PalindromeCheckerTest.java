import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeCheckerTest{
	
	@Test
	public void testThatIntegerIsPalindrome(){
		PalindromeChecker palindrome = new PalindromeChecker();
		assertEquals(true, palindrome.isPalindrome(1221));
	}
	
	@Test
	public void testThatIntegerFunctionReturnsFalse(){
		PalindromeChecker palindrome = new PalindromeChecker();
		assertEquals(false, palindrome.isPalindrome(12212));
		
		
	}
	
}