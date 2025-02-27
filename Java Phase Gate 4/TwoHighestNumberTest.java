import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoHighestNumberTest{

    @Test
    public void testThatMethodReturnsTwoHighest(){
        TwoHighestNumber findHighest = new TwoHighestNumber();
        int[] actual = {1,39,74,10000,74,37,2};
        int[] expect = {10000, 74};
        assertArrayEquals(expect, findHighest.getHighest(actual));
    }
    @Test
    public void testThatMethodReturnsTwoHighest(){
        TwoHighestNumber findHighest = new TwoHighestNumber();
        int[] actual = {38,39,74,10000,74,37,2};
        int[] expect = {10000, 74};
        assertArrayEquals(expect, findHighest.getHighest(actual));
    }
}
