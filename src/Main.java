import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jamith Nimantha
 */

public class Main {
    public static void main(String[] args) {
        List<Attraction> attractions = new ArrayList<>();
        attractions.add(new Park("Hyde Park", LocalTime.of(6, 0), LocalTime.of(20, 0), 4, 2223.21));
        attractions.add(new Park("Green Park", LocalTime.of(6, 0), LocalTime.of(18, 0), 21, 4223.21));
        attractions.add(new Park("St James's Park", LocalTime.of(8, 0), LocalTime.of(22, 0), 0, 10223.21));

        attractions.add(new Theatre("Theatre Royal", 2.50, LocalTime.of(8, 45), LocalTime.of(22, 0), 200, 5));
        attractions.add(new Theatre("The Old Vic", 5.25, LocalTime.of(10, 0), LocalTime.of(22, 0), 1000, 10));
        attractions.add(new Theatre("The Globe", 3.50, LocalTime.of(10, 0), LocalTime.of(22, 0), 50, 1));
        attractions.add(new Theatre("The Royal Court", 1.50, LocalTime.of(10, 0), LocalTime.of(22, 0), 500, 3));
        attractions.add(new Theatre("The Young Vic", 6.45, LocalTime.of(10, 0), LocalTime.of(22, 0), 500, 2));

        attractions.add(new Museum("British Museum", 0.0, LocalTime.of(9, 0), LocalTime.of(23, 0), "Great Russell St, Bloomsbury, London", 100, true));
        attractions.add(new Museum("Natural History Museum", 0.0, LocalTime.of(10, 0), LocalTime.of(23, 0), "Cromwell Rd, South Kensington, London", 200, false));
        attractions.add(new Museum("Victoria and Albert Museum", 2.50, LocalTime.of(10, 0), LocalTime.of(18, 45), "Cromwell Rd, South Kensington, London", 300, true));
        attractions.add(new Museum("Science Museum", 6.45, LocalTime.of(10, 6), LocalTime.of(23, 0), "Exhibition Rd, South Kensington, London", 400, false));
        attractions.add(new Museum("Museum of London", 1.50, LocalTime.of(10, 0), LocalTime.of(23, 0), "150 London Wall, London", 500, true));

        System.out.println("----------------------------------------------------");
        System.out.println("Attractions open after 19:00 and costs less than £5.");
        System.out.println("----------------------------------------------------");
        for (Attraction attraction : attractions) {
            if (attraction.isOpenAfter(LocalTime.of(19, 0)) && attraction.getPrice() < 5.0) {
                attraction.printDetails();
                System.out.println("----------------------------------------------------");

            }
        }
    }
}
