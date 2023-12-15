import java.time.LocalTime;

/**
 * @author Jamith Nimantha
 */
public class Museum extends Attraction{
    private String location;
    private int numberOfExhibits;
    private boolean hasGuidedTours;


    public Museum(String name, double price, LocalTime openTime, LocalTime closeTime, String location, int numberOfExhibits, boolean hasGuidedTours) {
        super(name, price, openTime, closeTime);
        this.location = location;
        this.numberOfExhibits = numberOfExhibits;
        this.hasGuidedTours = hasGuidedTours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfExhibits() {
        return numberOfExhibits;
    }

    public void setNumberOfExhibits(int numberOfExhibits) {
        this.numberOfExhibits = numberOfExhibits;
    }

    public boolean isHasGuidedTours() {
        return hasGuidedTours;
    }

    public void setHasGuidedTours(boolean hasGuidedTours) {
        this.hasGuidedTours = hasGuidedTours;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "openTime=" + getOpenTime() +
                ", closeTime=" + getCloseTime() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", location='" + getLocation() + '\'' +
                ", numberOfExhibits=" + getNumberOfExhibits() +
                ", hasGuidedTours=" + isHasGuidedTours() +
                '}';
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Location: " + getLocation());
        System.out.println("Number of exhibits: " + getNumberOfExhibits());
        System.out.println("Has guided tours: " + (isHasGuidedTours() ? "Yes" : "No"));
    }

}
