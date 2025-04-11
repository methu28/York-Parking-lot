import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csvreader.CsvWriter;

import parkingSystem.database.MaintainUsers;
import parkingSystem.model.AbstractUser;
import parkingSystem.model.ManagerUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.VisitorUser;

class maintainUsersTest {



    private static final String testCSVPATH = "users.csv"; 
    private MaintainUsers maintainUsers;

    @BeforeEach
    void setup() throws Exception {
        Files.write(Paths.get(testCSVPATH), List.of(
            "name,email,password,role,validated",
            "Alice,alice@test.com,pass123,student,false",
            "Bob,bob@test.com,pass456,faculty,true"
        ));
        maintainUsers = new MaintainUsers();
        maintainUsers.load();
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(testCSVPATH));
    }

    @Test
    void loadUsers() {
        assertEquals(2, maintainUsers.users.size());
        assertEquals("Alice", maintainUsers.users.get(0).getName());
    }

    @Test
    void getUserByEmail() {
        AbstractUser user = maintainUsers.getUserByEmail("bob@test.com");
        assertNotNull(user);
        assertEquals("Bob", user.getName());
        assertTrue(user.isValidated());
    }

    @Test
    void addUser() throws Exception {
        AbstractUser newUser = new VisitorUser("Charlie", "charlie@test.com", "chariw-1");
        maintainUsers.addUser(newUser);

        assertNotNull(maintainUsers.getUserByEmail("charlie@test.com"));
    }

    @Test
    void updateUserDetails() throws Exception {
        maintainUsers.updateUser("alice@test.com", "Alicia", "alice_new@test.com", "alic-1");
        AbstractUser updated = maintainUsers.getUserByEmail("alice_new@test.com");
        assertNotNull(updated);
        assertEquals("Alicia", updated.getName());
        assertEquals("alic-1", updated.getPassword());
    }

    @Test
    void testValidateUserSuccess() throws Exception {
        AbstractUser manager = new ManagerUser("Manager", "manager@test.com", "admin");
        manager.setValid(true);
        maintainUsers.addUser(manager);

        boolean result = maintainUsers.validateUser("manager@test.com", "alice@test.com");
        assertTrue(result);
        AbstractUser alice = maintainUsers.getUserByEmail("alice@test.com");
        assertTrue(alice.isValidated());
    }

    @Test
    void testValidateUserFailWithNoManager() throws Exception {
        boolean result = maintainUsers.validateUser("alice@test.com", "bob@test.com");
        assertFalse(result);
    }
}
