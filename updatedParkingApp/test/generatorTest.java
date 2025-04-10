import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.util.Generator;

class generatorTest {

	 @Test
	    void testGenerateUniqueUsername() {
	        List<AbstractUser> existingUsers = new ArrayList<>();
	        existingUsers.add(new StudentUser("EpicZeus123", "zeus@example.com", "melon0-1"));

	        String generatedUsername = Generator.generateUniqueUsername(existingUsers);
	        assertNotNull(generatedUsername);
	        assertFalse(generatedUsername.isEmpty());
	        assertNotEquals("EpicZeus123", generatedUsername);
	    }

	    @Test
	    void testGenerateStrongPassword() {
	        String password = Generator.generateStrongPassword();
	        assertNotNull(password);
	        assertEquals(4, password.length()); // one from each group
	        assertTrue(password.matches(".*[A-Z].*"));
	        assertTrue(password.matches(".*[a-z].*"));
	        assertTrue(password.matches(".*[0-9].*"));
	        assertTrue(password.matches(".*[^a-zA-Z0-9].*"));
	    }

}
