public class LengthOfLastWord{
	public static int lenOfWord(String word) {
        int size = 0;
        int count;
        for (count = word.length() - 1; count >= 0 && word.charAt(count) == ' '; count--) {    
        } 
        for (;count >= 0 && word.charAt(count) != ' '; count--) {
            size++;
        }
        return size;
}
}