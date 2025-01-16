public class OccurrenceCount {

    public static void main(String... args) {
        String text = "hello world";
        char character = 'o';
        int count = countOccurrences(text, character);
        System.out.println("Number of occurrences of " + character + " in \"" + text + "\": " + count);
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int counter = 0; counter < str.length(); counter++) {
            if (str.charAt(counter) == ch) {
                count++;
            }
        }
        return count;
    }
}
