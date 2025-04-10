import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.SuperManager;

class superManagerTest {

	SuperManager manager;

	@BeforeEach
	void setUp() {
		manager = new SuperManager("John Doe", "john.doe@yorku.ca", "ABC123", "StrongPass123");
	}

	@Test
	void testCreation() {
		assertNotNull(manager);
		assertEquals("John Doe", manager.getName());
		assertEquals("john.doe@yorku.ca", manager.getEmail());
		assertEquals("ABC123", manager.getLicensePlate());
	}

	@Test
	void testRoleIsSuperManager() {
		assertEquals("supermanager", manager.getRole().toLowerCase());
	}

	@Test
	void testNullNameShouldBeHandled() {
		SuperManager m = new SuperManager(null, "x@y.ca", "123", "pass");
		assertNull(m.getName());
	}

	@Test
	void testToStringIncludesEmail() {
		assertTrue(manager.toString().contains("john.doe@yorku.ca"));
	}
}
