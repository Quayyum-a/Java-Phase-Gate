public class ReverseWord {
    public String reverseWord(String word) {
        String reversed = "";
        for (int count = word.length() - 1; count >= 0; count--) {
            reversed += word.charAt(count);
        }
        return reversed;
    }
}
