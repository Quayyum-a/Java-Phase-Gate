public class ConsecutiveNumbers{
	public static boolean con(int[] numbers){
		int count = 1;
		for(int counter = 1; counter < numbers.length; counter++){
			if (numbers[counter] == numbers[counter]){
				count += 1;
				if(count == 4){
					return true;
				}
			}	
		}
		return false;
	}
}