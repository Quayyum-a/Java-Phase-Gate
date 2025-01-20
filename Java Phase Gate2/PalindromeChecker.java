public class PalindromeChecker {
	public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num != 0) {
            int lastDigit = num % 10;  
            reversedNum = reversedNum * 10 + lastDigit;  
            num /= 10;  
        }
        return originalNum == reversedNum;
    }
}