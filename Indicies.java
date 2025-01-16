public class Indices {
    public static int[] findIndices(int[] numbers, int target) {
        for (int count = 0; count < numbers.length; count++) {
            for (int counter = count + 1; counter < numbers.length; counter++) {
                if (numbers[count] + numbers[counter] == target) {
                }
            }
				
        }	
		  
    }
	 

    public static void main(String... args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = findIndices(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
