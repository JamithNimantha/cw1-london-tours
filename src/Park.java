import java.time.LocalTime;

/**
 * @author Jamith Nimantha
 */
public class Park extends Attraction{
    private int minAge;
    private double areaSize;

    public Park(String name, LocalTime openTime, LocalTime closeTime, int minAge, double areaSize) {
        super(name, 0.0, openTime, closeTime);
        this.minAge = minAge;
        this.areaSize = areaSize;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    @Override
    public String toString() {
        return "Park{" +
                "openTime=" + getOpenTime() +
                ", closeTime=" + getCloseTime() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", minAge=" + getMinAge() +
                ", areaSize=" + getAreaSize() +
                '}';
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Minimum age: " + getMinAge());
        System.out.println("Area size: " + getAreaSize());
    }
}
