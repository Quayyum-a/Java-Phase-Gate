public class HighestAndlowestNumber{
	public static int[] getHighestAndLowestInAnArray(int[] nums){
		int highest = nums[0];
		int lowest = nums[0];
		for(int count = 0; count < nums.length; count++){
			if (nums[count] > highest){
				highest = nums[count];
			}
		}
			for(int counter = 0; counter < nums.length; counter++){
				if (nums[counter] < lowest){
					lowest = nums[counter];
				}
			}
			return new int []{highest, lowest};
	}
}