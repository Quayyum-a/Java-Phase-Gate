public class TwoHighestNumber {
    public int[] getHighest(int[] nums) {
       
        int highest1 = nums[0];
        int highest2 = nums[1];
        for (int count = 2; count < nums.length; count++) {
            if (nums[count] > highest1) {
                highest2 = highest1;
                highest1 = nums[count];
            } else if (nums[count] > highest2) {
                highest2 = nums[count];
            }
        }return new int[] { highest1, highest2 };
    }

}