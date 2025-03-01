import java.util.Random;
import java.util.Scanner;

public class AirlineReservationSystem {
   static boolean [] planeSeats = new boolean [10];
    public static String getHeading() {
        return "Welcome to Airline Reservation System!";
    }

    public static String getMenu() {
        return "\n1. First Class\n2. Economy Class\n3. Exit";
    }

    public static int getChoice(int choice) {
        if (!String.valueOf(choice).matches("[1-3]")) {
            throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 3.");
        }
        return choice;
    }

    public static String getFirstClass() {
        
        for (int count = 0; count <= 5; count++) {
            if (!planeSeats[count]) {
                planeSeats[count] = true;
                return "Thank you, you have successfully booked a First class seat and your seat number is No: " + (count + 1);
            }
        }
        return "First class is full.";
    }
	 
	 public static String getEconomyClass() {
         
        for (int count = 5; count <= 10; count++) {
            if (!planeSeats[count]) {
                planeSeats[count] = true;
                return "Thank you, you have successfully booked an Economy class seat and your seat number is No: " + (count + 1);
            }
        }
        return "Economy class is full.";
    }
    
    public static boolean isFirstClassFull() {
        for (int count = 1; count <= 5; count++) {
            if (!planeSeats[count]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEconomyClassFull() {
        for (int count = 5; count < 10; count++) {
            if (!planeSeats[count]) {
                return false;
            }
        }
        return true;
    }
    
    
    public static boolean isPlaneFull() {
        for (int count = 0; count < planeSeats.length; count++) {
            if (!planeSeats[count]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getHeading());
        
        
        while (!isPlaneFull()) {
            System.out.println("Please type 1 for First Class and Please type 2 for Economy. (Type 3 to Exit)");
            int choice = sc.nextInt();
            try {
                getChoice(choice); 
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            
            switch (choice) {
                case 1: 
                    if (!isFirstClassFull()) {
                        System.out.println(getFirstClass());
                    } else if (!isEconomyClassFull()) {
                        System.out.println("First class is full. Is it acceptable to be placed in Economy? (y/n)");
                        char response = sc.next().charAt(0);
                        if (response == 'y' || response == 'Y') {
                            System.out.println(getEconomyClass());
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                    break;

                case 2: 
                    if (!isEconomyClassFull()) {
                        System.out.println(getEconomyClass());
                    } else if (!isFirstClassFull()) {
                        System.out.println("Economy class is full. Is it acceptable to be placed in First Class? (y/n)");
                        char response = sc.next().charAt(0);
                        if (response == 'y' || response == 'Y') {
                            System.out.println(getFirstClass());
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                    break;

                case 3: 
                    System.out.println("Exiting... Next flight leaves in 3 hours.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
            }
        }
        if (isPlaneFull()) {
            System.out.println("All seats are booked. Next flight leaves in 3 hours.");
        }
        
    }
}

