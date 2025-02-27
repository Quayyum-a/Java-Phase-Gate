import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoLargestNumberTest{

    @Test
    public void testThatMethodReturnsTwoHighestTestOne(){
        
        int[] actual = TwoLargestNumber.getTwoLargestNumberInAnArray(new int []{1,4,5,6,9,7,10,9});
        int[] expect = {10, 9};
        assertArrayEquals(expect, actual);
    }
	 @Test
    public void testThatMethodReturnsTwoHighestTestTwo(){
        
        int[] actual = TwoLargestNumber.getTwoLargestNumberInAnArray(new int []{1,4,6,8,0,1,2,7});
        int[] expect = {8, 7};
        assertArrayEquals(expect, actual);
    }
	 @Test
    public void testThatMethodReturnsTwoHighestTestThree(){
        
        int[] actual = TwoLargestNumber.getTwoLargestNumberInAnArray(new int []{1,6,7,8,1000});
        int[] expect = {1000, 8};
        assertArrayEquals(expect, actual);
    }
}
