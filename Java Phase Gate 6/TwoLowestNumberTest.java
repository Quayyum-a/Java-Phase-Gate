import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoLowestNumberTest{

    @Test
    public void testThatMethodReturnsTwoLowestTestOne(){
        
        int[] actual = TwoLowestNumber.getTwoLowestNumbersInAnArray(new int []{2,2,1});
        int[] expect = {1, 2};
        assertArrayEquals(expect, actual);
    }
	 @Test
    public void testThatMethodReturnsTwoLowestTestTwo(){
        
        int[] actual = TwoLowestNumber.getTwoLowestNumbersInAnArray(new int []{4,1,2,1,2});
        int[] expect = {1, 2};
        assertArrayEquals(expect, actual);
    }
	 @Test
    public void testThatMethodReturnsTwoLowestTestThree(){
        
        int[] actual = TwoLowestNumber.getTwoLowestNumbersInAnArray(new int []{4,7,9,-1,0});
        int[] expect = {-1, 0};
        assertArrayEquals(expect, actual);
    }
}
