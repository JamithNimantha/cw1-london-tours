import java.time.LocalTime;

/**
 * @author Jamith Nimantha
 */
public class Theatres extends Attraction{
    private int numberOfSeats;
    private String numberOfShows;
    Theatres(String name, double price, LocalTime openTime, LocalTime closeTime) {
        super(name, price, openTime, closeTime);
    }
}
