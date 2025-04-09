import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.LicensePlateVerifier;

class licensePlateVerifier {

	   @Test
	    void testValidLicensePlateWithLettersAndNumbers() {
	        assertTrue(LicensePlateVerifier.isValidLicense("ABC123"));
	    }

	    @Test
	    void testLicensePlateTooShort() {
	        assertFalse(LicensePlateVerifier.isValidLicense("A1"));
	    }

	    @Test
	    void testLicensePlateTooLong() {
	        assertFalse(LicensePlateVerifier.isValidLicense("ABCDEFGHIJKL"));
	    }

	    @Test
	    void testLicensePlateWithSpecialChars() {
	        assertFalse(LicensePlateVerifier.isValidLicense("AB@123"));
	    }

	    @Test
	    void testEmptyLicensePlate() {
	        assertFalse(LicensePlateVerifier.isValidLicense(""));
	    }
}
