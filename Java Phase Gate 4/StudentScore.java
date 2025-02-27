public class StudentScore {
    public int[] getScore(int[][] nums) {
int[] total = new int[3];
	for(int column = 0; column < nums[0].length; column++){
		for (int row = 0; row < nums.length; row++){
			total += nums[row][column]
		}
		int highest = 0;
		for(int count = 0; count < total.length; count++){
			if(total[count] > highest){
				highest = total:
			}

		}
	}return highest;

    }
}