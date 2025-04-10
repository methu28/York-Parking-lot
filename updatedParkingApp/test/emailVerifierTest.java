import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.EmailVerifier;

class emailVerifierTest {

	@Test
    void validEmail() {
        assertTrue(EmailVerifier.isValidEmail("juno@gmail.com"));
    }

    @Test
    void emailMissingA() {
        assertFalse(EmailVerifier.isValidEmail("juno.com"));
    }

    @Test
    void emailMissingDomain() {
        assertFalse(EmailVerifier.isValidEmail("juno@"));
    }

    @Test
    void emptyEmail() {
        assertFalse(EmailVerifier.isValidEmail(""));
    }

}
