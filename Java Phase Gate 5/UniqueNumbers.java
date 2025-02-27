public class UniqueNumbers {
    public int[] findUnique(int[] numbers) {
        int uniqueCount = 0;
        int[] uniqueNumbers = new int[numbers.length];

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
            }
        }

        int[] result = new int[uniqueCount];
        for (int index = 0; index < uniqueCount; index++) {
            result[index] = uniqueNumbers[index];
        }

        return result;
    }
}

