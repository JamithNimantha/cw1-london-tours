import java.time.LocalTime;

/**
 * @author Jamith Nimantha
 */
public abstract class Attraction {
    private LocalTime openTime;
    private LocalTime closeTime;
    private String name;
    private double price;

     Attraction(String name, double price, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        this.price = price;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    protected LocalTime getOpenTime() {
        return openTime;
    }

    protected void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    protected LocalTime getCloseTime() {
        return closeTime;
    }

    protected void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected boolean isOpenAfter(LocalTime time) {
        return openTime.isBefore(time) && closeTime.isAfter(time);
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    protected void printDetails() {
        String details = String.format("Name: %s\nPrice: %.2f\nOpen Time: %s\nClose Time: %s", name, price , openTime, closeTime);
        System.out.println(details);
    }
}
