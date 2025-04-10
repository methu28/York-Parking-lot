import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.ManagerUser;
import parkingSystem.model.SuperManager;

class superManagerTest {

    @AfterEach
    void tearDown() {
        try {
            java.lang.reflect.Field instanceField = SuperManager.class.getDeclaredField("instance");
            instanceField.setAccessible(true);
            instanceField.set(null, null);
        } catch (Exception e) {
            fail("Failed to reset SuperManager singleton: " + e.getMessage());
        }
    }

    @Test
    void generateSuperManager() {
        SuperManager superManager = SuperManager.generateSuperManagerAccount("roe", "roe@gmail.com", "secure-12");

        assertNotNull(superManager);
        assertEquals("roe", superManager.getName());
        assertEquals("roe@gmail.com", superManager.getEmail());
        assertEquals("secure-12", superManager.getPassword());
    }

    @Test
    void generateSuperManagerthrow() {
        SuperManager first = SuperManager.generateSuperManagerAccount("minp", "minp@gmail.com", "lose-3");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SuperManager.generateSuperManagerAccount("cody", "cody@gmail.com", "pass-2");
        });

        assertEquals("Instance already exists", exception.getMessage());
        assertSame(first, SuperManager.getInstance());
    }

    @Test
    void getInstanceNull() {
        assertNull(SuperManager.getInstance());
    }

    @Test
    void getInstanceReturnsSameObject() {
        SuperManager created = SuperManager.generateSuperManagerAccount("ioe", "ioe@gmail.com", "mio0-2");
        SuperManager fetched = SuperManager.getInstance();

        assertSame(created, fetched);
    }

    @Test
    void generateManagerAccount() {
        SuperManager superManager = SuperManager.generateSuperManagerAccount("asl", "asl@gmail.com", "pop-2");
        ManagerUser manager = superManager.generateManagerAccount("pop", "pop@gmail.com", "pop-90");

        assertNotNull(manager);
        assertEquals("pop", manager.getName());
        assertEquals("pop@gmail.com", manager.getEmail());
        assertEquals("pop-90", manager.getPassword());
    }

    @Test
    void toStringFormat() {
        SuperManager superManager = SuperManager.generateSuperManagerAccount("mark", "mark@gmail.com", "mark-2");

        String expected = "Super Manager: mark (mark-2)";
        assertEquals(expected, superManager.toString());
    }

}
