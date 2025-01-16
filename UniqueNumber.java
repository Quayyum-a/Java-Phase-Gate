public class UniqueNumber{
	public static void main(String... args){
		
		int[] nums = {1, 2, 3, 2};
		
		System.out.print(sumNumber(nums));
	}
	
	public static int sumNumber(int[] numbers){
		int sum = 0;
		for (int count = 0; count < numbers.length; count++){
			if (numbers[count] % 2 == 1){
				 sum += numbers[count]; 
			} 
		}
		return sum;
	}
}
