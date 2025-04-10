import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.FacultyUser;
import parkingSystem.model.NonFacultyUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.VisitorUser;
import parkingSystem.model.util.factories.FacultyUserFactory;
import parkingSystem.model.util.factories.NonFacultyUserFactory;
import parkingSystem.model.util.factories.StudentUserFactory;
import parkingSystem.model.util.factories.VisitorUserFactory;

class userFactories {

	  @Test
	    void testFacultyUserFactory() {
	        FacultyUserFactory factory = new FacultyUserFactory();
	        FacultyUser user = (FacultyUser) factory.createUser("John", "john@yorku.ca", "fac123");

	        assertEquals("John", user.getName());
	        assertEquals("john@yorku.ca", user.getEmail());
	        assertEquals("fac123", user.getPassword());
	        assertEquals("Faculty", user.getRole());
	    }

	    @Test
	    void testNonFacultyUserFactory() {
	        NonFacultyUserFactory factory = new NonFacultyUserFactory();
	        NonFacultyUser user = (NonFacultyUser) factory.createUser("Alice", "alice@domain.com", "nf123");

	        assertEquals("Alice", user.getName());
	        assertEquals("alice@domain.com", user.getEmail());
	        assertEquals("nf123", user.getPassword());
	        assertEquals("Non-Faculty", user.getRole());
	    }

	    @Test
	    void testStudentUserFactory() {
	        StudentUserFactory factory = new StudentUserFactory();
	        StudentUser user = (StudentUser) factory.createUser("Bob", "bob@school.com", "stu456");

	        assertEquals("Bob", user.getName());
	        assertEquals("bob@school.com", user.getEmail());
	        assertEquals("stu456", user.getPassword());
	        assertEquals("Student", user.getRole());
	    }

	    @Test
	    void testVisitorUserFactory() {
	        VisitorUserFactory factory = new VisitorUserFactory();
	        VisitorUser user = (VisitorUser) factory.createUser("Carol", "carol@visit.org", "vis789");

	        assertEquals("Carol", user.getName());
	        assertEquals("carol@visit.org", user.getEmail());
	        assertEquals("vis789", user.getPassword());
	        assertEquals("Visitor", user.getRole());
	    }

}
