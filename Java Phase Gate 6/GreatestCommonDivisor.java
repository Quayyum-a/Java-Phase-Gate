public class GreatestCommonDivisor{
	public static int getGreatestCommonDivisor(int num1, int num2){
		if (num1 < num2){
			for (int count = num2; count > 0; count--) {
            if (num1 % count == 0 && num2 % count == 0) {
                return count; 
            }
		  }
		}return 1;
	}
}




