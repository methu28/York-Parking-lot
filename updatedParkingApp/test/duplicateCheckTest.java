import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.util.DuplicateChecker;

class duplicateCheckTest {


    private List<AbstractUser> users;

    @BeforeEach
    void setUp() {
        users = new ArrayList<>();
        users.add(new StudentUser("Jane Doe", "jane.doe@example.com", "password123"));
        users.add(new StudentUser("John Smith", "john.smith@example.com", "password456"));
    }

    @Test
    void testUsernameNotTaken() {
        assertTrue(DuplicateChecker.usernameNotTaken(users, "Alice Johnson"));

        assertFalse(DuplicateChecker.usernameNotTaken(users, "Jane Doe"));
    }

    @Test
    void testEmailNotTaken() {
        assertTrue(DuplicateChecker.emailNotTaken(users, "alice.johnson@example.com"));

        assertFalse(DuplicateChecker.emailNotTaken(users, "jane.doe@example.com"));
    }

}
