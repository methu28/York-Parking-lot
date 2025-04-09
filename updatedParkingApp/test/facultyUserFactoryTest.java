import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.FacultyUser;
import parkingSystem.model.util.factories.FacultyUserFactory;

class facultyUserFactoryTest {

	 @Test
	    void testCreateUser() 
	 {
		 	FacultyUserFactory factory = new FacultyUserFactory();
	        FacultyUser user = (FacultyUser) factory.createUser("John", "john@yorku.ca", "abc123");
	        assertNotNull(user);
	        assertEquals("John", user.getName());
	        assertEquals("john@yorku.ca", user.getEmail());
	        assertEquals("abc123", user.getPassword());
	        assertEquals("Faculty", user.getRole());
	 }

}
