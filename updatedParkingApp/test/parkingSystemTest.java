import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.SuperManager;
import parkingSystem.model.parking.ParkingLot;
import parkingSystem.model.util.ParkingSystem;

class parkingSystemTest {

	private ParkingSystem ps;

    @BeforeEach
    void setUp() {
        ps = ParkingSystem.getInstance();
        ps.setUsers(new java.util.ArrayList<>());
        ps.setLots(new java.util.ArrayList<>());
    }

    @Test
    void testGenerateSuperManagerCreatesOnce() {
        ps.generateSuperManager("Admin", "admin@parking.com", "supes-12");
        assertEquals(1, ps.getUsers().size());
        assertTrue(ps.getUsers().get(0) instanceof SuperManager);
    }

    @Test
    void testLoginSuccess() throws Exception {
        AbstractUser user = new StudentUser("mike", "mike@gmail.com", "mike-12");
        ps.registerUser(user);
        AbstractUser result = ps.login("mike@gmail.com", "mike-12");
        assertNotNull(result);
        assertEquals("mike", result.getName());
    }

    @Test
    void testLoginFails() {
        AbstractUser result = ps.login("fake@gamil.com", "nope");
        assertNull(result);
    }

    @Test
    void testAddAndGetLots() {
        ParkingLot lot = new ParkingLot("Campus A");
        ps.addLot(lot);
        List<ParkingLot> lots = ps.getLots();
        assertEquals(1, lots.size());
        assertEquals("Campus A", lots.get(0).getLocation());
    }
}
