public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) return false;
        
        while (number % 2 == 0) {
            number /= 2;
        }
        return number == 1;
    }
}