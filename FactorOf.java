public class FactorsOf{
	public static int factor(int number){
		int factorial = 1;
		for(int count = 1; count <= number; count++){
			if (number % count == 0){
				factorial++;
			}
		}
		return factorial;
	}
	
	public static void main(String... args){
		int number = 7;
		
		System.out.print(factor(number));
	}
}