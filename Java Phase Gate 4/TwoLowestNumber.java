public class TwoLowestNumber {
    public int[] getLowest(int[] nums) {
       
        int lowest1 = nums[0];
        int lowest2 = nums[1];
        for (int count = 2; count < nums.length; count++) {
            if (nums[count] < lowest1) {
                lowest2 = lowest1;
                lowest1 = nums[count];
            } else if (nums[count] < lowest2) {
                lowest2 = nums[count];
            }
        }
	return new int[] { lowest1, lowest2 };
    }

}