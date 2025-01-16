public class PrimeNumber {
    public static boolean isPrime(int number) {
        for (int count = 2; count <= number * number; count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String... args) {
        int number = 6; 
        
		System.out.println(isPrime(number));
        
           
        
}
}