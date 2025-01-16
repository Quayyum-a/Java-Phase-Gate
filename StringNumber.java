public class StringNumber {
	public static void main(String... args){
		String digits = ("1210");
		System.out.println(findTrue(digits));
	}
	public static boolean findTrue(String numbers){
	
	for (int count = 0; count < numbers.length; count++){
		for (int counter = 0; counter < numbers.length;){
			if (numbers.charAt(count) == numbers.charAt(counter) ){
				System.out.print("true");
			}else{
				System.out.print("false");
			}
		}
	}
	}
		return true;

}
}
