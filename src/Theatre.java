import java.time.LocalTime;

/**
 * @author Jamith Nimantha
 */
public class Theatre extends Attraction{
    private int numberOfSeats;
    private int numberOfShows;


    public Theatre(String name, double price, LocalTime openTime, LocalTime closeTime, int numberOfSeats, int numberOfShows) {
        super(name, price, openTime, closeTime);
        this.numberOfSeats = numberOfSeats;
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "openTime=" + getOpenTime() +
                ", closeTime=" + getCloseTime() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", numberOfSeats=" + getNumberOfSeats() +
                ", numberOfShows=" + getNumberOfShows() +
                '}';
    }

    @Override
    protected void printDetails() {
        super.printDetails();
        System.out.println("Number of seats: " + getNumberOfSeats());
        System.out.println("Number of shows: " + getNumberOfShows());
    }
}
