import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StudentScoreTest{

    @Test
    public void testThatMethodReturnsStudentScore(){
        StudentScore score = new StudentScore();
        int[][] actual = {
		{30,20,50},
		{10,40,50}
			};
        int[] expect = {2, 0};
        assertArrayEquals(expect, score.getScore(actual));
    }
}

