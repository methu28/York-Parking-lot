import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.database.MaintainUser;
import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;

class maintainuserTest {

	private MaintainUser maintainUser;
    private static final String testCSV = "test_users.csv";

    @BeforeEach
    void setUp() throws Exception {
        maintainUser = new MaintainUser();
        try (PrintWriter writer = new PrintWriter(new FileWriter(testCSV))) {
            writer.println("name,email,password,role,validated");
            writer.println("John Doe,john@example.com,john-123,student,false");
        }
        // Temporarily rename test file to use in test
        Files.copy(new File(testCSV).toPath(), new File("users.csv").toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    @AfterEach
    void tearDown() throws IOException {
        new File(testCSV).delete();
        new File("users.csv").delete();
    }

    @Test
    void testLoadUsers() throws Exception {
        maintainUser.load();
        List<AbstractUser> users = maintainUser.getUsers();
        assertEquals(1, users.size());
        assertEquals("John Doe", users.get(0).getName());
    }

    @Test
    void testAddUser() throws Exception {
        maintainUser.load();
        AbstractUser newUser = new StudentUser("Jane Smith", "jane@example.com", "jane-345");
        maintainUser.addUser(newUser);

        // Reload and check
        maintainUser.load();
        assertEquals(2, maintainUser.getUsers().size());
        assertTrue(maintainUser.getUsers().stream().anyMatch(u -> u.getEmail().equals("jane@example.com")));
    }

    @Test
    void testUpdateDoesNotThrow() {
        assertDoesNotThrow(() -> maintainUser.update());
    }
}
