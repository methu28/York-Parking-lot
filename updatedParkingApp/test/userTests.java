import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.FacultyUser;
import parkingSystem.model.NonFacultyUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.VisitorUser;

class userTests {

	@Test
    void testFacultyUser() {
        FacultyUser user = new FacultyUser("John", "john@yorku.ca", "fac123");
        assertEquals("John", user.getName());
        assertEquals("john@yorku.ca", user.getEmail());
        assertEquals("fac123", user.getPassword());
        assertEquals("Faculty", user.getRole());
    }

    @Test
    void testNonFacultyUser() {
        NonFacultyUser user = new NonFacultyUser("Alice", "alice@domain.com", "nf123");
        assertEquals("Alice", user.getName());
        assertEquals("alice@domain.com", user.getEmail());
        assertEquals("nf123", user.getPassword());
        assertEquals("Non-Faculty", user.getRole());
    }

    @Test
    void testStudentUser() {
        StudentUser user = new StudentUser("Bob", "bob@school.com", "stu456");
        assertEquals("Bob", user.getName());
        assertEquals("bob@school.com", user.getEmail());
        assertEquals("stu456", user.getPassword());
        assertEquals("Student", user.getRole());
    }

    @Test
    void testVisitorUser() {
        VisitorUser user = new VisitorUser("Carol", "carol@visit.org", "vis789");
        assertEquals("Carol", user.getName());
        assertEquals("carol@visit.org", user.getEmail());
        assertEquals("vis789", user.getPassword());
        assertEquals("Visitor", user.getRole());
    }

}
