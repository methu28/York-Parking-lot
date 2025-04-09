import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.parking.ParkingLot;
import parkingSystem.model.parking.ParkingSpace;

class parkingLotTest {


    private ParkingLot lot;

    @BeforeEach
    void setUp() {
        lot = new ParkingLot("TestLocation");
    }

    @Test
    void testConstructorCreates100Spaces() {
        List<ParkingSpace> spaces = lot.getSpaces();
        assertEquals(100, spaces.size());
    }

    @Test
    void testGetLocation() {
        assertEquals("TestLocation", lot.getLocation());
    }

    @Test
    void testSetLocation() {
        lot.setLocation("NewLocation");
        assertEquals("NewLocation", lot.getLocation());
    }

    @Test
    void testGetOpenSpacesInitiallyAllOpen() {
        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertEquals(100, openSpaces.size());
    }

    @Test
    void testOccupiedSpaceNotReturnedByGetOpenSpaces() {
        ParkingSpace space = lot.getSpaces().get(0); 
        space.setOccupied(true);

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space));
        assertEquals(99, openSpaces.size());
    }

    @Test
    void testDisabledSpaceNotReturnedByGetOpenSpaces() {
        ParkingSpace space = lot.getSpaces().get(1); 
        space.disable();

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space));
        assertEquals(99, openSpaces.size());
    }

    @Test
    void testSetSpacesOverridesExistingSpaces() {
        List<ParkingSpace> newSpaces = List.of(
                new ParkingSpace(101, lot),
                new ParkingSpace(102, lot)
        );

        lot.setSpaces(newSpaces);
        assertEquals(2, lot.getSpaces().size());
        assertEquals(101, lot.getSpaces().get(0).getId());
    }

    @Test
    void testToStringReturnsLocation() {
        assertEquals("TestLocation", lot.toString());
    }
}
