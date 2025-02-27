import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class HighestAndLowestTest{

    @Test
    public void testThatMethodReturnsHighestAndLowest(){
        HighestAndLowest findBoth = new HighestAndLowest();
        int[] actual = {38,29,-1,83,24,7,0};
        int[] expect = {83, -1};
        assertArrayEquals(expect, findBoth.getHighestAndLowest(actual));
    }
}
