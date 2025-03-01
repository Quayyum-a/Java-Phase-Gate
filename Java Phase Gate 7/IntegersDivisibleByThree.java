public class IntegersDivisibleByThree{
	public static int getSumOfDivisors(int number){
		number = 30;
		int sum = 0;
		for (int count = 0; count < number; count++){
			if (count % 3 == 0){
				 sum += count;
			}
		}
		return sum;
	}
}