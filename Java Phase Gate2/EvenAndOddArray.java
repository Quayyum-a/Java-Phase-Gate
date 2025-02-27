 public class EvenAndOddArray{
 public int[] convertArray(int[] arr) {
        for (int count = 0; count < arr.length; count++) {
            if (arr[count] % 2 == 0) { 
                arr[count] = 0; 
            } else {
                arr[count] = 1; 
            }
        }
		  return arr;
    }
 } 


