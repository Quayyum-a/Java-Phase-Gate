public class TrianglePrintingProgram {
    public static void main(String... args) {
        for (int count = 1; count <= 10; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.print("   "); 
            
            for (int counter = count; counter <= 10; counter++) {
                System.out.print("*");
            }
            System.out.print("   "); 
            
            for (int counter = 1; counter < count; counter++) {
                System.out.print(" ");
            }
            for (int index = count; index <= 10; index++) {
                System.out.print("*");
            }
            System.out.print("   "); 
            
            for (int counter = count; counter < 10; counter++) {
                System.out.print(" ");
            }
            for (int index = 1; index <= count; index++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
