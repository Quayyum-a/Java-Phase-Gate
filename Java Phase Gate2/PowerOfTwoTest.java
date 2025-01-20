import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PowerOfTwoTest{
	
	@Test
	public void testThatFuctionReturnsTrue(){
		PowerOfTwo pow = new PowerOfTwo();
		
		assertEquals(true, pow.isPowerOfTwo(1));
	}
		
	@Test
	public void testThatFuctionReturnsFalse(){
		PowerOfTwo pow = new PowerOfTwo();
		
		assertEquals(false, pow.isPowerOfTwo(3));
		
	}
	
	@Test
	public void testThatFuctionReturnsFalseWhenZeroIsEntered(){
		PowerOfTwo pow = new PowerOfTwo();
		
		assertEquals(false, pow.isPowerOfTwo(0));
		
	}
}