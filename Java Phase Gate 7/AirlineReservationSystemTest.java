import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AirlineReservationSystemTest {
    
    @Test
    public void testThatFunctionReturnsHeading() {
        String actual = AirlineReservationSystem.getHeading();
        String expected = "Welcome to Airline Reservation System!";
        assertEquals(expected, actual);
    }

    @Test
    public void testThatFunctionReturnsMenu() {
        String actual = AirlineReservationSystem.getMenu();
        String expected = "\n1. First Class\n2. Economy Class\n3. Exit";
        assertEquals(expected, actual);
    }

    @Test
    public void testThatFunctionReturnsChoiceOne() {
        int actual = AirlineReservationSystem.getChoice(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testThatFunctionReturnsBookingFirstClassSeat() {
        String actual = AirlineReservationSystem.getFirstClass();
        assertTrue(actual.startsWith("Thank you, you have successfully booked a First class seat and your seat number is No: "));
    }
    @Test
    public void testThatFunctionReturnsBookingEconomyClassSeat() {
        String actual = AirlineReservationSystem.getEconomyClass();
        assertTrue(actual.startsWith("Thank you, you have successfully booked an Economy class seat and your seat number is No: "));
    }
}
