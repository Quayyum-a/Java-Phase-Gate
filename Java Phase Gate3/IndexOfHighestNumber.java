public class IndexOfHighestNumber{
	public static int[] indexOfNum(int[][] number){
		 int biggestNumber = number[0][0];
		 int rowIndex = 0;
		 int columnIndex = 0;
		 
		 for (int count = 0; count < number.length; count++) {
            for (int counter = 0; counter < number[count].length; counter++) {
                if (number[count][counter] > biggestNumber) {
                    biggestNumber = number[count][counter];
                    rowIndex = count;
                    columnIndex = counter;
                }
            }
        } 
			return new int[] {rowIndex, columnIndex};
	}
}