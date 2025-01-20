public class Descending {
    public static int[] descendingOrder(int[] nums) {
        for (int count = 0; count < nums.length; count++) {
            for (int counter = count + 1; counter < nums.length; counter++) {
                if (nums[count] < nums[counter]) {
                    int temp = nums[count];
                    nums[count] = nums[counter];
                    nums[counter] = temp;
                }
            }
        }
        return nums;
    }
}