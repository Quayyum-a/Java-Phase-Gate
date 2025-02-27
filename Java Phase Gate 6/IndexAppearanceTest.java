import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IndexAppearanceTest{
	
	@Test
	public void testThatMethodReturnsTrueOrFalseOne(){
		boolean actual = IndexAppearance.getIndexCount("1210");
		boolean expect = true;
		assertEquals(expect, actual);
	
	}
	@Test
	public void testThatMethodReturnsTrueOrFalseTestTwo(){
		boolean actual = IndexAppearance.getIndexCount("030");
		boolean expect = false;
		assertEquals(expect, actual);
	
	}
}