public class IndexAppearance {
    public static boolean getIndexCount(String num) {
        for (int count = 0; count < num.length(); count++) {
            int index = 0;
            for (int counter = 0; counter < num.length(); counter++) {
                if (count == Character.getNumericValue(num.charAt(counter))) {
                    index++;
                }
            }
            if (index != Character.getNumericValue(num.charAt(count))) {
                return false;
            }
        }
        return true;
    }
}
