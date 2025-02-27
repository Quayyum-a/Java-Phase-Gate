import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HighestAndlowestNumberTest{
	
	@Test
	public void testThatMethodReturnsHighestAndlowestTestOne(){
		int [] actual = HighestAndlowestNumber.getHighestAndLowestInAnArray(new int []{6,8,900,743,27,46});
		int [] expect = {900, 6};
		
		assertArrayEquals(expect, actual);
	}
}