public class UniqueStringIndex {
    public static int index(String word) {
        for (int count = 0; count < word.length(); count++) {
            boolean unique = true;
            for (int counter = 0; counter < word.length(); counter++) {
                if (count != counter && word.charAt(count) == word.charAt(counter)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return count; 
            }
        }
        return -1; 
    }
}
