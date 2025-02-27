import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UniqueStringIndexTest{
	
	@Test
	public void testThatFunctionReturnsCorrectIndex(){
		UniqueStringIndex findIndex = new UniqueStringIndex();
		assertEquals(4, findIndex.index("lleetcode"));
	}
	
	@Test
	public void testThatFunctionReturnsCorrectIndexAgain(){
		UniqueStringIndex findIndex = new UniqueStringIndex();
		assertEquals(4, findIndex.index("maliciouslyma"));
	}
}