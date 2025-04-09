import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.EmailVerifier;

class emailVerifierTest {

	@Test
    void testValidEmail() {
        assertTrue(EmailVerifier.isValidEmail("test@example.com"));
    }

    @Test
    void testInvalidEmailMissingAt() {
        assertFalse(EmailVerifier.isValidEmail("testexample.com"));
    }

    @Test
    void testInvalidEmailMissingDomain() {
        assertFalse(EmailVerifier.isValidEmail("test@"));
    }

    @Test
    void testEmptyEmail() {
        assertFalse(EmailVerifier.isValidEmail(""));
    }

}
