public class StringNumberFunction{
public static boolean findTrue(String numbers){
	
	for (int count = 0; count < numbers.length; count++){
		for (int counter = 0; counter < numbers.length;)
			if (numbers.charAt(count) ){
				System.out.print("true");
			}else{
				System.out.print("false");
			}
		}
		return true;
}
}