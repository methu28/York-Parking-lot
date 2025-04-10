import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.util.ValidationRequestBuffer;

class validationBufferTest {

	private ValidationRequestBuffer buffer;

    @BeforeEach
    void setUp() {
        buffer = ValidationRequestBuffer.getInstance();
        buffer.setRequests(new ArrayList<>()); 
    }

    @Test
    void addRequest() {
        AbstractUser user = new StudentUser("bob", "bob@gmail.com", "bob-1");
        buffer.addRequest(user);
        assertTrue(buffer.getRequests().contains(user));
        assertEquals(1, buffer.getRequests().size());
    }

    @Test
    void removeRequest() {
        AbstractUser user = new StudentUser("bob", "bob@gmail.com", "bob-1");
        buffer.addRequest(user);
        buffer.removeRequest(user);
        assertFalse(buffer.getRequests().contains(user));
        assertEquals(0, buffer.getRequests().size());
    }

    @Test
    void setRequests() {
        AbstractUser user1 = new StudentUser("sup", "sup@gmail.com", "poi-2");
        AbstractUser user2 = new StudentUser("rup", "rup@gmail.com", "mik-2");

        List<AbstractUser> newRequests = new ArrayList<>();
        newRequests.add(user1);
        newRequests.add(user2);

        buffer.setRequests(newRequests);

        assertEquals(2, buffer.getRequests().size());
        assertTrue(buffer.getRequests().contains(user1));
        assertTrue(buffer.getRequests().contains(user2));
    }

    @Test
    void getInstanceReturnsSingleton() {
        ValidationRequestBuffer instance1 = ValidationRequestBuffer.getInstance();
        ValidationRequestBuffer instance2 = ValidationRequestBuffer.getInstance();

        assertSame(instance1, instance2);
    }

}
