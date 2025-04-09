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

    // Test Constructor Creates 100 Spaces
    @Test
    void testConstructorCreates100Spaces() {
        List<ParkingSpace> spaces = lot.getSpaces();
        assertEquals(100, spaces.size(), "Should create exactly 100 spaces");
    }

    // Test Location Getter and Setter
    @Test
    void testGetLocation() {
        assertEquals("TestLocation", lot.getLocation(), "The location should be 'TestLocation'");
    }

    @Test
    void testSetLocation() {
        lot.setLocation("NewLocation");
        assertEquals("NewLocation", lot.getLocation(), "Location should be updated to 'NewLocation'");
    }

    // Test Open Spaces (Initially all spaces should be open)
    @Test
    void testGetOpenSpacesInitiallyAllOpen() {
        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertEquals(100, openSpaces.size(), "Initially, all spaces should be open");
    }

    // Test After Occupying One Space (Only 99 open spaces should remain)
    @Test
    void testOccupiedSpaceNotReturnedByGetOpenSpaces() {
        ParkingSpace space = lot.getSpaces().get(0); // get the first space
        space.setOccupied(true); // Mark it as occupied

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space), "Occupied space should not be in open spaces list");
        assertEquals(99, openSpaces.size(), "Only 99 spaces should be open");
    }

    // Test After Disabling One Space (Only 99 open spaces should remain)
    @Test
    void testDisabledSpaceNotReturnedByGetOpenSpaces() {
        ParkingSpace space = lot.getSpaces().get(1); // get the second space
        space.disable(); // Disable the space

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space), "Disabled space should not be in open spaces list");
        assertEquals(99, openSpaces.size(), "Only 99 spaces should be open");
    }

    // Test setSpaces to Overwrite the Existing Parking Spaces
    @Test
    void testSetSpacesOverridesExistingSpaces() {
        List<ParkingSpace> newSpaces = List.of(
                new ParkingSpace(101, lot),
                new ParkingSpace(102, lot)
        );

        lot.setSpaces(newSpaces);
        assertEquals(2, lot.getSpaces().size(), "Spaces should be set to the new list of spaces");
        assertEquals(101, lot.getSpaces().get(0).getId(), "The first parking space ID should be 101");
    }

    // Test toString Returns Location
    @Test
    void testToStringReturnsLocation() {
        assertEquals("TestLocation", lot.toString(), "toString should return the location");
    }

    // Test getOpenSpaces After All Spaces Are Occupied (No open spaces)
    @Test
    void testGetOpenSpacesWhenAllSpacesOccupied() {
        for (ParkingSpace space : lot.getSpaces()) {
            space.setOccupied(true); // Mark all spaces as occupied
        }

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertTrue(openSpaces.isEmpty(), "There should be no open spaces when all are occupied");
    }

    // Test getOpenSpaces After Disabling All Spaces (Should not be open)
    @Test
    void testGetOpenSpacesWhenAllSpacesDisabled() {
        for (ParkingSpace space : lot.getSpaces()) {
            space.disable(); // Disable all spaces
        }

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertTrue(openSpaces.isEmpty(), "There should be no open spaces when all are disabled");
    }

    // Test getOpenSpaces With Some Disabled and Some Occupied
    @Test
    void testGetOpenSpacesWithSomeDisabledAndOccupied() {
        // Occupy some spaces and disable others
        lot.getSpaces().get(0).setOccupied(true);
        lot.getSpaces().get(1).disable();

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertEquals(98, openSpaces.size(), "There should be 98 open spaces when some are occupied and some disabled");
    }
}
