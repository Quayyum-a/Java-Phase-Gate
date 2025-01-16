public class LargestIndex {
    public static int largestIndex(int[] number) {
        int maxIndex = 0;
        for (int count = 1; count < number.length; count++) {
            if (number[count] >= number[maxIndex]) {
                maxIndex = count;
            }
        }
        return maxIndex;
    }
    
    public static void main(String... args) {
        int[] input = {1, 5, 3, 4, 2, 3};
        System.out.println(largestIndex(input));
    }
}
