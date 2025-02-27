public class HighestAndLowest {
    public int[] getHighestAndLowest(int[] numbers) {
        int highest = numbers[0];
        int lowest = numbers[0];
        
        for (int count = 1; count < numbers.length; count++) {
            if (numbers[count] > highest) {
                highest = numbers[count];
            } else if (numbers[count] < lowest) {
                lowest = numbers[count];
            }
        }
        
        return new int[] { highest, lowest };
    }
}
