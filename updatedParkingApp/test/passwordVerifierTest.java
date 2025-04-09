import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.PasswordVerifier;

class passwordVerifierTest {
	@Test
    void validPassword() {
        assertTrue(PasswordVerifier.isStrongPassword("Strass-123"));
    }


	@Test
    void noCharacters() {
        assertFalse(PasswordVerifier.isStrongPassword("Strass123"));
    }

    @Test
    void tooShort() {
        assertFalse(PasswordVerifier.isStrongPassword("abc"));
    }

    @Test
    void noNumbers() {
        assertFalse(PasswordVerifier.isStrongPassword("jamaica-"));
    }

    @Test
    void noLetters() {
        assertFalse(PasswordVerifier.isStrongPassword("1-2345678"));
    }

    @Test
    void emptyPassword() {
        assertFalse(PasswordVerifier.isStrongPassword(""));
    }

}
