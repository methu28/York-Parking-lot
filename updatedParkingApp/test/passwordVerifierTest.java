import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.PasswordVerifier;

class passwordVerifierTest {
	@Test
    void testValidPassword() {
        assertTrue(PasswordVerifier.isStrongPassword("StrongPass-123"));
    }


	@Test
    void testValidNoCharacters() {
        assertFalse(PasswordVerifier.isStrongPassword("StrongPass123"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordVerifier.isStrongPassword("abc"));
    }

    @Test
    void testPasswordNoNumbers() {
        assertFalse(PasswordVerifier.isStrongPassword("PasswordOnly"));
    }

    @Test
    void testPasswordNoLetters() {
        assertFalse(PasswordVerifier.isStrongPassword("12345678"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordVerifier.isStrongPassword(""));
    }

}
