import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import parkingSystem.model.util.Generator;

import java.util.HashSet;
import java.util.Set;

class generatorTest {

	@Test
	void testGenerateUniqueIDs() {
		Set<String> generated = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
			String id = Generator.generateUniqueID();
			assertFalse(generated.contains(id), "Duplicate ID found");
			generated.add(id);
		}
	}

	@Test
	void testGenerateIDLength() {
		String id = Generator.generateUniqueID();
		assertTrue(id.length() >= 6, "ID too short");
	}

	@Test
	void testGenerateIDFormat() {
		String id = Generator.generateUniqueID();
		assertTrue(id.matches("[A-Za-z0-9]+"), "ID should be alphanumeric");
	}
}
