public class MedianFinder {
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];

        int index = 0;
        
        for (int arr1Index = 0; arr1Index < len1; arr1Index++) {
            merged[index] = arr1[arr1Index];
            index++;
        }
        for (int arr2Index = 0; arr2Index < len2; arr2Index++) {
            merged[index] = arr2[arr2Index];
            index++;
        }

        
        for (int outerIndex = 0; outerIndex < merged.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < merged.length - 1 - outerIndex; innerIndex++) {
                if (merged[innerIndex] > merged[innerIndex + 1]) {
                    int temp = merged[innerIndex];
                    merged[innerIndex] = merged[innerIndex + 1];
                    merged[innerIndex + 1] = temp;
                }
            }
        }

       
        double median;
        int totalLength = merged.length;
        if (totalLength % 2 == 0) {
            median = (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;
        } else {
            median = merged[totalLength / 2];
        }

        return median;
    }
}
