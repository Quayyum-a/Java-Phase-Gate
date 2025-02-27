import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IndexOfHighestNumberTest{
	
	@Test
	public void testThatFunctionReturnsCorrectValue(){
		int[][] inputArray = {{1, 2, 3}, {4, 5, 6}};
		int[] expectedArray = {1, 2};
		IndexOfHighestNumber index = new IndexOfHighestNumber();
		assertArrayEquals(expectedArray, index.indexOfNum(inputArray));
	}
	
	@Test
	public void testThatFunctionReturnsCorrectValueAgain(){
		int[][] inputArray = {{1, 2, 3}, {9, 5, 2}};
		int[] expectedArray = {1, 0};
		IndexOfHighestNumber index = new IndexOfHighestNumber();
		assertArrayEquals(expectedArray, index.indexOfNum(inputArray));
	}
	
}
