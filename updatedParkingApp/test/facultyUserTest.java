import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.FacultyUser;

class facultyUserTest 
{
	private FacultyUser user;

    @BeforeEach
    void setUp() {
        user = new FacultyUser("Alice", "alice@yorku.ca", "secure123");
    }

    @Test
    void testConstructorSetsValuesCorrectly() {
        assertEquals("Alice", user.getName());
        assertEquals("alice@yorku.ca", user.getEmail());
        assertEquals("secure123", user.getPassword());
        assertEquals("Faculty", user.getRole());
    }

    @Test
    void testGetRateWhenUserIsValid() {
        user.setValid(true); 
        assertEquals(8.0, user.getRate(), 0.01);
    }

    @Test
    void testGetRateWhenUserIsInvalid() {
        user.setValid(false); 
        assertEquals(15.0, user.getRate(), 0.01);
    }

}
