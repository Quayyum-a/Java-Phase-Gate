public class IndexOfSmallest {
    public int indexFinder(int[] numbers) {
        int lowestIndex = 0; 
        for (int count = 1; count < numbers.length; count++) { 
            if (numbers[count] < numbers[lowestIndex]) { 
                lowestIndex = count; 
            }
        }
        return lowestIndex; 
    }
}
