import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import parkingSystem.model.util.LicensePlateVerifier;

class licensePlateVerifier {

	   @Test
	    void ValidLicensePlate() {
	        assertTrue(LicensePlateVerifier.isValidLicense("ABC123"));
	    }

	    @Test
	    void tooShort() {
	        assertFalse(LicensePlateVerifier.isValidLicense("A1"));
	    }

	    @Test
	    void tooLong() {
	        assertFalse(LicensePlateVerifier.isValidLicense("ABCDEFGHIJKL"));
	    }

	    @Test
	    void specialChars() {
	        assertFalse(LicensePlateVerifier.isValidLicense("AB@123"));
	    }

	    @Test
	    void emptyLicensePlate() {
	        assertFalse(LicensePlateVerifier.isValidLicense(""));
	    }
}
