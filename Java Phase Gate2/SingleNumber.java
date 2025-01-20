public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int count = 0; count < nums.length; count++) {
            int counter = 0;
            for (int count2 = 0; count2 < nums.length; count2++) {
                if (nums[count] == nums[count2]) {
                    counter++;
                }
            }
            if (counter == 1) {
                return nums[count];
            }
        }
        return -1;
    }
}
