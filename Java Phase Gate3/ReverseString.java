 public class ReverseString{
	public static String reverseString(String word) {
        String reversed = "";
        for (int count = word.length() - 1; count >= 0; count--) {
			  for(int counter = word.length() - 1; counter >=0; counter--){
				  if(word.charAt(count) == ' '){
				  break;
			  }
				  }
            reversed += word.charAt(count);
        }
        return reversed;
    }
}
