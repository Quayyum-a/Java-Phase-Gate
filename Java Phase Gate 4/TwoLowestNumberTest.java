import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoLowestNumberTest{

    @Test
    public void testThatMethodReturnsTwoLowest(){
        TwoLowestNumber findLowest = new TwoLowestNumber();
        int[] actual = {38,39,74,83,74,37,2};
        int[] expect = {2, 37};
        assertArrayEquals(expect, findLowest.getLowest(actual));
    }
}
