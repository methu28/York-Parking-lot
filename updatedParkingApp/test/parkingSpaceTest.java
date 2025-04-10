import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.StudentUser;
import parkingSystem.model.VisitorUser;
import parkingSystem.model.parking.Booking;
import parkingSystem.model.parking.ParkingLot;
import parkingSystem.model.parking.ParkingSpace;

class parkingSpaceTest {


	private ParkingSpace space;
    private ParkingLot lot;

    @BeforeEach
    void setUp() {
        lot = new ParkingLot("Test Lot");
        space = new ParkingSpace(1, lot);
    }

    @Test
    void initialState() {
        assertTrue(space.isEnabled());
        assertFalse(space.isOccupied());
        assertEquals(1, space.getId());
        assertEquals(lot, space.getLot());
    }

    @Test
    void enableDisable() {
        space.disable();
        assertFalse(space.isEnabled());
        space.enable();
        assertTrue(space.isEnabled());
    }

    @Test
    void setOccupied() {
        space.setOccupied(true);
        assertTrue(space.isOccupied());
        space.setOccupied(false);
        assertFalse(space.isOccupied());
    }

    @Test
    void addAndRemoveBooking() {
    	VisitorUser user = new VisitorUser("bonny", "bonny@gmail.com", "mario-1");
        Booking booking = new Booking(user, space,
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2),
                "ABC123");

        space.addBooking(booking);
        assertTrue(space.getBookings().contains(booking));

        space.removeBooking(booking);
        assertFalse(space.getBookings().contains(booking));
    }

    @Test
    void isAvailableNoConflict() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);

        assertTrue(space.isAvailable(start, end));
    }

    @Test
    void isAvailableWithConflict() {
    	StudentUser user = new StudentUser("mark", "mark@gmail.com", "pass-12");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);

        Booking booking = new Booking(user, space, start, end, "DEF456");
        space.addBooking(booking);

        assertFalse(space.isAvailable(start, end)); 
    }

    @Test
    void getNextAvailableTime() {
    	VisitorUser user = new VisitorUser("borko", "borko@gmail.com", "pa-12");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);

        Booking booking = new Booking(user, space, start, end, "XYZ");
        space.addBooking(booking);

        LocalDateTime expected = end.plusMinutes(5);
        LocalDateTime actual = space.getNextAvailableTime(start);
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        assertEquals("Lot 1", space.toString());
    }
}
