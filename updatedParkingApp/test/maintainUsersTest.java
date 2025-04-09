import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csvreader.CsvWriter;

import parkingSystem.database.MaintainUsers;
import parkingSystem.model.AbstractUser;
import parkingSystem.model.ManagerUser;
import parkingSystem.model.StudentUser;

class maintainUsersTest {


    private MaintainUsers maintainUsers;
    private File testFile;

    @BeforeEach
    void setUp() throws IOException {
        // Set up MaintainUsers and use a temporary file
        maintainUsers = new MaintainUsers();
        testFile = new File("test_users.csv");

        // Clean up file before each test
        if (testFile.exists()) {
            testFile.delete();
        }
    }

    @Test
    void testLoadUsers() throws Exception {
        // Simulate creating a CSV file for testing
        createTestCSVFile();

        // Load the users from the CSV file
        maintainUsers.load();

        // Verify that the users are loaded correctly
        List<AbstractUser> users = maintainUsers.users;
        assertNotNull(users);
        assertEquals(2, users.size()); // Check if 2 users are loaded
    }

    @Test
    void testAddUser() throws Exception {
        // Add a new user
        maintainUsers.load(); // Loads from existing CSV (empty for now)

        AbstractUser newUser = new ManagerUser("Alice", "alice@example.com", "password123");
        maintainUsers.addUser(newUser);

        // Reload users from the CSV to verify the addition
        maintainUsers.load();
        List<AbstractUser> users = maintainUsers.users;

        // Verify if the new user is added correctly
        assertTrue(users.stream().anyMatch(user -> user.getEmail().equals("alice@example.com")));
    }

    @Test
    void testUpdateUser() throws Exception {
        // Add a new user
        maintainUsers.load(); // Loads from existing CSV (empty for now)
        AbstractUser user = new ManagerUser("John", "john@example.com", "password123");
        maintainUsers.addUser(user);

        // Update user information
        maintainUsers.updateUser("john@example.com", "John Updated", "john.updated@example.com", "newpassword");

        // Reload users from the CSV to verify the update
        maintainUsers.load();
        List<AbstractUser> users = maintainUsers.users;

        // Verify if the user's details have been updated
        AbstractUser updatedUser = users.stream().filter(u -> u.getEmail().equals("john.updated@example.com")).findFirst().orElse(null);
        assertNotNull(updatedUser);
        assertEquals("John Updated", updatedUser.getName());
        assertEquals("newpassword", updatedUser.getPassword());
    }

    @Test
    void testValidateUser() throws Exception {
        // Add users
        maintainUsers.load(); // Loads from existing CSV (empty for now)

        AbstractUser manager = new ManagerUser("Manager", "manager@example.com", "managerpass");
        maintainUsers.addUser(manager);

        AbstractUser student = new StudentUser("Student", "student@example.com", "studentpass");
        maintainUsers.addUser(student);

        // Try to validate the student user
        boolean validationResult = maintainUsers.validateUser("manager@example.com", "student@example.com");
        assertTrue(validationResult);

        // Reload users to verify validation
        maintainUsers.load();
        AbstractUser validatedUser = maintainUsers.getUserByEmail("student@example.com");
        assertTrue(validatedUser.isValidated());
    }

    @Test
    void testGetUserByEmail() throws Exception {
        // Add users
        maintainUsers.load(); // Loads from existing CSV (empty for now)
        AbstractUser user = new ManagerUser("John", "john@example.com", "password123");
        maintainUsers.addUser(user);

        // Retrieve user by email
        AbstractUser retrievedUser = maintainUsers.getUserByEmail("john@example.com");
        assertNotNull(retrievedUser);
        assertEquals("john@example.com", retrievedUser.getEmail());
    }

    // Helper method to create a test CSV file
    private void createTestCSVFile() throws IOException {
        // Manually create a CSV file for testing
        CsvWriter writer = new CsvWriter(new FileWriter(testFile), ',');

        writer.write("name");
        writer.write("email");
        writer.write("password");
        writer.write("role");
        writer.write("validated");
        writer.endRecord();

        // Add sample users (for example, one student and one manager)
        writer.write("Jane Doe");
        writer.write("jane.doe@example.com");
        writer.write("password123");
        writer.write("student");
        writer.write("true");
        writer.endRecord();

        writer.write("John Smith");
        writer.write("john.smith@example.com");
        writer.write("password456");
        writer.write("manager");
        writer.write("true");
        writer.endRecord();

        writer.close();
    }

}
