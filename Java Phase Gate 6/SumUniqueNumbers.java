public class SumUniqueNumbers {
    public static int sumOfUniqueElements(int[] numbers) {
        int uniqueCount = 0;
        int[] uniqueNumbers = new int[numbers.length];
        int sum = 0;

        for (int count = 0; count < numbers.length; count++) {
            int unique = 0;
            for (int counter = 0; counter < numbers.length; counter++) {
                if (numbers[count] == numbers[counter]) {
                    unique++;
                }
            }

            if (unique == 1) {
                uniqueNumbers[uniqueCount] = numbers[count];
                uniqueCount++;
                sum += numbers[count];
            }
        }

        return sum;
      }
}