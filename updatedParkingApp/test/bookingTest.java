import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.AbstractUser;
import parkingSystem.model.parking.Booking;
import parkingSystem.model.parking.ParkingLot;
import parkingSystem.model.parking.ParkingSpace;

class bookingTest {

	private Booking booking;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private final double testRate = 10.0;

    @BeforeEach
    void setUp() {
        AbstractUser user = new AbstractUser("John", "john@example.com", "password", "Visitor") {
            @Override
            public double getRate() {
                return testRate;  
            }
        };

        ParkingSpace space = new ParkingSpace(1, new ParkingLot("Lot1"));

        startTime = LocalDateTime.parse("2024-04-08T08:00:00");
        endTime = LocalDateTime.parse("2024-04-08T10:00:00");

        booking = new Booking(user, space, startTime, endTime, "XYZ123");
    }

    @Test
    void testConstructor() {
        assertEquals("John", booking.getUser().getName()); // Test user name
        assertEquals("XYZ123", booking.getLicensePlate());  // Test license plate
        assertEquals(startTime, booking.getStartTime());    // Test start time
        assertEquals(endTime, booking.getEndTime());        // Test end time
    }

    @Test
    void testCalculateFees() {
        double expectedFees = 2.0 * testRate;
        assertEquals(expectedFees, booking.calculateFees(), 0.001);
    }

    @Test
    void testExtendTime() {
        LocalDateTime newEndTime = LocalDateTime.parse("2024-04-08T12:00:00");
        booking.extendTime(newEndTime);
        assertEquals(newEndTime, booking.getEndTime());  
    }

    @Test
    void testNoShow() throws NoSuchFieldException, IllegalAccessException {
        booking.noShow();

        Field noShowField = Booking.class.getDeclaredField("noShow");
        noShowField.setAccessible(true);  

        boolean noShowValue = (boolean) noShowField.get(booking);
        assertTrue(noShowValue);  
    }

    @Test
    void testCheckedOut() {
        booking.checkedOut();
        assertTrue(booking.isCheckedOut()); 
    }

    @Test
    void testUpdateTime() {
        LocalDateTime newStartTime = LocalDateTime.parse("2024-04-08T09:00:00");
        LocalDateTime newEndTime = LocalDateTime.parse("2024-04-08T11:00:00");

        booking.updateTime(newStartTime, newEndTime);
        
        assertEquals(newStartTime, booking.getStartTime());
        assertEquals(newEndTime, booking.getEndTime());
    }

    @Test
    void testSetLicensePlate() {
        booking.setLicensePlate("ABC456");
        assertEquals("ABC456", booking.getLicensePlate());  
    }

}
