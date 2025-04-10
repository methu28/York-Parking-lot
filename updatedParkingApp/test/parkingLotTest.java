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
    void get100Spaces() {
        List<ParkingSpace> spaces = lot.getSpaces();
        assertEquals(100, spaces.size(), "Should create exactly 100 spaces");
    }

    @Test
    void getLocation() {
        assertEquals("TestLocation", lot.getLocation(), "The location should be 'TestLocation'");
    }

    @Test
    void setLocation() {
        lot.setLocation("NewLocation");
        assertEquals("NewLocation", lot.getLocation(), "Location should be updated to 'NewLocation'");
    }

    @Test
    void GetOpenSpace() {
        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertEquals(100, openSpaces.size(), "Initially, all spaces should be open");
    }

    @Test
    void occupiedSpace() {
        ParkingSpace space = lot.getSpaces().get(0); 
        space.setOccupied(true); 

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space), "Occupied space shouldn't be in open spaces list");
        assertEquals(99, openSpaces.size(), "99 spaces open");
    }

    @Test
    void disabledSpaces() {
        ParkingSpace space = lot.getSpaces().get(1); 
        space.disable(); 

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertFalse(openSpaces.contains(space), "Disabled space shouldn't be in open spaces list");
        assertEquals(99, openSpaces.size(), "99 spaces open");
    }

    @Test
    void setSpacesoverExisiting() {
        List<ParkingSpace> newSpaces = List.of(
                new ParkingSpace(101, lot),
                new ParkingSpace(102, lot)
        );

        lot.setSpaces(newSpaces);
        assertEquals(2, lot.getSpaces().size(), "Spaces should be set to the new list of spaces");
        assertEquals(101, lot.getSpaces().get(0).getId(), "space ID should be 101");
    }

    @Test
    void ToStringReturnsLocation() {
        assertEquals("TestLocation", lot.toString(), "toString should return the location");
    }

    @Test
    void getOpenSpacesOccupied() {
        for (ParkingSpace space : lot.getSpaces()) {
            space.setOccupied(true); 
        }

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertTrue(openSpaces.isEmpty(), "no open spaces when occupied");
    }

    @Test
    void getOpenSpacesDisabled() {
        for (ParkingSpace space : lot.getSpaces()) {
            space.disable(); 
        }

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertTrue(openSpaces.isEmpty(), "no open spaces when disabled");
    }

    @Test
    void getOpenSpaceOccDis() {
        lot.getSpaces().get(0).setOccupied(true);
        lot.getSpaces().get(1).disable();

        List<ParkingSpace> openSpaces = lot.getOpenSpaces();
        assertEquals(98, openSpaces.size(), "98 open spaces when occupied and disabled");
    }
}
