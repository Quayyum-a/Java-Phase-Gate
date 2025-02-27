public class HighestNumber {
	public int[] getHighestIndex(int[][] numbers) {
        
	int row = 0;
        int column = 0;
        int highest = numbers[0][0];
        
        for (int count = 0; count < numbers.length; count++) {
            for (int counter = 0; counter < numbers[count].length; counter++) {
                if (numbers[count][counter] > highest) {
                    highest = numbers[count][counter];
                    row = count;
                    column = counter;
                }
            }
        }
        int[] result = {row, column};
        System.out.println("Row: " + row + " Column: " + column);
        
        return result; 
    }
}
