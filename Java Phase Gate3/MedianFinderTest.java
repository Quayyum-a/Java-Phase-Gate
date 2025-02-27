import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MedianFinderTest {

    @Test
    public void testMixedPositiveAndNegativeNumbers() {
        int[] mixedPositiveNegativeArray1 = {-5, 3, 7, 9};
        int[] mixedPositiveNegativeArray2 = {-2, 4, 6, 8};
        double expectedMedian = 4.5;
        double actualMedian = MedianFinder.findMedianSortedArrays(mixedPositiveNegativeArray1, mixedPositiveNegativeArray2);
        assertEquals(expectedMedian, actualMedian, 0.001);
    }

    @Test
    public void testArraysOfDifferentSizes() {
        int[] differentSizeArray1 = {10, 20, 30, 40, 50};
        int[] differentSizeArray2 = {5, 15, 25};
        double expectedMedian = 22.5;
        double actualMedian = MedianFinder.findMedianSortedArrays(differentSizeArray1, differentSizeArray2);
        assertEquals(expectedMedian, actualMedian, 0.001);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("MedianFinderTest");
    }
}
