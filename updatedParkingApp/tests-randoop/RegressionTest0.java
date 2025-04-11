import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        parkingSystem.model.util.Generator generator0 = new parkingSystem.model.util.Generator();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("EpicAres254", "EpicAres254", "");
        org.junit.Assert.assertNotNull(superManager3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(100, parkingLot1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("EpicAres571", "EpicAres571", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("EpicAres571");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        parkingSystem.model.util.DuplicateChecker duplicateChecker0 = new parkingSystem.model.util.DuplicateChecker();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = parkingSystem.model.util.Generator.generateStrongPassword();
// flaky "1) test009(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Sn6-" + "'", str0, "Sn6-");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        double double4 = studentUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray4 = new parkingSystem.model.AbstractUser[] { nonFacultyUser3 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList5, abstractUserArray4);
        java.lang.String str7 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(abstractUserArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "2) test011(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CommonAtlas127" + "'", str7, "CommonAtlas127");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        java.lang.String str4 = facultyUser3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = parkingSpace2.isAvailable(localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("CommonAtlas127");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.clearPastBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("Super Manager: EpicAres254 ()");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("EpicAres571");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking12.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        java.lang.String str5 = facultyUser3.getName();
        facultyUser3.removeValidation();
        double double7 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("UncommonAtlas241");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        superManager0.validateUser();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str1, "Super Manager: EpicAres254 ()");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) facultyUser4);
        double double8 = facultyUser4.getRate();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("", "EpicAres254", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
// flaky "3) test025(RegressionTest0)":         maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.AbstractUser abstractUser18 = maintainUsers0.getUserByEmail("Sn6-");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer19 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers20 = new parkingSystem.database.MaintainUsers();
// flaky "1) test025(RegressionTest0)":         maintainUsers20.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser25 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray26 = new parkingSystem.model.AbstractUser[] { nonFacultyUser25 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList27 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList27, abstractUserArray26);
        java.lang.String str29 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        boolean boolean31 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27, "EpicAres571");
        boolean boolean33 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27, "CommonAtlas127");
        maintainUsers20.users = abstractUserList27;
        validationRequestBuffer19.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer36 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser40 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double41 = facultyUser40.getRate();
        java.lang.String str42 = facultyUser40.getName();
        validationRequestBuffer36.notifyManager((parkingSystem.model.AbstractUser) facultyUser40);
        validationRequestBuffer19.removeRequest((parkingSystem.model.AbstractUser) facultyUser40);
        parkingSystem.model.AbstractUser[] abstractUserArray45 = new parkingSystem.model.AbstractUser[] {};
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList46 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList46, abstractUserArray45);
        java.lang.String str48 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList46);
        validationRequestBuffer19.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList46);
        boolean boolean51 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList46, "UncommonAres378");
        maintainUsers0.users = abstractUserList46;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "1) test025(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LegendaryAtlas957" + "'", str9, "LegendaryAtlas957");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(validationRequestBuffer19);
        org.junit.Assert.assertNotNull(abstractUserArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "1) test025(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RareZeus212" + "'", str29, "RareZeus212");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 15.0d + "'", double41 == 15.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray45);
        org.junit.Assert.assertArrayEquals(abstractUserArray45, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky "1) test025(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CommonAres499" + "'", str48, "CommonAres499");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("CommonAtlas127", "CommonAres908", "RareAtlas923");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str2 = parkingLot1.toString();
        java.lang.String str3 = parkingLot1.getLocation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendaryZeus350" + "'", str2, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("CommonAtlas127");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("LegendaryAtlas691", "LegendaryAtlas957", "EpicAres734");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = booking44.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        // The following exception was thrown during execution in test generation
        try {
            booking12.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
// flaky "4) test033(RegressionTest0)":         maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        java.lang.String str26 = facultyUser21.getRole();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "2) test033(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareAres766" + "'", str10, "RareAres766");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
// flaky "5) test034(RegressionTest0)":         maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
// flaky "3) test034(RegressionTest0)":         maintainUsers0.load();
// flaky "2) test034(RegressionTest0)":         maintainUsers0.load();
// flaky "2) test034(RegressionTest0)":         maintainUsers0.load();
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "2) test034(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UncommonAtlas532" + "'", str9, "UncommonAtlas532");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        parkingSpace16.setOccupied(false);
        org.junit.Assert.assertNotNull(parkingSpace16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        superManager0.setValid(false);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str1, "Super Manager: EpicAres254 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EpicAres254" + "'", str2, "EpicAres254");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = booking25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("", "UncommonAtlas241", "RareHades843");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray4 = new parkingSystem.model.AbstractUser[] { nonFacultyUser3 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList5, abstractUserArray4);
        java.lang.String str7 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "CommonAtlas127");
        org.junit.Assert.assertNotNull(abstractUserArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test039(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CommonKratos108" + "'", str7, "CommonKratos108");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = parkingSpace2.getNextAvailableTime(localDateTime7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = parkingSpace2.isAvailable(localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("", "LegendaryZeus350", "LegendaryAtlas957");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("CommonAres908", "CommonKratos108", "CommonAres499");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        // The following exception was thrown during execution in test generation
        try {
            booking44.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 100, parkingLot1);
        parkingSpace2.clearPastBookings();
        java.lang.Class<?> wildcardClass4 = parkingSpace2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        java.lang.Class<?> wildcardClass31 = parkingSpace8.getClass();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("CommonAres499", "EpicAres254", "UncommonAtlas532");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("LegendaryAtlas957");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getName();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EpicAres254" + "'", str1, "EpicAres254");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("hi!", "", "");
        managerUser3.setValid(false);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = managerUser3.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        boolean boolean5 = facultyUser3.isValidated();
        double double6 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
// flaky "7) test053(RegressionTest0)":         maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        double double32 = visitorUser29.getRate();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) visitorUser29);
        java.lang.String str34 = visitorUser29.toString();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "4) test053(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryAtlas690" + "'", str10, "LegendaryAtlas690");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EpicAres571 () - Role: Visitor" + "'", str34, "EpicAres571 () - Role: Visitor");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        parkingSystem.model.parking.ParkingLot parkingLot3 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot3);
        parkingSystem.model.parking.Booking booking5 = null;
        parkingSpace4.addBooking(booking5);
        parkingSpace4.enable();
        parkingSystem.model.parking.ParkingLot parkingLot9 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot9);
        parkingSpace10.disable();
        boolean boolean12 = parkingSpace10.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList13 = parkingSpace10.getBookings();
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        parkingSystem.model.parking.Booking booking17 = null;
        parkingSpace16.addBooking(booking17);
        parkingSpace16.enable();
        parkingSystem.model.parking.ParkingLot parkingLot21 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot21);
        parkingSpace22.disable();
        boolean boolean24 = parkingSpace22.isOccupied();
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        parkingSystem.model.parking.Booking booking28 = null;
        parkingSpace27.addBooking(booking28);
        parkingSpace27.enable();
        parkingSpace27.enable();
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray32 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace4, parkingSpace10, parkingSpace16, parkingSpace22, parkingSpace27 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList33 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33, parkingSpaceArray32);
        parkingLot1.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33);
        java.lang.String str36 = parkingLot1.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CommonAtlas127" + "'", str36, "CommonAtlas127");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        double double4 = visitorUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        boolean boolean3 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList1, "LegendaryAtlas957");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList5 = parkingSpace2.getBookings();
        parkingSpace2.disable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("Lot 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("RareKratos824");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("RareAtlas121", "RareAtlas502", "RareAtlas923");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("CommonAres908");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
// flaky "8) test062(RegressionTest0)":         maintainUser0.load();
        maintainUser0.update();
        maintainUser0.update();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = booking44.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
// flaky "9) test064(RegressionTest0)":         maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList18 = maintainUsers0.users;
        boolean boolean20 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList18, "UncommonKratos611");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "5) test064(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonHades765" + "'", str9, "CommonHades765");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
// flaky "10) test065(RegressionTest0)":         maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot33 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace34 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        parkingSystem.model.parking.Booking booking38 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser29, parkingSpace34, localDateTime35, localDateTime36, "EpicAres254");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking38.updateTime(localDateTime39, localDateTime40);
        parkingSystem.model.parking.ParkingSpace parkingSpace42 = booking38.getSpace();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = parkingSpace42.getNextAvailableTime(localDateTime43);
        parkingSpace42.enable();
        parkingSpace42.disable();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        parkingSystem.model.parking.Booking booking50 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser21, parkingSpace42, localDateTime47, localDateTime48, "Sn6-");
        // The following exception was thrown during execution in test generation
        try {
            booking50.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "6) test065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryAres358" + "'", str10, "LegendaryAres358");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertNull(localDateTime44);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime7 = parkingSpace2.getNextAvailableTime(localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("UncommonKratos611", "UncommonKratos611", "UncommonKratos611");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        parkingSpace2.enable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        java.lang.String str5 = facultyUser3.getName();
        facultyUser3.removeValidation();
        facultyUser3.setName("UncommonKratos611");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("RareAtlas502", "", "RareAtlas923");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
// flaky "11) test071(RegressionTest0)":         maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        boolean boolean16 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "RareAres766");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "7) test071(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonHades705" + "'", str9, "CommonHades705");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        visitorUser3.validateUser();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        // The following exception was thrown during execution in test generation
        try {
            booking44.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList0, "LegendaryAtlas691");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("RareAres766");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("CommonAtlas127", "CommonHades337", "EpicZeus370");
        managerUser3.setPassword("LegendaryAres929");
        java.lang.String str6 = managerUser3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LegendaryAres929" + "'", str6, "LegendaryAres929");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        java.time.LocalDateTime localDateTime51 = null;
        booking44.extendTime(localDateTime51);
        java.lang.String str53 = booking44.getLicensePlate();
        // The following exception was thrown during execution in test generation
        try {
            booking44.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EpicAres254" + "'", str53, "EpicAres254");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        abstractUser4.setEmail("RareZeus439");
        org.junit.Assert.assertNotNull(abstractUser4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("UncommonHades257");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setName("");
        java.lang.Class<?> wildcardClass8 = visitorUser3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList2 = parkingLot1.getSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getOpenSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList4 = parkingLot1.getSpaces();
        java.lang.String str5 = parkingLot1.getLocation();
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CommonAtlas127" + "'", str5, "CommonAtlas127");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        java.lang.String str4 = facultyUser3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        boolean boolean19 = parkingSpace16.isOccupied();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        boolean boolean51 = parkingSpace16.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setEmail("Super Manager: EpicAres254 ()");
        visitorUser3.setValid(false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        java.lang.String str33 = booking25.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "CommonAres499" + "'", str33, "CommonAres499");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        booking25.setLicensePlate("LegendaryHades409");
        booking25.setLicensePlate("LegendaryAtlas957");
        // The following exception was thrown during execution in test generation
        try {
            booking25.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.util.List<parkingSystem.model.parking.Booking> bookingList17 = parkingSpace16.getBookings();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryZeus350", "EpicAres254");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        boolean boolean8 = parkingSpace6.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace6.getBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        parkingSystem.model.parking.Booking booking13 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime10, localDateTime11, "UncommonKratos611");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = parkingSpace6.isAvailable(localDateTime14, localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("", "EpicAres571", "");
        double double5 = abstractUser4.getRate();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
// flaky "12) test091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus212 ()" + "'", str1, "Super Manager: RareZeus212 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EpicAres254" + "'", str2, "EpicAres254");
// flaky "8) test091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus212 ()" + "'", str3, "Super Manager: RareZeus212 ()");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        parkingSpace16.clearPastBookings();
        java.lang.Class<?> wildcardClass18 = parkingSpace16.getClass();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        boolean boolean6 = superManager4.isValidated();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        boolean boolean13 = parkingSpace6.isOccupied();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        parkingSystem.model.parking.Booking booking17 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) nonFacultyUser3, parkingSpace6, localDateTime14, localDateTime15, "UncommonZeus401");
        // The following exception was thrown during execution in test generation
        try {
            booking17.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.updateUser("RareZeus212", "LegendaryHades667", "RareHades843", "LegendaryHades507");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "13) test096(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonAres479" + "'", str9, "CommonAres479");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        superManager0.setValid(false);
        superManager0.setName("RareAtlas923");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "14) test097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus212 ()" + "'", str1, "Super Manager: RareZeus212 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EpicAres254" + "'", str2, "EpicAres254");
// flaky "9) test097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus212 ()" + "'", str3, "Super Manager: RareZeus212 ()");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser3.setEmail("EpicAres571");
        boolean boolean6 = managerUser3.isValid();
        managerUser3.setEmail("EpicAres734");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("Super Manager: EpicAres254 ()");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.AbstractUser[] abstractUserArray26 = new parkingSystem.model.AbstractUser[] {};
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList27 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList27, abstractUserArray26);
        java.lang.String str29 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        parkingSystem.model.ManagerUser managerUser34 = new parkingSystem.model.ManagerUser("EpicAres734", "EpicAres734", "UncommonAtlas241");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) managerUser34);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "15) test100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareKratos764" + "'", str10, "RareKratos764");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray26);
        org.junit.Assert.assertArrayEquals(abstractUserArray26, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "10) test100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres716" + "'", str29, "EpicAres716");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        maintainUsers0.updateUser("UncommonZeus401", "RareHades843", "UncommonKratos611", "EpicAres734");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime21 = booking12.getStartTime();
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser21 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser21.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser21, parkingSpace26, localDateTime27, localDateTime28, "EpicAres254");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking30.updateTime(localDateTime31, localDateTime32);
        parkingSpace17.removeBooking(booking30);
        java.time.LocalDateTime localDateTime35 = booking30.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking30.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSystem.model.parking.Booking booking6 = null;
        parkingSpace2.addBooking(booking6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = parkingSpace2.isAvailable(localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.AbstractUser abstractUser18 = maintainUsers0.getUserByEmail("Sn6-");
        maintainUsers0.update();
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "16) test105(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonHades495" + "'", str9, "CommonHades495");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList3 = null;
        validationRequestBuffer0.setRequests(abstractUserList3);
        parkingSystem.model.VisitorUser visitorUser8 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str9 = visitorUser8.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.remove(Object)\" because \"this.requests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        parkingSystem.model.AbstractUser abstractUser9 = parkingSystem0.login("LegendaryZeus350", "LegendaryAtlas957");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("RareAtlas121", "RareAtlas151", "LegendaryHades409");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNull(abstractUser9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking12.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("LegendaryAres596", "EpicZeus667", "Visitor");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("hi!", "", "");
        managerUser3.setValid(false);
        managerUser3.setEmail("CommonAres479");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        boolean boolean21 = booking12.isCheckedOut();
        booking12.checkedIn();
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicZeus667", "RareAtlas525", "UncommonZeus120");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        double double6 = nonFacultyUser3.getRate();
        java.lang.String str7 = nonFacultyUser3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str7, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        parkingSystem.model.ManagerUser managerUser8 = new parkingSystem.model.ManagerUser("CommonAtlas127", "CommonHades337", "EpicZeus370");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) managerUser8);
        managerUser8.setPassword("CommonHades705");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = booking25.getSpace();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = booking25.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace31);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryAtlas957", "RareZeus439", "LegendaryHades409");
// flaky "17) test116(RegressionTest0)":         validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser6);
        visitorUser6.setName("");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
// flaky "11) test116(RegressionTest0)":         org.junit.Assert.assertNotNull(abstractUserList1);
// flaky "3) test116(RegressionTest0)":         org.junit.Assert.assertNotNull(abstractUserList2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("Faculty", "LegendaryAtlas690", "LegendaryAtlas957");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        boolean boolean23 = abstractUser21.isValidated();
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "18) test118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonHades477" + "'", str9, "CommonHades477");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("LegendaryHades507");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        java.lang.String str21 = booking12.getLicensePlate();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = booking12.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EpicAres254" + "'", str21, "EpicAres254");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("", "EpicAres571", "");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("", "RareKratos824", "CommonAres908");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList17 = validationRequestBuffer0.getRequests();
        parkingSystem.model.SuperManager superManager18 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str19 = superManager18.getName();
        java.lang.String str20 = superManager18.getPassword();
        parkingSystem.model.ManagerUser managerUser24 = superManager18.generateManagerAccount("LegendaryHades409", "UncommonZeus401 (Lot 0) - Role: Non-Faculty", "CommonHades705");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) managerUser24);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "19) test122(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonKratos811" + "'", str10, "CommonKratos811");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(abstractUserList17);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RareAtlas923" + "'", str19, "RareAtlas923");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(managerUser24);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("hi!", "", "");
        managerUser3.validateUser();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        parkingSystem.model.parking.ParkingLot parkingLot14 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot14);
        parkingSpace15.disable();
        parkingSpace15.setOccupied(false);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace15.isAvailable(localDateTime19, localDateTime20);
        parkingSystem.model.parking.Booking booking22 = null;
        parkingSpace15.addBooking(booking22);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray24 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace6, parkingSpace15 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList25 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25, parkingSpaceArray24);
        parkingLot2.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25);
        java.lang.String str28 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot2);
        parkingSpace29.disable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        java.lang.String str5 = facultyUser3.getName();
        facultyUser3.removeValidation();
        double double7 = facultyUser3.getRate();
        double double8 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) facultyUser4);
        parkingSystem.model.SuperManager superManager8 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str9 = superManager8.toString();
        java.lang.String str10 = superManager8.getEmail();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) superManager8);
        parkingSystem.model.ManagerUser managerUser15 = superManager8.generateManagerAccount("RareAtlas151", "Faculty", "LegendaryHades507");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str9, "Super Manager: RareAtlas923 ()");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EpicAres254" + "'", str10, "EpicAres254");
        org.junit.Assert.assertNotNull(managerUser15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace2.addBooking(booking7);
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime30 = booking23.getEndTime();
        parkingSpace2.addBooking(booking23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = booking23.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = parkingSpace2.isAvailable(localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        parkingSystem.model.parking.ParkingLot parkingLot3 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot3);
        parkingSystem.model.parking.Booking booking5 = null;
        parkingSpace4.addBooking(booking5);
        parkingSpace4.enable();
        parkingSystem.model.parking.ParkingLot parkingLot9 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot9);
        parkingSpace10.disable();
        boolean boolean12 = parkingSpace10.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList13 = parkingSpace10.getBookings();
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        parkingSystem.model.parking.Booking booking17 = null;
        parkingSpace16.addBooking(booking17);
        parkingSpace16.enable();
        parkingSystem.model.parking.ParkingLot parkingLot21 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot21);
        parkingSpace22.disable();
        boolean boolean24 = parkingSpace22.isOccupied();
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        parkingSystem.model.parking.Booking booking28 = null;
        parkingSpace27.addBooking(booking28);
        parkingSpace27.enable();
        parkingSpace27.enable();
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray32 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace4, parkingSpace10, parkingSpace16, parkingSpace22, parkingSpace27 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList33 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33, parkingSpaceArray32);
        parkingLot1.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList36 = parkingLot1.getOpenSpaces();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList36);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("RareAtlas525", "EpicHades415", "UncommonHades308");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("Sn6-", "EpicZeus370", "LegendaryHades409");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("Lot 0", "RareAtlas525", "CommonHades705");
        java.lang.String str4 = studentUser3.getPassword();
        double double5 = studentUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CommonHades705" + "'", str4, "CommonHades705");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        boolean boolean21 = booking12.isCheckedOut();
        java.time.LocalDateTime localDateTime22 = null;
        booking12.extendTime(localDateTime22);
        parkingSystem.model.parking.ParkingSpace parkingSpace24 = booking12.getSpace();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = parkingSpace24.isAvailable(localDateTime25, localDateTime26);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        maintainUser0.update();
        org.junit.Assert.assertNotNull(abstractUserList2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("UncommonKratos808", "Manager", "CommonAres479");
        boolean boolean5 = abstractUser4.isValid();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("UncommonAtlas532", "hi!", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = managerUser3.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        java.lang.String str6 = visitorUser3.getRole();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSpace2.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.AbstractUser abstractUser9 = parkingSystem0.login("EpicAres346", "EpicAres571");
        parkingSystem.model.AbstractUser abstractUser12 = parkingSystem0.loginViaName("UncommonHades257", "CommonKratos811");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNull(abstractUser9);
        org.junit.Assert.assertNull(abstractUser12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        java.lang.String str4 = managerUser3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Manager:  (Sn6-)" + "'", str4, "Manager:  (Sn6-)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.processDeposit();
        booking12.checkedIn();
        booking12.setCheckedInStatus(true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryZeus350", "EpicAres254");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        boolean boolean8 = parkingSpace6.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace6.getBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        parkingSystem.model.parking.Booking booking13 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime10, localDateTime11, "UncommonKratos611");
        parkingSpace6.enable();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = parkingSpace6.getNextAvailableTime(localDateTime15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDateTime16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("EpicAres300");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        boolean boolean6 = visitorUser3.isValid();
        java.lang.String str7 = visitorUser3.getRole();
        double double8 = visitorUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor" + "'", str7, "Visitor");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("UncommonKratos808", "Manager", "CommonAres479");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("CommonAres479", "CommonAtlas875", "Manager:  (Sn6-)");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = booking12.getSpace();
        boolean boolean20 = parkingSpace19.isOccupied();
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getName();
        java.lang.String str2 = superManager0.getPassword();
        superManager0.setValid(true);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RareAtlas923" + "'", str1, "RareAtlas923");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        java.lang.String str7 = parkingSpace2.toString();
        boolean boolean8 = parkingSpace2.isEnabled();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = parkingSpace2.isAvailable(localDateTime9, localDateTime10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lot 0" + "'", str7, "Lot 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("UncommonKratos478", "CommonAtlas875", "RareAtlas525");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("", "", "");
        boolean boolean4 = facultyUser3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("CommonAres479", "UncommonAtlas387", "EpicZeus525");
        org.junit.Assert.assertNotNull(abstractUser4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList5 = parkingSpace2.getBookings();
        parkingSystem.model.VisitorUser visitorUser9 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser9.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot13 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        parkingSystem.model.parking.Booking booking18 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser9, parkingSpace14, localDateTime15, localDateTime16, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        booking31.updateTime(localDateTime32, localDateTime33);
        java.lang.String str35 = booking31.getLicensePlate();
        parkingSpace14.addBooking(booking31);
        parkingSpace2.removeBooking(booking31);
        booking31.checkedOut();
        // The following exception was thrown during execution in test generation
        try {
            double double39 = booking31.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        booking12.setCheckedInStatus(false);
        boolean boolean17 = booking12.isCheckedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace18 = booking12.getSpace();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory26 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser30 = visitorUserFactory26.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        validationRequestBuffer0.removeRequest(abstractUser30);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "20) test154(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryZeus837" + "'", str10, "LegendaryZeus837");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(abstractUser30);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUsers0.users;
        org.junit.Assert.assertNotNull(abstractUserList2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicAres346", "LegendaryHades409", "RareZeus212");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser20 = parkingSystem0.login("UncommonKratos478", "Manager");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNull(abstractUser20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("EpicAres571 () - Role: Visitor");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        parkingSpace16.setOccupied(false);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser7 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) facultyUser7);
        facultyUser7.setEmail("UncommonKratos478");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("CommonAtlas127");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.VisitorUser visitorUser4 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str5 = visitorUser4.getPassword();
        java.lang.String str6 = visitorUser4.getRole();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) visitorUser4);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Visitor" + "'", str6, "Visitor");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.lang.String str3 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList2);
// flaky "21) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus206" + "'", str3, "LegendaryZeus206");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        maintainUser0.load();
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.processDeposit();
        booking12.setLicensePlate("RareZeus959");
        // The following exception was thrown during execution in test generation
        try {
            booking12.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("EpicAres254", "LegendaryZeus350", "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        double double6 = nonFacultyUser3.getRate();
        double double7 = nonFacultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.AbstractUser abstractUser18 = maintainUsers0.getUserByEmail("Sn6-");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList19 = maintainUsers0.users;
        boolean boolean22 = maintainUsers0.validateUser("RareAtlas502", "LegendaryZeus206");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "22) test168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareAtlas563" + "'", str9, "RareAtlas563");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(abstractUserList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str4 = nonFacultyUser3.toString();
        java.lang.String str5 = nonFacultyUser3.getName();
        double double6 = nonFacultyUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str4, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UncommonZeus401" + "'", str5, "UncommonZeus401");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        java.lang.Class<?> wildcardClass6 = nonFacultyUser3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = booking25.getSpace();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = parkingSpace31.isAvailable(localDateTime32, localDateTime33);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        parkingSystem.model.ManagerUser managerUser8 = superManager0.generateManagerAccount("EpicHades415", "RareAtlas121", "EpicZeus667");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str1, "Super Manager: RareAtlas923 ()");
// flaky "23) test172(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str3, "Super Manager: RareAtlas923 ()");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str4, "Super Manager: RareAtlas923 ()");
        org.junit.Assert.assertNotNull(managerUser8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("LegendaryAres100", "EpicZeus667", "Super Manager: RareZeus212 ()");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList6 = parkingLot3.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot3);
        java.util.List<parkingSystem.model.parking.Booking> bookingList8 = parkingSpace7.getBookings();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        double double6 = nonFacultyUser3.getRate();
        java.lang.String str7 = nonFacultyUser3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UncommonZeus401" + "'", str7, "UncommonZeus401");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setName("");
        boolean boolean8 = visitorUser3.isValidated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        boolean boolean6 = visitorUser3.isValid();
        java.lang.String str7 = visitorUser3.getRole();
        visitorUser3.setPassword("RareAtlas121");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor" + "'", str7, "Visitor");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSystem.model.VisitorUser visitorUser7 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser7.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot11 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace12 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        parkingSystem.model.parking.Booking booking16 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser7, parkingSpace12, localDateTime13, localDateTime14, "EpicAres254");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        booking16.updateTime(localDateTime17, localDateTime18);
        parkingSpace2.removeBooking(booking16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        parkingSystem.model.parking.ParkingLot parkingLot14 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot14);
        parkingSpace15.disable();
        parkingSpace15.setOccupied(false);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace15.isAvailable(localDateTime19, localDateTime20);
        parkingSystem.model.parking.Booking booking22 = null;
        parkingSpace15.addBooking(booking22);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray24 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace6, parkingSpace15 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList25 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25, parkingSpaceArray24);
        parkingLot2.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25);
        java.lang.String str28 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot2);
        parkingLot2.setLocation("CommonHades765");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        boolean boolean6 = maintainUsers0.validateUser("LegendaryAres929", "LegendaryAtlas690");
        maintainUsers0.load();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser15 = booking12.getUser();
        java.lang.String str16 = booking12.getLicensePlate();
        org.junit.Assert.assertNotNull(abstractUser15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UncommonZeus401" + "'", str16, "UncommonZeus401");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("CommonHades477");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        boolean boolean21 = booking12.isCheckedOut();
        // The following exception was thrown during execution in test generation
        try {
            booking12.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setPassword("UncommonHades257");
        double double6 = visitorUser3.getRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList5 = parkingLot2.getSpaces();
        parkingLot2.setLocation("LegendaryHades662");
        parkingLot2.setLocation("LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("UncommonKratos478");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        double double6 = visitorUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("Super Manager: RareAtlas923 ()", "RareZeus486", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("EpicHades415", "LegendaryAtlas957", "CommonAres479");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = managerUser3.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        boolean boolean21 = booking12.isCheckedOut();
        java.time.LocalDateTime localDateTime22 = null;
        booking12.extendTime(localDateTime22);
        parkingSystem.model.parking.ParkingSpace parkingSpace24 = booking12.getSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = booking12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAres378", "RareAtlas121", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("EpicZeus525", "EpicAres734", "RareKratos764");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.util.List<parkingSystem.model.parking.Booking> bookingList6 = parkingSpace2.getBookings();
        parkingSpace2.setOccupied(true);
        boolean boolean9 = parkingSpace2.isOccupied();
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setLicensePlate("RareZeus212");
        java.time.LocalDateTime localDateTime21 = null;
        booking12.extendTime(localDateTime21);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        boolean boolean9 = parkingSpace2.isOccupied();
        boolean boolean10 = parkingSpace2.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.AbstractUser[] abstractUserArray26 = new parkingSystem.model.AbstractUser[] {};
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList27 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList27, abstractUserArray26);
        java.lang.String str29 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList31 = validationRequestBuffer0.getRequests();
        boolean boolean33 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList31, "Super Manager: RareZeus212 ()");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "24) test195(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryHades780" + "'", str10, "LegendaryHades780");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray26);
        org.junit.Assert.assertArrayEquals(abstractUserArray26, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "12) test195(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UncommonAtlas990" + "'", str29, "UncommonAtlas990");
        org.junit.Assert.assertNotNull(abstractUserList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "RareAtlas525", "UncommonAtlas241");
        managerUser3.validateUser();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        parkingSystem.model.SuperManager superManager14 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str15 = superManager14.getName();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager14);
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem0.loginViaName("Super Manager: RareAtlas923 ()", "LegendaryAres724");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RareAtlas923" + "'", str15, "RareAtlas923");
        org.junit.Assert.assertNull(abstractUser19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        boolean boolean10 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList8, "RareAres448");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList9 = parkingSystem0.getUsers();
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("RareAtlas151", "Faculty", "CommonAres479");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNotNull(abstractUserList9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList18 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser20 = maintainUsers0.getUserByEmail("Manager:  (Sn6-)");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "25) test201(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareAtlas409" + "'", str9, "RareAtlas409");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertNull(abstractUser20);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace2.addBooking(booking7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = parkingSpace2.isAvailable(localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        parkingSystem.model.AbstractUser abstractUser7 = parkingSystem0.login("UncommonHades257", "CommonHades495");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertNull(abstractUser7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList2 = parkingLot1.getOpenSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking12.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory1 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser5 = studentUserFactory1.createUser("LegendaryZeus350", "RareAtlas121", "CommonAres908");
        validationRequestBuffer0.removeRequest(abstractUser5);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList7 = validationRequestBuffer0.getRequests();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUser5);
        org.junit.Assert.assertNotNull(abstractUserList7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.setOccupied(true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("UncommonZeus120", "EpicHades415", "UncommonAtlas532");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        boolean boolean4 = visitorUser3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        java.lang.String str13 = superManager11.toString();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str13, "Super Manager: RareAtlas923 ()");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("RareZeus959");
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (byte) -1, parkingLot3);
        parkingSpace8.clearPastBookings();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        java.time.LocalDateTime localDateTime17 = null;
        booking12.extendTime(localDateTime17);
        booking12.checkedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace20 = booking12.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str2 = parkingLot1.toString();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getOpenSpaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendaryZeus350" + "'", str2, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.processDeposit();
        java.time.LocalDateTime localDateTime20 = booking12.getEndTime();
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot33 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace34 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        parkingSystem.model.parking.Booking booking38 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser29, parkingSpace34, localDateTime35, localDateTime36, "EpicAres254");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking38.updateTime(localDateTime39, localDateTime40);
        parkingSystem.model.parking.ParkingSpace parkingSpace42 = booking38.getSpace();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = parkingSpace42.getNextAvailableTime(localDateTime43);
        parkingSpace42.enable();
        parkingSpace42.disable();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        parkingSystem.model.parking.Booking booking50 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser21, parkingSpace42, localDateTime47, localDateTime48, "Sn6-");
        facultyUser21.setName("EpicZeus370");
        double double53 = facultyUser21.getRate();
        java.lang.String str54 = facultyUser21.getPassword();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "26) test215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareAtlas151" + "'", str10, "RareAtlas151");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 15.0d + "'", double53 == 15.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        boolean boolean6 = maintainUsers0.validateUser("LegendaryAres929", "LegendaryAtlas690");
        parkingSystem.database.MaintainUsers maintainUsers7 = new parkingSystem.database.MaintainUsers();
        maintainUsers7.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser12 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray13 = new parkingSystem.model.AbstractUser[] { nonFacultyUser12 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList14 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList14, abstractUserArray13);
        java.lang.String str16 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList14);
        boolean boolean18 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList14, "EpicAres571");
        boolean boolean20 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList14, "CommonAtlas127");
        maintainUsers7.users = abstractUserList14;
        parkingSystem.model.AbstractUser abstractUser23 = maintainUsers7.getUserByEmail("hi!");
        maintainUsers7.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList25 = maintainUsers7.users;
        maintainUsers0.users = abstractUserList25;
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(abstractUserArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "27) test216(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RareHades758" + "'", str16, "RareHades758");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(abstractUserList25);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("RareKratos764");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("EpicHades415", "CommonAtlas674", "CommonZeus931");
        parkingSystem.model.AbstractUser abstractUser12 = facultyUserFactory0.createUser("CommonAtlas127", "hi! (EpicAres254) - Role: Faculty", "CommonKratos811");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("LegendaryZeus350", "RareKratos824", "LegendaryZeus350");
        double double4 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.VisitorUser visitorUser7 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser7.setEmail("");
        visitorUser7.setName("");
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) visitorUser7);
        java.lang.String str13 = visitorUser7.toString();
        double double14 = visitorUser7.getRate();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " () - Role: Visitor" + "'", str13, " () - Role: Visitor");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken(abstractUserList0, "LegendaryAres100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str5 = superManager4.toString();
        java.lang.String str6 = superManager4.getEmail();
        superManager4.setValid(false);
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        maintainUsers0.load();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str5, "Super Manager: RareAtlas923 ()");
// flaky "28) test222(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RareZeus439" + "'", str6, "RareZeus439");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("RareAtlas502", "CommonKratos119", "CommonHades705");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        java.lang.String str7 = parkingSpace2.toString();
        parkingSpace2.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lot 0" + "'", str7, "Lot 0");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAtlas241", "RareAtlas923", "LegendaryAtlas957");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("RareKratos824", "hi! (EpicAres254) - Role: Faculty", "CommonHades705");
        parkingSystem.model.AbstractUser abstractUser12 = studentUserFactory0.createUser("UncommonAtlas258", "LegendaryHades507", "CommonKratos108");
        boolean boolean13 = abstractUser12.isValidated();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("CommonKratos811", "CommonAtlas875", "LegendaryHades780");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        booking12.setCheckedInStatus(false);
        boolean boolean17 = booking12.isCheckedOut();
        booking12.checkedOut();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        studentUser7.setName("UncommonAres378");
        boolean boolean13 = studentUser7.isValidated();
        double double14 = studentUser7.getRate();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUser0.getUsers();
        boolean boolean3 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList1, "Super Manager: RareZeus212 ()");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("RareAtlas502", "RareAtlas923", "EpicHades825");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        parkingSystem.model.NonFacultyUser nonFacultyUser26 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray27 = new parkingSystem.model.AbstractUser[] { nonFacultyUser26 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList28 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList28, abstractUserArray27);
        java.lang.String str30 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "EpicAres571");
        java.lang.String str33 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        maintainUsers0.users = abstractUserList28;
        maintainUsers0.updateUser("RareZeus486", "CommonHades477", "CommonHades705", "EpicHades715");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "29) test231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareKratos492" + "'", str9, "RareKratos492");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "13) test231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "RareAres862" + "'", str30, "RareAres862");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky "4) test231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "LegendaryAres481" + "'", str33, "LegendaryAres481");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("EpicAres571 () - Role: Visitor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList2 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(parkingLotList2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        parkingLot2.setLocation("UncommonKratos611");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getOpenSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList8 = parkingLot2.getSpaces();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        java.lang.String str4 = nonFacultyUser3.toString();
        double double5 = nonFacultyUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EpicAres254 (EpicAres254) - Role: Non-Faculty" + "'", str4, "EpicAres254 (EpicAres254) - Role: Non-Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList18 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList19 = parkingSystem0.getUsers();
        java.lang.String str20 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList19);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertNotNull(abstractUserList19);
// flaky "30) test236(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RareZeus677" + "'", str20, "RareZeus677");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("UncommonAtlas241", "RareKratos824", "RareAres766");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("UncommonHades308", "EpicHades825", "");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSpace2.setOccupied(true);
        parkingSystem.model.parking.ParkingLot parkingLot9 = parkingSpace2.getLot();
        java.util.List<parkingSystem.model.parking.Booking> bookingList10 = parkingSpace2.getBookings();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertNotNull(bookingList10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getEndTime();
        booking12.checkedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = booking12.getSpace();
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(parkingSpace21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean7 = parkingSpace2.isEnabled();
        parkingSpace2.enable();
        parkingSpace2.disable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("EpicZeus370", "", "RareAtlas151");
        java.lang.String str4 = facultyUser3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser15 = booking12.getUser();
        java.time.LocalDateTime localDateTime16 = booking12.getStartTime();
        org.junit.Assert.assertNotNull(abstractUser15);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryAtlas691");
        java.lang.String str2 = parkingLot1.getLocation();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getOpenSpaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendaryAtlas691" + "'", str2, "LegendaryAtlas691");
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        booking12.setCheckedInStatus(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = booking12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValid();
        boolean boolean2 = superManager0.isValid();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.lang.String str13 = booking12.getLicensePlate();
        booking12.processDeposit();
        booking12.setLicensePlate("Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EpicAres254" + "'", str13, "EpicAres254");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = booking23.getSpace();
        parkingSpace31.clearPastBookings();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(parkingSpace31);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres254 (EpicAres254) - Role: Non-Faculty", "EpicAres734", "LegendaryHades667");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        double double32 = visitorUser29.getRate();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) visitorUser29);
        double double34 = visitorUser29.getRate();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "31) test250(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryZeus891" + "'", str10, "LegendaryZeus891");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 15.0d + "'", double34 == 15.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem12 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser15 = parkingSystem12.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser18 = parkingSystem12.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList19 = parkingSystem12.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList20 = parkingSystem12.getUsers();
        parkingSystem.model.parking.ParkingLot parkingLot21 = null;
        parkingSystem12.addLot(parkingLot21);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList23 = parkingSystem12.getLots();
        parkingSystem0.setLots(parkingLotList23);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(parkingLotList19);
        org.junit.Assert.assertNotNull(abstractUserList20);
        org.junit.Assert.assertNotNull(parkingLotList23);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("RareAtlas525", "EpicHades415", "UncommonHades308");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("Lot 0", "RareAtlas409", "");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean7 = parkingSpace2.isEnabled();
        parkingSpace2.disable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.parking.ParkingLot parkingLot11 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList12 = parkingLot11.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace13 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot11);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList14 = parkingLot11.getOpenSpaces();
        parkingSystem0.addLot(parkingLot11);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.NonFacultyUser nonFacultyUser15 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        parkingSystem.model.parking.ParkingLot parkingLot17 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace18 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot17);
        parkingSpace18.disable();
        parkingSpace18.setOccupied(false);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = parkingSpace18.isAvailable(localDateTime22, localDateTime23);
        boolean boolean25 = parkingSpace18.isOccupied();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        parkingSystem.model.parking.Booking booking29 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) nonFacultyUser15, parkingSpace18, localDateTime26, localDateTime27, "UncommonZeus401");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser15);
        nonFacultyUser15.validateUser();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.ManagerUser managerUser20 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser20.setEmail("EpicAres571");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) managerUser20);
        parkingSystem.model.AbstractUser abstractUser24 = null;
        validationRequestBuffer0.addRequest(abstractUser24);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "32) test256(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LegendaryZeus666" + "'", str10, "LegendaryZeus666");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setName("");
        double double8 = visitorUser3.getRate();
        boolean boolean9 = visitorUser3.isValidated();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        parkingSystem.model.AbstractUser abstractUser33 = booking25.getUser();
        // The following exception was thrown during execution in test generation
        try {
            booking25.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(abstractUser33);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.checkedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace32 = booking25.getSpace();
        java.util.List<parkingSystem.model.parking.Booking> bookingList33 = parkingSpace32.getBookings();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertNotNull(bookingList33);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.FacultyUser facultyUser20 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double21 = facultyUser20.getRate();
        java.lang.String str22 = facultyUser20.getName();
        facultyUser20.removeValidation();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) facultyUser20);
        maintainUsers0.updateUser("Lot 0", "UncommonKratos478", "UncommonAres378", "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "33) test260(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UncommonHades581" + "'", str9, "UncommonHades581");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList18 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser21 = parkingSystem0.loginViaName("EpicHades715", "Lot 0");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertNull(abstractUser21);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        java.lang.String str6 = nonFacultyUser3.getName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UncommonZeus401" + "'", str6, "UncommonZeus401");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicZeus370", "UncommonKratos808", "Lot 0");
        visitorUser3.validateUser();
        visitorUser3.setName("Manager");
        visitorUser3.setPassword("RareAtlas525");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValid();
        java.lang.String str2 = superManager0.toString();
        superManager0.setName("LegendaryAres481");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Super Manager: RareAtlas923 ()" + "'", str2, "Super Manager: RareAtlas923 ()");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) visitorUser6);
        visitorUser6.validateUser();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("LegendaryAtlas957");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("LegendaryZeus350", "EpicZeus850", "CommonAres479");
        double double4 = studentUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("LegendaryHades667");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "34) test268(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareZeus986" + "'", str9, "RareZeus986");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        booking25.setLicensePlate("LegendaryHades409");
        booking25.setLicensePlate("LegendaryAtlas957");
        booking25.setLicensePlate("CommonKratos108");
        boolean boolean39 = booking25.isCheckedOut();
        java.time.LocalDateTime localDateTime40 = booking25.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking25.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(localDateTime40);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("RareKratos824", "", "CommonAtlas674");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("RareAtlas525", "hi!", "Super Manager: RareAtlas923 ()");
        java.lang.String str4 = facultyUser3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("EpicAres254 (EpicAres254) - Role: Non-Faculty");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        java.lang.String str14 = nonFacultyUser10.getEmail();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lot 0" + "'", str14, "Lot 0");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getName();
        java.lang.String str2 = superManager0.getPassword();
        parkingSystem.model.ManagerUser managerUser6 = superManager0.generateManagerAccount("LegendaryHades409", "UncommonZeus401 (Lot 0) - Role: Non-Faculty", "CommonHades705");
        java.lang.String str7 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LegendaryAres481" + "'", str1, "LegendaryAres481");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(managerUser6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Super Manager: LegendaryAres481 ()" + "'", str7, "Super Manager: LegendaryAres481 ()");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryAtlas957", "RareZeus439", "LegendaryHades409");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser6);
        parkingSystem.model.StudentUser studentUser11 = new parkingSystem.model.StudentUser("RareZeus959", "LegendaryAres929", "EpicAres734");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) studentUser11);
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory13 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser17 = studentUserFactory13.createUser("EpicAres300", "", "EpicZeus850");
        validationRequestBuffer0.addRequest(abstractUser17);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUser17);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str4 = nonFacultyUser3.toString();
        double double5 = nonFacultyUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str4, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setEmail("Super Manager: EpicAres254 ()");
        java.lang.String str8 = visitorUser3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str8, "Super Manager: EpicAres254 ()");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.util.List<parkingSystem.model.parking.Booking> bookingList6 = parkingSpace2.getBookings();
        boolean boolean7 = parkingSpace2.isOccupied();
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("hi!", "RareZeus486", "Manager:  (Sn6-)");
        visitorUser3.validateUser();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        superManager11.setName("RareAtlas121");
        superManager11.validateUser();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("UncommonKratos611");
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(1, parkingLot3);
        parkingSystem.model.parking.ParkingLot parkingLot10 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str11 = parkingLot10.toString();
        parkingSystem.model.parking.ParkingLot parkingLot13 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot13);
        parkingSpace14.disable();
        parkingSpace14.setOccupied(false);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = parkingSpace14.isAvailable(localDateTime18, localDateTime19);
        parkingSystem.model.parking.ParkingLot parkingLot22 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace23 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot22);
        parkingSpace23.disable();
        parkingSpace23.setOccupied(false);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = parkingSpace23.isAvailable(localDateTime27, localDateTime28);
        parkingSystem.model.parking.Booking booking30 = null;
        parkingSpace23.addBooking(booking30);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray32 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace14, parkingSpace23 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList33 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33, parkingSpaceArray32);
        parkingLot10.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList33);
        java.lang.String str36 = parkingLot10.toString();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList37 = parkingLot10.getOpenSpaces();
        parkingLot3.setSpaces(parkingSpaceList37);
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LegendaryZeus350" + "'", str11, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "LegendaryZeus350" + "'", str36, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList37);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList5 = parkingLot2.getSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList6 = parkingLot2.getSpaces();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.FacultyUser facultyUser20 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double21 = facultyUser20.getRate();
        java.lang.String str22 = facultyUser20.getName();
        facultyUser20.removeValidation();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) facultyUser20);
        maintainUsers0.updateUser("CommonAtlas674", "EpicZeus370", "CommonHades337", "Super Manager: EpicAres254 ()");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "35) test283(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonAtlas609" + "'", str9, "CommonAtlas609");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace2.addBooking(booking7);
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime30 = booking23.getEndTime();
        parkingSpace2.addBooking(booking23);
        java.time.LocalDateTime localDateTime32 = null;
        booking23.extendTime(localDateTime32);
        // The following exception was thrown during execution in test generation
        try {
            booking23.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.AbstractUser abstractUser13 = parkingSystem0.login("EpicZeus850", "UncommonKratos521");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNull(abstractUser13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        parkingSystem.model.AbstractUser abstractUser33 = booking25.getUser();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        booking25.updateTime(localDateTime34, localDateTime35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertNotNull(abstractUser33);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("hi! (EpicAres254) - Role: Faculty", "RareZeus677", "EpicZeus525");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        boolean boolean5 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList3, "UncommonHades257");
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime21 = null;
        booking12.extendTime(localDateTime21);
        java.lang.Class<?> wildcardClass23 = booking12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("UncommonKratos808", "LegendaryZeus666", "RareKratos764");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        // The following exception was thrown during execution in test generation
        try {
            booking12.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setLicensePlate("UncommonHades257");
        booking12.setLicensePlate("EpicHades825");
        java.time.LocalDateTime localDateTime23 = booking12.getEndTime();
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        parkingSystem.model.AbstractUser abstractUser24 = maintainUsers0.getUserByEmail("CommonHades337");
        parkingSystem.model.AbstractUser abstractUser26 = maintainUsers0.getUserByEmail("UncommonAtlas258");
        parkingSystem.model.SuperManager superManager27 = parkingSystem.model.SuperManager.getInstance();
        boolean boolean28 = superManager27.isValid();
        java.lang.String str29 = superManager27.toString();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager27);
        maintainUsers0.updateUser("", "UncommonZeus401", "CommonHades495", " () - Role: Visitor");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "36) test293(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LegendaryAtlas185" + "'", str9, "LegendaryAtlas185");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNull(abstractUser24);
        org.junit.Assert.assertNull(abstractUser26);
        org.junit.Assert.assertNotNull(superManager27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str29, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        superManager0.setValid(false);
        java.lang.String str5 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
// flaky "37) test294(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str5, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("CommonAtlas303");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        boolean boolean6 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList4, "LegendaryZeus666");
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("UncommonAtlas990");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAtlas241", "RareAtlas923", "LegendaryAtlas957");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("RareKratos824", "hi! (EpicAres254) - Role: Faculty", "CommonHades705");
        parkingSystem.model.AbstractUser abstractUser12 = studentUserFactory0.createUser("RareHades843", "RareAtlas151", "EpicHades661");
        parkingSystem.model.AbstractUser abstractUser16 = studentUserFactory0.createUser("RareAtlas151", "UncommonZeus401", "Super Manager: LegendaryAres481 ()");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.VisitorUser visitorUser7 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser7.setEmail("");
        visitorUser7.setName("");
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) visitorUser7);
        double double13 = visitorUser7.getRate();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryHades780");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("RareAtlas563", "UncommonKratos478", "CommonHades844");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        parkingSystem.model.ManagerUser managerUser8 = superManager0.generateManagerAccount("EpicZeus525", "CommonAtlas875", "RareHades843");
        managerUser8.validateUser();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
// flaky "38) test302(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str3, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str4, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertNotNull(managerUser8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.parking.ParkingLot parkingLot9 = null;
        parkingSystem0.addLot(parkingLot9);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem12 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser15 = parkingSystem12.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser18 = parkingSystem12.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser22 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double23 = nonFacultyUser22.getRate();
        double double24 = nonFacultyUser22.getRate();
        parkingSystem12.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser22);
        parkingSystem.model.SuperManager superManager26 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str27 = superManager26.getName();
        parkingSystem12.registerUser((parkingSystem.model.AbstractUser) superManager26);
        parkingSystem.model.util.ParkingSystem parkingSystem29 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser32 = parkingSystem29.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser35 = parkingSystem29.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList36 = parkingSystem29.getLots();
        parkingSystem12.setLots(parkingLotList36);
        parkingSystem0.setLots(parkingLotList36);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 15.0d + "'", double23 == 15.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
        org.junit.Assert.assertNotNull(superManager26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RareAtlas121" + "'", str27, "RareAtlas121");
        org.junit.Assert.assertNotNull(parkingSystem29);
        org.junit.Assert.assertNull(abstractUser32);
        org.junit.Assert.assertNull(abstractUser35);
        org.junit.Assert.assertNotNull(parkingLotList36);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSpace2.setOccupied(true);
        parkingSystem.model.parking.ParkingLot parkingLot9 = parkingSpace2.getLot();
        parkingSystem.model.parking.ParkingLot parkingLot10 = parkingSpace2.getLot();
        parkingSpace2.disable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertNull(parkingLot10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        maintainUser0.load();
        maintainUser0.update();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) visitorUser6);
        double double8 = visitorUser6.getRate();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicHades610", "Super Manager: RareAtlas923 ()", "RareAtlas525");
        boolean boolean4 = studentUser3.isValidated();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory14 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser18 = visitorUserFactory14.createUser("EpicAres716", "CommonHades705", "EpicAres300");
        parkingSystem0.removeUser(abstractUser18);
        java.lang.String str20 = abstractUser18.getPassword();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(abstractUser18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EpicAres300" + "'", str20, "EpicAres300");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUser0.getUsers();
        maintainUser0.load();
        org.junit.Assert.assertNotNull(abstractUserList1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str5 = superManager4.toString();
        java.lang.String str6 = superManager4.getEmail();
        superManager4.setValid(false);
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        maintainUsers0.updateUser("CommonAres499", "LegendaryZeus753", "LegendaryAres258", "RareAtlas525");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str5, "Super Manager: RareAtlas121 ()");
// flaky "39) test310(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RareZeus439" + "'", str6, "RareZeus439");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace2.addBooking(booking7);
        parkingSpace2.disable();
        parkingSpace2.disable();
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        java.time.LocalDateTime localDateTime30 = booking23.getEndTime();
        parkingSpace2.addBooking(booking23);
        java.time.LocalDateTime localDateTime32 = null;
        booking23.extendTime(localDateTime32);
        // The following exception was thrown during execution in test generation
        try {
            booking23.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser4 = parkingSystem1.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser8 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser8.setPassword("EpicAres571");
        parkingSystem1.removeUser((parkingSystem.model.AbstractUser) studentUser8);
        parkingSystem.model.NonFacultyUser nonFacultyUser15 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str16 = nonFacultyUser15.toString();
        parkingSystem1.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser15);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList18 = parkingSystem1.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList19 = parkingSystem1.getUsers();
        boolean boolean21 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList19, "CommonHades337");
        boolean boolean23 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList19, "UncommonAtlas532");
        parkingSystem0.setUsers(abstractUserList19);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertNull(abstractUser4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str16, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList18);
        org.junit.Assert.assertNotNull(abstractUserList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("LegendaryAtlas353", "RareHades843", "LegendaryAres258");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        boolean boolean6 = maintainUsers0.validateUser("LegendaryAres929", "LegendaryAtlas690");
        parkingSystem.model.AbstractUser abstractUser8 = maintainUsers0.getUserByEmail("LegendaryZeus837");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(abstractUser8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("RareAtlas502", "EpicZeus370", "CommonAtlas127");
        java.lang.String str9 = abstractUser8.getEmail();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EpicZeus370" + "'", str9, "EpicZeus370");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        facultyUser3.setName("LegendaryAtlas690");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        parkingSystem.model.parking.ParkingLot parkingLot6 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot6);
        parkingSpace7.disable();
        parkingSpace7.setOccupied(false);
        java.lang.String str11 = parkingSpace7.toString();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        parkingSystem.model.parking.Booking booking15 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser3, parkingSpace7, localDateTime12, localDateTime13, "EpicAres571 () - Role: Visitor");
        parkingSystem.model.VisitorUser visitorUser19 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser19.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot23 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace24 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot23);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        parkingSystem.model.parking.Booking booking28 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser19, parkingSpace24, localDateTime25, localDateTime26, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser32 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser32.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot36 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace37 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot36);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        parkingSystem.model.parking.Booking booking41 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser32, parkingSpace37, localDateTime38, localDateTime39, "EpicAres254");
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        booking41.updateTime(localDateTime42, localDateTime43);
        java.lang.String str45 = booking41.getLicensePlate();
        parkingSpace24.addBooking(booking41);
        booking41.checkedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace48 = booking41.getSpace();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        parkingSystem.model.parking.Booking booking52 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser3, parkingSpace48, localDateTime49, localDateTime50, "RareZeus986");
        // The following exception was thrown during execution in test generation
        try {
            booking52.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lot 0" + "'", str11, "Lot 0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EpicAres254" + "'", str45, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace48);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("LegendaryZeus891", "CommonZeus931", "LegendaryZeus753");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        boolean boolean6 = parkingSpace2.isEnabled();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = parkingSpace2.isAvailable(localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("EpicHades415", "CommonAtlas674", "CommonZeus931");
        abstractUser8.removeValidation();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.database.MaintainUsers maintainUsers2 = new parkingSystem.database.MaintainUsers();
        maintainUsers2.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser7 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray8 = new parkingSystem.model.AbstractUser[] { nonFacultyUser7 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList9 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList9, abstractUserArray8);
        java.lang.String str11 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList9);
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList9, "EpicAres571");
        boolean boolean15 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList9, "CommonAtlas127");
        maintainUsers2.users = abstractUserList9;
        parkingSystem.model.AbstractUser abstractUser18 = maintainUsers2.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory19 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser23 = nonFacultyUserFactory19.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers2.addUser(abstractUser23);
        maintainUsers0.addUser(abstractUser23);
        parkingSystem.model.util.ParkingSystem parkingSystem26 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser29 = parkingSystem26.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser33 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser33.setPassword("EpicAres571");
        parkingSystem26.removeUser((parkingSystem.model.AbstractUser) studentUser33);
        parkingSystem.model.NonFacultyUser nonFacultyUser40 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str41 = nonFacultyUser40.toString();
        parkingSystem26.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser40);
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser40);
        double double44 = nonFacultyUser40.getRate();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "40) test321(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CommonHades135" + "'", str11, "CommonHades135");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingSystem26);
        org.junit.Assert.assertNull(abstractUser29);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str41, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 15.0d + "'", double44 == 15.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryAres929", "CommonHades495", "EpicAres346");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        parkingSystem.model.parking.Booking booking16 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime13, localDateTime14, "RareAtlas563");
        double double17 = visitorUser3.getRate();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser21 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser21.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser21, parkingSpace26, localDateTime27, localDateTime28, "EpicAres254");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking30.updateTime(localDateTime31, localDateTime32);
        parkingSpace17.removeBooking(booking30);
        java.time.LocalDateTime localDateTime35 = booking30.getEndTime();
        booking30.setLicensePlate("CommonAtlas875");
        java.time.LocalDateTime localDateTime38 = booking30.getEndTime();
        java.time.LocalDateTime localDateTime39 = booking30.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNull(localDateTime39);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory14 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser18 = visitorUserFactory14.createUser("EpicAres716", "CommonHades705", "EpicAres300");
        parkingSystem0.removeUser(abstractUser18);
        parkingSystem.model.AbstractUser abstractUser22 = parkingSystem0.login("CommonAtlas127", "CommonAres691");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(abstractUser18);
        org.junit.Assert.assertNull(abstractUser22);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        boolean boolean1 = parkingSystem.model.util.LicensePlateVerifier.isValidLicense("LegendaryAtlas690");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("LegendaryHades507", "CommonAres908", "LegendaryHades409");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        parkingSystem.model.AbstractUser abstractUser16 = parkingSystem0.login("Super Manager: LegendaryAres481 ()", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser16);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) facultyUser4);
        parkingSystem.model.SuperManager superManager8 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str9 = superManager8.toString();
        java.lang.String str10 = superManager8.getEmail();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) superManager8);
        parkingSystem.model.ManagerUser managerUser15 = new parkingSystem.model.ManagerUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "RareAtlas525", "UncommonAtlas241");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) managerUser15);
        parkingSystem.model.SuperManager superManager17 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str18 = superManager17.toString();
        java.lang.String str19 = superManager17.toString();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) superManager17);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(superManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str9, "Super Manager: RareAtlas121 ()");
// flaky "41) test327(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareZeus439" + "'", str10, "RareZeus439");
        org.junit.Assert.assertNotNull(superManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str18, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str19, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("CommonHades844", "", "LegendaryAtlas185");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean18 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        java.lang.String str19 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "42) test329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonAtlas397" + "'", str10, "CommonAtlas397");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky "14) test329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EpicKratos458" + "'", str19, "EpicKratos458");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        java.lang.String str7 = parkingSpace2.toString();
        boolean boolean8 = parkingSpace2.isEnabled();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace2.getBookings();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lot 0" + "'", str7, "Lot 0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        parkingSystem.model.parking.ParkingLot parkingLot14 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot14);
        parkingSpace15.disable();
        parkingSpace15.setOccupied(false);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace15.isAvailable(localDateTime19, localDateTime20);
        parkingSystem.model.parking.Booking booking22 = null;
        parkingSpace15.addBooking(booking22);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray24 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace6, parkingSpace15 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList25 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25, parkingSpaceArray24);
        parkingLot2.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25);
        java.lang.String str28 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot2);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList30 = parkingLot2.getOpenSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList31 = parkingLot2.getOpenSpaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        org.junit.Assert.assertNotNull(parkingSpaceList31);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("Super Manager: RareAtlas923 ()", "CommonHades844", "RareZeus212");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser21 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser21.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser21, parkingSpace26, localDateTime27, localDateTime28, "EpicAres254");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking30.updateTime(localDateTime31, localDateTime32);
        parkingSpace17.removeBooking(booking30);
        java.time.LocalDateTime localDateTime35 = booking30.getEndTime();
        booking30.setLicensePlate("CommonAtlas875");
        java.time.LocalDateTime localDateTime38 = booking30.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDateTime38);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList6 = parkingLot3.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot3);
        boolean boolean8 = parkingSpace7.isEnabled();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryAres929", "CommonHades495", "EpicAres346");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        parkingSystem.model.parking.Booking booking16 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime13, localDateTime14, "RareAtlas563");
        java.util.List<parkingSystem.model.parking.Booking> bookingList17 = parkingSpace6.getBookings();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser8 = parkingSystem5.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser12.setPassword("EpicAres571");
        parkingSystem5.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        studentUser12.setPassword("UncommonZeus120");
        double double18 = studentUser12.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser12);
        parkingSystem.model.FacultyUser facultyUser23 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser23.removeValidation();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) facultyUser23);
        maintainUser0.update();
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) facultyUser4);
        java.lang.String str8 = facultyUser4.toString();
        boolean boolean9 = facultyUser4.isValidated();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (EpicAres254) - Role: Faculty" + "'", str8, "hi! (EpicAres254) - Role: Faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser21 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser21.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser21, parkingSpace26, localDateTime27, localDateTime28, "EpicAres254");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking30.updateTime(localDateTime31, localDateTime32);
        parkingSpace17.removeBooking(booking30);
        java.time.LocalDateTime localDateTime35 = booking30.getEndTime();
        parkingSystem.model.parking.ParkingSpace parkingSpace36 = booking30.getSpace();
        parkingSpace36.setOccupied(true);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNotNull(parkingSpace36);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("UncommonAtlas241", "RareAtlas121", "LegendaryAtlas690");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = parkingSpace6.getNextAvailableTime(localDateTime13);
        parkingSystem.model.VisitorUser visitorUser18 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser18.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot22 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace23 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot22);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        parkingSystem.model.parking.Booking booking27 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser18, parkingSpace23, localDateTime24, localDateTime25, "EpicAres254");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        booking27.updateTime(localDateTime28, localDateTime29);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking27.updateTime(localDateTime31, localDateTime32);
        parkingSpace6.removeBooking(booking27);
        parkingSystem.model.parking.ParkingSpace parkingSpace35 = booking27.getSpace();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        parkingSystem.model.parking.Booking booking39 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) studentUser3, parkingSpace35, localDateTime36, localDateTime37, "CommonHades705");
        boolean boolean40 = parkingSpace35.isOccupied();
        boolean boolean41 = parkingSpace35.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSpace2.setOccupied(true);
        parkingSystem.model.parking.ParkingLot parkingLot9 = parkingSpace2.getLot();
        boolean boolean10 = parkingSpace2.isOccupied();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot33 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace34 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot33);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        parkingSystem.model.parking.Booking booking38 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser29, parkingSpace34, localDateTime35, localDateTime36, "EpicAres254");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking38.updateTime(localDateTime39, localDateTime40);
        parkingSystem.model.parking.ParkingSpace parkingSpace42 = booking38.getSpace();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = parkingSpace42.getNextAvailableTime(localDateTime43);
        parkingSpace42.enable();
        parkingSpace42.disable();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        parkingSystem.model.parking.Booking booking50 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser21, parkingSpace42, localDateTime47, localDateTime48, "Sn6-");
        facultyUser21.setName("EpicZeus370");
        double double53 = facultyUser21.getRate();
        facultyUser21.setPassword("RareZeus959");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "43) test341(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UncommonHades555" + "'", str10, "UncommonHades555");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 15.0d + "'", double53 == 15.0d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        boolean boolean13 = parkingSpace8.isEnabled();
        parkingSpace8.enable();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSpace16.enable();
        parkingSpace16.disable();
        parkingSystem.model.parking.ParkingLot parkingLot21 = parkingSpace16.getLot();
        parkingSystem.model.VisitorUser visitorUser25 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser25.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot29 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace30 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot29);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        parkingSystem.model.parking.Booking booking34 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser25, parkingSpace30, localDateTime31, localDateTime32, "EpicAres254");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        booking34.updateTime(localDateTime35, localDateTime36);
        parkingSystem.model.parking.ParkingSpace parkingSpace38 = booking34.getSpace();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = parkingSpace38.getNextAvailableTime(localDateTime39);
        parkingSystem.model.VisitorUser visitorUser44 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser44.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot48 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace49 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot48);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        parkingSystem.model.parking.Booking booking53 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser44, parkingSpace49, localDateTime50, localDateTime51, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser57 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser57.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot61 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace62 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot61);
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        parkingSystem.model.parking.Booking booking66 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser57, parkingSpace62, localDateTime63, localDateTime64, "EpicAres254");
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        booking66.updateTime(localDateTime67, localDateTime68);
        java.lang.String str70 = booking66.getLicensePlate();
        parkingSpace49.addBooking(booking66);
        parkingSpace38.removeBooking(booking66);
        java.time.LocalDateTime localDateTime73 = null;
        booking66.extendTime(localDateTime73);
        java.lang.String str75 = booking66.getLicensePlate();
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        booking66.updateTime(localDateTime76, localDateTime77);
        parkingSpace16.addBooking(booking66);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(parkingLot21);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "EpicAres254" + "'", str70, "EpicAres254");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "EpicAres254" + "'", str75, "EpicAres254");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray4 = new parkingSystem.model.AbstractUser[] { nonFacultyUser3 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList5, abstractUserArray4);
        java.lang.String str7 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "EpicAres571");
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "UncommonAtlas241");
        java.lang.String str13 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        org.junit.Assert.assertNotNull(abstractUserArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "44) test344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CommonKratos485" + "'", str7, "CommonKratos485");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "15) test344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareAres306" + "'", str10, "RareAres306");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "5) test344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LegendaryHades935" + "'", str13, "LegendaryHades935");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getName();
        java.lang.String str2 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RareAtlas121" + "'", str1, "RareAtlas121");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str2, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        parkingSystem.model.parking.Booking booking9 = null;
        parkingSpace2.addBooking(booking9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        booking23.processDeposit();
        java.time.LocalDateTime localDateTime28 = null;
        booking23.extendTime(localDateTime28);
        java.time.LocalDateTime localDateTime30 = booking23.getEndTime();
        parkingSpace2.addBooking(booking23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        parkingSystem.model.util.ParkingSystem parkingSystem2 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot4 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str5 = parkingLot4.toString();
        parkingSystem2.addLot(parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot4.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot4);
        parkingSystem.model.parking.ParkingLot parkingLot10 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str11 = parkingLot10.toString();
        parkingSystem.model.parking.ParkingLot parkingLot13 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str14 = parkingLot13.toString();
        parkingSystem.model.parking.ParkingLot parkingLot16 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot16);
        parkingSpace17.disable();
        parkingSpace17.setOccupied(false);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = parkingSpace17.isAvailable(localDateTime21, localDateTime22);
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        parkingSpace26.disable();
        parkingSpace26.setOccupied(false);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = parkingSpace26.isAvailable(localDateTime30, localDateTime31);
        parkingSystem.model.parking.Booking booking33 = null;
        parkingSpace26.addBooking(booking33);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray35 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace17, parkingSpace26 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList36 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList36, parkingSpaceArray35);
        parkingLot13.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList36);
        parkingLot10.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList36);
        parkingLot4.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList36);
        java.lang.String str41 = parkingLot4.getLocation();
        parkingSystem.model.parking.ParkingSpace parkingSpace42 = new parkingSystem.model.parking.ParkingSpace((int) (byte) -1, parkingLot4);
        org.junit.Assert.assertNotNull(parkingSystem2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LegendaryZeus350" + "'", str11, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LegendaryZeus350" + "'", str14, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "LegendaryZeus350" + "'", str41, "LegendaryZeus350");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser7 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) facultyUser7);
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.loginViaName("UncommonAtlas387", "CommonAres908");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList12 = parkingSystem0.getLots();
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("LegendaryZeus206", "EpicHades415", "LegendaryKratos893");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList6 = parkingLot3.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot3);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList8 = parkingLot3.getOpenSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot3.getOpenSpaces();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = superManager11.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser3.setEmail("EpicAres571");
        boolean boolean6 = managerUser3.isValid();
        managerUser3.setName("LegendaryZeus753");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("EpicHades715");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        boolean boolean6 = maintainUsers0.validateUser("LegendaryAres929", "LegendaryAtlas690");
        boolean boolean9 = maintainUsers0.validateUser("RareZeus883", "LegendaryZeus666");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicZeus667", "", "EpicAres254");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAtlas241", "RareAtlas923", "LegendaryAtlas957");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("RareKratos824", "hi! (EpicAres254) - Role: Faculty", "CommonHades705");
        java.lang.String str9 = abstractUser8.toString();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareKratos824 (hi! (EpicAres254) - Role: Faculty) - Role: Student" + "'", str9, "RareKratos824 (hi! (EpicAres254) - Role: Faculty) - Role: Student");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("", "", "");
        double double4 = facultyUser3.getRate();
        java.lang.String str5 = facultyUser3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " () - Role: Faculty" + "'", str5, " () - Role: Faculty");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryAtlas957", "RareZeus439", "LegendaryHades409");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser6);
        parkingSystem.model.StudentUser studentUser11 = new parkingSystem.model.StudentUser("RareZeus959", "LegendaryAres929", "EpicAres734");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) studentUser11);
        boolean boolean13 = studentUser11.isValidated();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.clearPastBookings();
        parkingSpace2.setOccupied(false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("Sn6-", "LegendaryZeus777", "UncommonKratos282");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        superManager0.setValid(false);
        java.lang.String str5 = superManager0.toString();
        java.lang.String str6 = superManager0.getRole();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
// flaky "45) test360(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str5, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Manager" + "'", str6, "Manager");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory14 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser18 = visitorUserFactory14.createUser("EpicAres716", "CommonHades705", "EpicAres300");
        parkingSystem0.removeUser(abstractUser18);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList20 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(abstractUser18);
        org.junit.Assert.assertNotNull(parkingLotList20);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser3.setEmail("EpicAres571");
        parkingSystem.model.VisitorUser visitorUser9 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser9.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot13 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        parkingSystem.model.parking.Booking booking18 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser9, parkingSpace14, localDateTime15, localDateTime16, "EpicAres254");
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        booking18.updateTime(localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        booking18.updateTime(localDateTime22, localDateTime23);
        java.time.LocalDateTime localDateTime25 = booking18.getEndTime();
        booking18.checkedOut();
        boolean boolean27 = booking18.isCheckedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace28 = booking18.getSpace();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        parkingSystem.model.parking.Booking booking32 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) managerUser3, parkingSpace28, localDateTime29, localDateTime30, "EpicHades715");
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpace28);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        parkingSystem.model.AbstractUser abstractUser2 = maintainUsers0.getUserByEmail("hi!");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUsers0.users;
        org.junit.Assert.assertNull(abstractUser2);
        org.junit.Assert.assertNotNull(abstractUserList3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        parkingSystem.model.parking.ParkingLot parkingLot6 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot6);
        parkingSpace7.disable();
        parkingSpace7.setOccupied(false);
        java.lang.String str11 = parkingSpace7.toString();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        parkingSystem.model.parking.Booking booking15 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser3, parkingSpace7, localDateTime12, localDateTime13, "EpicAres571 () - Role: Visitor");
        // The following exception was thrown during execution in test generation
        try {
            booking15.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lot 0" + "'", str11, "Lot 0");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser8 = parkingSystem5.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser12.setPassword("EpicAres571");
        parkingSystem5.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        studentUser12.setPassword("UncommonZeus120");
        double double18 = studentUser12.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser12);
        double double20 = studentUser12.getRate();
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList9 = parkingSystem0.getUsers();
        parkingSystem.model.SuperManager superManager10 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str11 = superManager10.toString();
        java.lang.String str12 = superManager10.getEmail();
        superManager10.setValid(false);
        java.lang.String str15 = superManager10.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager10);
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("LegendaryZeus777", "RareAtlas502", "LegendaryAres724");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNotNull(abstractUserList9);
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str11, "Super Manager: RareAtlas121 ()");
// flaky "46) test366(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RareZeus439" + "'", str12, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str15, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot2);
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = parkingSpace4.getNextAvailableTime(localDateTime5);
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace4.addBooking(booking7);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUser maintainUser1 = new parkingSystem.database.MaintainUser();
        maintainUser1.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser1.getUsers();
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList3);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        boolean boolean17 = maintainUsers0.validateUser("UncommonKratos521", "EpicAtlas492");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "47) test369(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EpicZeus820" + "'", str9, "EpicZeus820");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("", "Super Manager: RareAtlas923 ()", "EpicAres918");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("CommonKratos108", "EpicAres254", "UncommonAtlas387");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("EpicAres918", "LegendaryZeus837", "UncommonZeus401");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.VisitorUser visitorUser4 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str5 = visitorUser4.getPassword();
        java.lang.String str6 = visitorUser4.getEmail();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) visitorUser4);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = validationRequestBuffer0.getRequests();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str6, "Super Manager: EpicAres254 ()");
        org.junit.Assert.assertNotNull(abstractUserList8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("LegendaryAres258", "RareKratos764", "EpicZeus556");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("CommonHades135", "LegendaryZeus753", "LegendaryZeus653");
        org.junit.Assert.assertNotNull(abstractUser4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryZeus350", "EpicAres254");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        boolean boolean8 = parkingSpace6.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace6.getBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        parkingSystem.model.parking.Booking booking13 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime10, localDateTime11, "UncommonKratos611");
        booking13.processDeposit();
        parkingSystem.model.AbstractUser abstractUser15 = booking13.getUser();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNotNull(abstractUser15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        parkingSystem.model.AbstractUser abstractUser2 = maintainUsers0.getUserByEmail("hi!");
        boolean boolean5 = maintainUsers0.validateUser("CommonAres691", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        maintainUsers0.load();
        org.junit.Assert.assertNull(abstractUser2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("RareZeus959");
        parkingLot3.setLocation("UncommonHades257");
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot3);
        java.lang.String str11 = parkingLot3.toString();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UncommonHades257" + "'", str11, "UncommonHades257");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        boolean boolean4 = parkingSpace2.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList5 = parkingSpace2.getBookings();
        parkingSpace2.enable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryAtlas957", "RareZeus439", "LegendaryHades409");
        visitorUser3.setPassword("EpicHades661");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.AbstractUser[] abstractUserArray26 = new parkingSystem.model.AbstractUser[] {};
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList27 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList27, abstractUserArray26);
        java.lang.String str29 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList27);
        parkingSystem.model.VisitorUser visitorUser34 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser34.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot38 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace39 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot38);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        parkingSystem.model.parking.Booking booking43 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser34, parkingSpace39, localDateTime40, localDateTime41, "EpicAres254");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser34);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList45 = validationRequestBuffer0.getRequests();
        java.lang.String str46 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList45);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "48) test380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonZeus757" + "'", str10, "CommonZeus757");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray26);
        org.junit.Assert.assertArrayEquals(abstractUserArray26, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "16) test380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicZeus475" + "'", str29, "EpicZeus475");
        org.junit.Assert.assertNotNull(abstractUserList45);
// flaky "6) test380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "LegendaryAres113" + "'", str46, "LegendaryAres113");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        java.lang.String str6 = visitorUser3.getEmail();
        double double7 = visitorUser3.getRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        booking25.setLicensePlate("CommonAres499");
        booking25.setLicensePlate("LegendaryHades409");
        booking25.setLicensePlate("LegendaryAtlas957");
        booking25.setLicensePlate("CommonKratos108");
        boolean boolean39 = booking25.isCheckedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = booking25.getSpace();
        java.time.LocalDateTime localDateTime41 = booking25.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            double double42 = booking25.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertNull(localDateTime41);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str2 = parkingLot1.toString();
        parkingSystem.model.parking.ParkingLot parkingLot4 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace5 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot4);
        parkingSpace5.disable();
        parkingSpace5.setOccupied(false);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = parkingSpace5.isAvailable(localDateTime9, localDateTime10);
        parkingSystem.model.parking.ParkingLot parkingLot13 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot13);
        parkingSpace14.disable();
        parkingSpace14.setOccupied(false);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = parkingSpace14.isAvailable(localDateTime18, localDateTime19);
        parkingSystem.model.parking.Booking booking21 = null;
        parkingSpace14.addBooking(booking21);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray23 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace5, parkingSpace14 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList24 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList24, parkingSpaceArray23);
        parkingLot1.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList24);
        parkingLot1.setLocation("CommonAres691");
        java.lang.String str29 = parkingLot1.toString();
        parkingSystem.model.parking.ParkingLot parkingLot31 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str32 = parkingLot31.toString();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList33 = parkingLot31.getSpaces();
        parkingLot1.setSpaces(parkingSpaceList33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendaryZeus350" + "'", str2, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CommonAres691" + "'", str29, "CommonAres691");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LegendaryZeus350" + "'", str32, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList33);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.util.List<parkingSystem.model.parking.Booking> bookingList6 = parkingSpace2.getBookings();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = parkingSpace2.isAvailable(localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        facultyUser4.setEmail("Faculty");
        maintainUser0.addUser((parkingSystem.model.AbstractUser) facultyUser4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.clearPastBookings();
        int int4 = parkingSpace2.getId();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = parkingSpace2.isAvailable(localDateTime5, localDateTime6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList18 = parkingSystem0.getUsers();
        boolean boolean20 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList18, "CommonHades337");
        boolean boolean22 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList18, "UncommonAtlas532");
        java.lang.String str23 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList18);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky "49) test387(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UncommonKratos646" + "'", str23, "UncommonKratos646");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser16 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser16.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot20 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser16, parkingSpace21, localDateTime22, localDateTime23, "EpicAres254");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking25.updateTime(localDateTime26, localDateTime27);
        java.lang.String str29 = booking25.getLicensePlate();
        parkingSpace8.addBooking(booking25);
        int int31 = parkingSpace8.getId();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        parkingSystem.model.NonFacultyUser nonFacultyUser26 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray27 = new parkingSystem.model.AbstractUser[] { nonFacultyUser26 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList28 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList28, abstractUserArray27);
        java.lang.String str30 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "EpicAres571");
        maintainUsers0.users = abstractUserList28;
        maintainUsers0.update();
        maintainUsers0.updateUser("CommonHades495", "Visitor", "CommonAtlas875", "RareKratos824");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "50) test389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareZeus936" + "'", str9, "RareZeus936");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "17) test389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EpicAres495" + "'", str30, "EpicAres495");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.AbstractUser abstractUser5 = maintainUsers0.getUserByEmail("UncommonKratos282");
        maintainUsers0.load();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser5);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime21 = null;
        booking12.extendTime(localDateTime21);
        parkingSystem.model.AbstractUser abstractUser23 = booking12.getUser();
        org.junit.Assert.assertNotNull(abstractUser23);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.login("Super Manager: RareAtlas923 ()", "RareKratos764");
        parkingSystem.model.AbstractUser abstractUser14 = parkingSystem0.login("Super Manager: RareZeus212 ()", "LegendaryAtlas690");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNull(abstractUser14);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSystem.model.parking.Booking booking6 = null;
        parkingSpace2.addBooking(booking6);
        parkingSystem.model.VisitorUser visitorUser11 = new parkingSystem.model.VisitorUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryZeus350", "EpicAres254");
        parkingSystem.model.parking.ParkingLot parkingLot13 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot13);
        parkingSpace14.disable();
        boolean boolean16 = parkingSpace14.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList17 = parkingSpace14.getBookings();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        parkingSystem.model.parking.Booking booking21 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser11, parkingSpace14, localDateTime18, localDateTime19, "UncommonKratos611");
        booking21.processDeposit();
        booking21.setLicensePlate("EpicHades715");
        parkingSpace2.removeBooking(booking21);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        booking21.updateTime(localDateTime26, localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("Faculty");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        parkingSystem.model.parking.ParkingLot parkingLot6 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot6);
        parkingSpace7.disable();
        parkingSpace7.setOccupied(false);
        java.lang.String str11 = parkingSpace7.toString();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        parkingSystem.model.parking.Booking booking15 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser3, parkingSpace7, localDateTime12, localDateTime13, "EpicAres571 () - Role: Visitor");
        java.time.LocalDateTime localDateTime16 = null;
        booking15.extendTime(localDateTime16);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lot 0" + "'", str11, "Lot 0");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("LegendaryZeus350", "RareKratos824", "LegendaryZeus350");
        facultyUser3.setPassword("");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.setLicensePlate("UncommonHades257");
        java.lang.String str21 = booking12.getLicensePlate();
        parkingSystem.model.AbstractUser abstractUser22 = booking12.getUser();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UncommonHades257" + "'", str21, "UncommonHades257");
        org.junit.Assert.assertNotNull(abstractUser22);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken(abstractUserList0, "UncommonAtlas258");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        int int13 = parkingSpace8.getId();
        parkingSpace8.setOccupied(false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        maintainUsers0.updateUser("EpicHades415", "EpicAres346", "", "LegendaryAres929");
        maintainUsers0.updateUser(" () - Role: Visitor", "RareAtlas121", "UncommonAtlas990", "LegendaryZeus350");
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
// flaky "51) test401(RegressionTest0)":         maintainUser0.load();
// flaky "18) test401(RegressionTest0)":         maintainUser0.load();
// flaky "7) test401(RegressionTest0)":         maintainUser0.load();
        maintainUser0.update();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        booking12.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser21 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser21.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot25 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser21, parkingSpace26, localDateTime27, localDateTime28, "EpicAres254");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        booking30.updateTime(localDateTime31, localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        booking30.updateTime(localDateTime34, localDateTime35);
        java.time.LocalDateTime localDateTime37 = booking30.getEndTime();
        parkingSpace17.removeBooking(booking30);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime37);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        boolean boolean6 = parkingSpace2.isEnabled();
        java.util.List<parkingSystem.model.parking.Booking> bookingList7 = parkingSpace2.getBookings();
        parkingSpace2.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.VisitorUser visitorUser29 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser29.setEmail("");
        double double32 = visitorUser29.getRate();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) visitorUser29);
        parkingSystem.model.StudentUser studentUser37 = new parkingSystem.model.StudentUser("UncommonAtlas241", "RareAtlas121", "LegendaryAtlas690");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) studentUser37);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "52) test404(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonAres808" + "'", str10, "CommonAres808");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        boolean boolean8 = maintainUsers0.validateUser("CommonHades705", "CommonKratos119");
        parkingSystem.model.AbstractUser abstractUser10 = maintainUsers0.getUserByEmail("hi!");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(abstractUser10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        booking23.checkedOut();
        parkingSystem.model.AbstractUser abstractUser32 = booking23.getUser();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(abstractUser32);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setName("");
        visitorUser3.setValid(false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("CommonAres499", "UncommonZeus401", "Super Manager: RareAtlas121 ()");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("LegendaryZeus350", "RareAtlas563", "LegendaryHades662");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = booking12.getSpace();
        booking12.checkedIn();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = booking12.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace19);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("EpicAres300", "LegendaryHades903", "RareAtlas563");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSpace16.enable();
        parkingSpace16.setOccupied(true);
        parkingSpace16.setOccupied(true);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = superManager4.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUser0.getUsers();
        parkingSystem.model.AbstractUser abstractUser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.addUser(abstractUser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.AbstractUser.getName()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(abstractUserList4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        parkingSystem.model.AbstractUser abstractUser9 = parkingSystem0.login("LegendaryZeus350", "LegendaryAtlas957");
        parkingSystem.model.AbstractUser abstractUser12 = parkingSystem0.loginViaName("RareZeus486", "EpicHades825");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNull(abstractUser9);
        org.junit.Assert.assertNull(abstractUser12);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.login("Super Manager: RareAtlas923 ()", "RareKratos764");
        parkingSystem.model.AbstractUser abstractUser14 = parkingSystem0.login("CommonAtlas674", "EpicHades661");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList15 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList16 = parkingSystem0.getUsers();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNull(abstractUser14);
        org.junit.Assert.assertNotNull(parkingLotList15);
        org.junit.Assert.assertNotNull(abstractUserList16);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSystem.model.VisitorUser visitorUser22 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser22.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot26 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        parkingSystem.model.parking.Booking booking31 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser22, parkingSpace27, localDateTime28, localDateTime29, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser35 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser35.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot39 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        parkingSystem.model.parking.Booking booking44 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser35, parkingSpace40, localDateTime41, localDateTime42, "EpicAres254");
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        booking44.updateTime(localDateTime45, localDateTime46);
        java.lang.String str48 = booking44.getLicensePlate();
        parkingSpace27.addBooking(booking44);
        parkingSpace16.removeBooking(booking44);
        java.time.LocalDateTime localDateTime51 = null;
        booking44.extendTime(localDateTime51);
        // The following exception was thrown during execution in test generation
        try {
            booking44.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        superManager0.setValid(false);
        superManager0.removeValidation();
        java.lang.String str7 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
// flaky "53) test417(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str3, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str7, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.util.ParkingSystem parkingSystem2 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot4 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str5 = parkingLot4.toString();
        parkingSystem2.addLot(parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot4.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot4);
        parkingLot4.setLocation("EpicHades715");
        java.lang.String str11 = parkingLot4.toString();
        parkingSystem0.addLot(parkingLot4);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSystem2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EpicHades715" + "'", str11, "EpicHades715");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValid();
        java.lang.String str2 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str2, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        parkingSystem.model.ManagerUser managerUser5 = superManager0.generateManagerAccount("UncommonHades308", "CommonAres287", "RareAtlas121");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertNotNull(managerUser5);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        maintainUsers0.update();
        parkingSystem.database.MaintainUsers maintainUsers5 = new parkingSystem.database.MaintainUsers();
        maintainUsers5.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray11 = new parkingSystem.model.AbstractUser[] { nonFacultyUser10 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList12 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList12, abstractUserArray11);
        java.lang.String str14 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList12);
        boolean boolean16 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList12, "EpicAres571");
        boolean boolean18 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList12, "CommonAtlas127");
        maintainUsers5.users = abstractUserList12;
        parkingSystem.model.AbstractUser abstractUser21 = maintainUsers5.getUserByEmail("hi!");
        parkingSystem.model.AbstractUser abstractUser23 = maintainUsers5.getUserByEmail("Sn6-");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList24 = maintainUsers5.users;
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList25 = maintainUsers5.users;
        parkingSystem.model.NonFacultyUser nonFacultyUser29 = new parkingSystem.model.NonFacultyUser(" () - Role: Visitor", "EpicAres716", "UncommonKratos611");
        maintainUsers5.addUser((parkingSystem.model.AbstractUser) nonFacultyUser29);
        nonFacultyUser29.setPassword("Super Manager: RareAtlas923 ()");
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser29);
        maintainUsers0.load();
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "54) test421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UncommonAres943" + "'", str14, "UncommonAres943");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(abstractUser21);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(abstractUserList24);
        org.junit.Assert.assertNotNull(abstractUserList25);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        maintainUser0.load();
        org.junit.Assert.assertNotNull(abstractUserList2);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("UncommonKratos646", "CommonHades844", "UncommonKratos478");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        maintainUsers0.updateUser("Sn6-", "", "CommonAres908", "Super Manager: EpicAres254 ()");
        maintainUsers0.updateUser("CommonKratos119", "LegendaryAres596", "CommonZeus931", "UncommonKratos282");
        maintainUsers0.load();
        boolean boolean36 = maintainUsers0.validateUser("", "Super Manager: EpicAres254 ()");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList37 = maintainUsers0.users;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "55) test424(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UncommonKratos188" + "'", str9, "UncommonKratos188");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(abstractUserList37);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser15 = booking12.getUser();
        boolean boolean16 = abstractUser15.isValid();
        org.junit.Assert.assertNotNull(abstractUser15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        boolean boolean6 = parkingSpace2.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser7 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) facultyUser7);
        parkingSystem.model.util.ParkingSystem parkingSystem9 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot11 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str12 = parkingLot11.toString();
        parkingSystem9.addLot(parkingLot11);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList14 = parkingSystem9.getLots();
        parkingSystem0.setLots(parkingLotList14);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LegendaryZeus350" + "'", str12, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingLotList14);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("EpicAres716", "CommonAtlas674", "EpicHades170");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("EpicAres254 (EpicAres254) - Role: Non-Faculty", "LegendaryZeus206", "UncommonKratos478");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.login("Super Manager: RareAtlas923 ()", "RareKratos764");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("LegendaryZeus753", " () - Role: Visitor", "RareAtlas121");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser11);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        maintainUser0.update();
        org.junit.Assert.assertNotNull(abstractUserList3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        double double13 = visitorUser3.getRate();
        java.lang.String str14 = visitorUser3.getPassword();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EpicAres571" + "'", str14, "EpicAres571");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser14 = parkingSystem0.login("RareAtlas923", "EpicAres734");
        parkingSystem.model.VisitorUser visitorUser18 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str19 = visitorUser18.getPassword();
        java.lang.String str20 = visitorUser18.getEmail();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) visitorUser18);
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("UncommonKratos808", "LegendaryKratos893", "UncommonKratos808");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNull(abstractUser14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str20, "Super Manager: EpicAres254 ()");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        parkingSystem.model.AbstractUser abstractUser2 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.load();
        boolean boolean6 = maintainUsers0.validateUser("CommonAtlas674", "UncommonZeus748");
        maintainUsers0.update();
        org.junit.Assert.assertNull(abstractUser2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = maintainUser0.getUsers();
        parkingSystem.model.VisitorUser visitorUser9 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser9.setEmail("");
        double double12 = visitorUser9.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) visitorUser9);
        java.lang.String str14 = visitorUser9.getEmail();
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(abstractUserList5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        parkingSystem.model.util.ParkingSystem parkingSystem2 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot4 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str5 = parkingLot4.toString();
        parkingSystem2.addLot(parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot4.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot4.getOpenSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList11 = parkingLot4.getSpaces();
        org.junit.Assert.assertNotNull(parkingSystem2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = booking12.getSpace();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = parkingSpace16.getNextAvailableTime(localDateTime17);
        parkingSpace16.enable();
        parkingSpace16.disable();
        java.lang.String str21 = parkingSpace16.toString();
        parkingSystem.model.parking.Booking booking22 = null;
        parkingSpace16.removeBooking(booking22);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lot 0" + "'", str21, "Lot 0");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUser0.getUsers();
        java.lang.String str5 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList4);
        java.lang.String str6 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList4);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(abstractUserList4);
// flaky "56) test437(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UncommonZeus957" + "'", str5, "UncommonZeus957");
// flaky "19) test437(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CommonAtlas820" + "'", str6, "CommonAtlas820");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.updateUser("UncommonAtlas532", "CommonAtlas127", "Sn6-", "");
        parkingSystem.database.MaintainUser maintainUser22 = new parkingSystem.database.MaintainUser();
        maintainUser22.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList24 = maintainUser22.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList25 = maintainUser22.getUsers();
        maintainUser22.load();
        parkingSystem.model.util.ParkingSystem parkingSystem27 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser30 = parkingSystem27.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser34 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser34.setPassword("EpicAres571");
        parkingSystem27.removeUser((parkingSystem.model.AbstractUser) studentUser34);
        studentUser34.setPassword("UncommonZeus120");
        double double40 = studentUser34.getRate();
        maintainUser22.addUser((parkingSystem.model.AbstractUser) studentUser34);
        parkingSystem.model.FacultyUser facultyUser45 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser45.removeValidation();
        maintainUser22.addUser((parkingSystem.model.AbstractUser) facultyUser45);
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList48 = maintainUser22.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList49 = maintainUser22.getUsers();
        maintainUsers0.users = abstractUserList49;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "57) test438(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EpicKratos686" + "'", str9, "EpicKratos686");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUserList24);
        org.junit.Assert.assertNotNull(abstractUserList25);
        org.junit.Assert.assertNotNull(parkingSystem27);
        org.junit.Assert.assertNull(abstractUser30);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 15.0d + "'", double40 == 15.0d);
        org.junit.Assert.assertNotNull(abstractUserList48);
        org.junit.Assert.assertNotNull(abstractUserList49);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.parking.ParkingLot parkingLot12 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str13 = parkingLot12.toString();
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        parkingSpace16.disable();
        parkingSpace16.setOccupied(false);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = parkingSpace16.isAvailable(localDateTime20, localDateTime21);
        parkingSystem.model.parking.ParkingLot parkingLot24 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace25 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot24);
        parkingSpace25.disable();
        parkingSpace25.setOccupied(false);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = parkingSpace25.isAvailable(localDateTime29, localDateTime30);
        parkingSystem.model.parking.Booking booking32 = null;
        parkingSpace25.addBooking(booking32);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray34 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace16, parkingSpace25 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList35 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList35, parkingSpaceArray34);
        parkingLot12.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList35);
        java.lang.String str38 = parkingLot12.toString();
        parkingSystem0.addLot(parkingLot12);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList40 = parkingSystem0.getUsers();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LegendaryZeus350" + "'", str13, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LegendaryZeus350" + "'", str38, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(abstractUserList40);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        parkingSystem.model.VisitorUser visitorUser5 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser5.setEmail("");
        visitorUser5.setEmail("Super Manager: EpicAres254 ()");
        double double10 = visitorUser5.getRate();
        visitorUser5.setEmail("EpicAres734");
        maintainUser0.addUser((parkingSystem.model.AbstractUser) visitorUser5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        parkingSpace6.setOccupied(false);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = parkingSpace6.isAvailable(localDateTime10, localDateTime11);
        parkingSystem.model.parking.ParkingLot parkingLot14 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot14);
        parkingSpace15.disable();
        parkingSpace15.setOccupied(false);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace15.isAvailable(localDateTime19, localDateTime20);
        parkingSystem.model.parking.Booking booking22 = null;
        parkingSpace15.addBooking(booking22);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray24 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace6, parkingSpace15 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList25 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25, parkingSpaceArray24);
        parkingLot2.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList25);
        java.lang.String str28 = parkingLot2.toString();
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot2);
        java.lang.String str30 = parkingLot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LegendaryZeus350" + "'", str30, "LegendaryZeus350");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray4 = new parkingSystem.model.AbstractUser[] { nonFacultyUser3 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList5, abstractUserArray4);
        java.lang.String str7 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "EpicAres571");
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "CommonAtlas127");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "UncommonAtlas526");
        org.junit.Assert.assertNotNull(abstractUserArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "58) test442(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UncommonKratos542" + "'", str7, "UncommonKratos542");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        parkingSystem.model.NonFacultyUser nonFacultyUser26 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray27 = new parkingSystem.model.AbstractUser[] { nonFacultyUser26 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList28 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList28, abstractUserArray27);
        java.lang.String str30 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "EpicAres571");
        maintainUsers0.users = abstractUserList28;
        parkingSystem.model.AbstractUser abstractUser35 = maintainUsers0.getUserByEmail("Manager");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "59) test443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareZeus961" + "'", str9, "RareZeus961");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "20) test443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EpicKratos321" + "'", str30, "EpicKratos321");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(abstractUser35);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser10 = parkingSystem0.loginViaName("EpicHades661", "EpicAres918");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNull(abstractUser10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory1 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser5 = studentUserFactory1.createUser("LegendaryZeus350", "RareAtlas121", "CommonAres908");
        validationRequestBuffer0.removeRequest(abstractUser5);
        parkingSystem.database.MaintainUsers maintainUsers7 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = maintainUsers7.users;
        parkingSystem.model.AbstractUser abstractUser10 = maintainUsers7.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str12 = superManager11.toString();
        java.lang.String str13 = superManager11.getEmail();
        superManager11.setValid(false);
        maintainUsers7.addUser((parkingSystem.model.AbstractUser) superManager11);
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) superManager11);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList18 = validationRequestBuffer0.getRequests();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUser5);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser10);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str12, "Super Manager: RareAtlas121 ()");
// flaky "60) test445(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RareZeus439" + "'", str13, "RareZeus439");
        org.junit.Assert.assertNotNull(abstractUserList18);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSpace2.setOccupied(true);
        parkingSystem.model.VisitorUser visitorUser12 = new parkingSystem.model.VisitorUser("LegendaryAres929", "CommonHades495", "EpicAres346");
        parkingSystem.model.parking.ParkingLot parkingLot14 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot14);
        parkingSpace15.disable();
        parkingSpace15.setOccupied(false);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace15.isAvailable(localDateTime19, localDateTime20);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        parkingSystem.model.parking.Booking booking25 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser12, parkingSpace15, localDateTime22, localDateTime23, "RareAtlas563");
        parkingSpace2.removeBooking(booking25);
        boolean boolean27 = parkingSpace2.isEnabled();
        int int28 = parkingSpace2.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAres378", "RareAtlas121", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        java.lang.String str5 = abstractUser4.getName();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UncommonAres378" + "'", str5, "UncommonAres378");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList11 = parkingLot6.getSpaces();
        parkingLot6.setLocation("UncommonZeus748");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        maintainUsers0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList24 = maintainUsers0.users;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "61) test449(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UncommonKratos922" + "'", str9, "UncommonKratos922");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserList24);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot2);
        parkingSpace4.setOccupied(true);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("UncommonKratos478", "CommonHades495", " () - Role: Visitor");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("Faculty", "CommonKratos485", "EpicZeus525");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = parkingSpace2.isAvailable(localDateTime3, localDateTime4);
        parkingSpace2.setOccupied(true);
        parkingSpace2.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("EpicZeus525");
        java.lang.String str2 = parkingLot1.toString();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot1.getSpaces();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EpicZeus525" + "'", str2, "EpicZeus525");
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("RareZeus959");
        parkingLot3.setLocation("UncommonHades257");
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot3);
        parkingSystem.model.parking.ParkingLot parkingLot12 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList13 = parkingLot12.getSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList14 = parkingLot12.getOpenSpaces();
        parkingLot3.setSpaces(parkingSpaceList14);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList16 = parkingLot3.getOpenSpaces();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        org.junit.Assert.assertNotNull(parkingSpaceList16);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer17 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser21 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double22 = facultyUser21.getRate();
        java.lang.String str23 = facultyUser21.getName();
        validationRequestBuffer17.notifyManager((parkingSystem.model.AbstractUser) facultyUser21);
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser21);
        parkingSystem.model.util.ParkingSystem parkingSystem26 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser29 = parkingSystem26.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser32 = parkingSystem26.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList33 = parkingSystem26.getLots();
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer34 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers35 = new parkingSystem.database.MaintainUsers();
        maintainUsers35.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser40 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray41 = new parkingSystem.model.AbstractUser[] { nonFacultyUser40 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList42 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList42, abstractUserArray41);
        java.lang.String str44 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList42);
        boolean boolean46 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList42, "EpicAres571");
        boolean boolean48 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList42, "CommonAtlas127");
        maintainUsers35.users = abstractUserList42;
        validationRequestBuffer34.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList42);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList51 = validationRequestBuffer34.getRequests();
        parkingSystem26.setUsers(abstractUserList51);
        validationRequestBuffer0.setRequests(abstractUserList51);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "62) test455(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UncommonKratos932" + "'", str10, "UncommonKratos932");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(parkingSystem26);
        org.junit.Assert.assertNull(abstractUser29);
        org.junit.Assert.assertNull(abstractUser32);
        org.junit.Assert.assertNotNull(parkingLotList33);
        org.junit.Assert.assertNotNull(validationRequestBuffer34);
        org.junit.Assert.assertNotNull(abstractUserArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
// flaky "21) test455(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UncommonKratos492" + "'", str44, "UncommonKratos492");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(abstractUserList51);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem12 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser15 = parkingSystem12.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser19 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem12.registerUser((parkingSystem.model.AbstractUser) facultyUser19);
        parkingSystem.model.AbstractUser abstractUser23 = parkingSystem12.loginViaName("UncommonAtlas387", "CommonAres908");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList24 = parkingSystem12.getLots();
        parkingSystem0.setLots(parkingLotList24);
        parkingSystem.model.AbstractUser abstractUser28 = parkingSystem0.login("LegendaryAres929", "CommonHades337");
        parkingSystem.model.AbstractUser abstractUser31 = parkingSystem0.login("CommonKratos811", "LegendaryAres929");
        parkingSystem.model.AbstractUser abstractUser34 = parkingSystem0.loginViaName("UncommonAtlas532", "CommonAtlas674");
        parkingSystem.model.parking.ParkingLot parkingLot36 = new parkingSystem.model.parking.ParkingLot("EpicZeus525");
        parkingSystem0.addLot(parkingLot36);
        parkingSystem.model.VisitorUser visitorUser41 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser41.setEmail("");
        java.lang.String str44 = visitorUser41.getEmail();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) visitorUser41);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
        org.junit.Assert.assertNull(abstractUser28);
        org.junit.Assert.assertNull(abstractUser31);
        org.junit.Assert.assertNull(abstractUser34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.lang.String str3 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList2);
        java.lang.String str4 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList2);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
// flaky "63) test457(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UncommonAres364" + "'", str3, "UncommonAres364");
// flaky "22) test457(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RareAtlas472" + "'", str4, "RareAtlas472");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        parkingSystem.model.ManagerUser managerUser6 = superManager0.generateManagerAccount("EpicHades415", "LegendaryHades507", "UncommonZeus748");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
// flaky "64) test458(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertNotNull(managerUser6);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers1 = new parkingSystem.database.MaintainUsers();
        maintainUsers1.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser6 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray7 = new parkingSystem.model.AbstractUser[] { nonFacultyUser6 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList8 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList8, abstractUserArray7);
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "EpicAres571");
        boolean boolean14 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8, "CommonAtlas127");
        maintainUsers1.users = abstractUserList8;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList8);
        parkingSystem.model.ManagerUser managerUser20 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser20.setEmail("EpicAres571");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) managerUser20);
        parkingSystem.model.SuperManager superManager24 = parkingSystem.model.SuperManager.getInstance();
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) superManager24);
        superManager24.setEmail("UncommonAtlas387");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "65) test459(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareHades279" + "'", str10, "RareHades279");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(superManager24);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        maintainUsers0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList6 = maintainUsers0.users;
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertNotNull(abstractUserList6);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        parkingSystem.model.util.ParkingSystem parkingSystem2 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot4 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str5 = parkingLot4.toString();
        parkingSystem2.addLot(parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot4.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot4.getOpenSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 0, parkingLot4);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList11 = parkingLot4.getSpaces();
        org.junit.Assert.assertNotNull(parkingSystem2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("UncommonKratos521", "UncommonAtlas526", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.VisitorUser visitorUser7 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser7.setEmail("");
        visitorUser7.setName("");
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) visitorUser7);
        java.lang.String str13 = visitorUser7.getRole();
        double double14 = visitorUser7.getRate();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Visitor" + "'", str13, "Visitor");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList4 = parkingLot3.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace5 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot3);
        parkingLot3.setLocation("CommonZeus931");
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace((int) (short) 100, parkingLot3);
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryZeus350", "EpicAres254");
        parkingSystem.model.parking.ParkingLot parkingLot5 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace6 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot5);
        parkingSpace6.disable();
        boolean boolean8 = parkingSpace6.isOccupied();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace6.getBookings();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        parkingSystem.model.parking.Booking booking13 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace6, localDateTime10, localDateTime11, "UncommonKratos611");
        java.time.LocalDateTime localDateTime14 = null;
        booking13.extendTime(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookingList9);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicAres254", "CommonAtlas127", "");
        studentUser3.setName("RareAres306");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        boolean boolean1 = superManager0.isValid();
        // The following exception was thrown during execution in test generation
        try {
            double double2 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.clearPastBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        maintainUsers0.updateUser("Sn6-", "", "CommonAres908", "Super Manager: EpicAres254 ()");
        maintainUsers0.updateUser("CommonKratos119", "LegendaryAres596", "CommonZeus931", "UncommonKratos282");
        boolean boolean35 = maintainUsers0.validateUser("", "Super Manager: EpicAres254 ()");
        maintainUsers0.load();
        maintainUsers0.update();
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "66) test469(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LegendaryHades592" + "'", str9, "LegendaryHades592");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory1 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser5 = studentUserFactory1.createUser("LegendaryZeus350", "RareAtlas121", "CommonAres908");
        validationRequestBuffer0.removeRequest(abstractUser5);
        parkingSystem.model.StudentUser studentUser10 = new parkingSystem.model.StudentUser("Lot 0", "RareAtlas525", "CommonHades705");
        java.lang.String str11 = studentUser10.getPassword();
        java.lang.String str12 = studentUser10.getPassword();
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) studentUser10);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUser5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CommonHades705" + "'", str11, "CommonHades705");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CommonHades705" + "'", str12, "CommonHades705");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("EpicAres254 (EpicAres254) - Role: Non-Faculty");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("RareKratos824");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList4 = parkingLot2.getOpenSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace5 = new parkingSystem.model.parking.ParkingSpace((int) (byte) -1, parkingLot2);
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory17 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser21 = nonFacultyUserFactory17.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        maintainUsers0.addUser(abstractUser21);
        parkingSystem.model.NonFacultyUser nonFacultyUser26 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray27 = new parkingSystem.model.AbstractUser[] { nonFacultyUser26 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList28 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList28, abstractUserArray27);
        java.lang.String str30 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "EpicAres571");
        maintainUsers0.users = abstractUserList28;
        maintainUsers0.update();
        parkingSystem.model.AbstractUser abstractUser36 = maintainUsers0.getUserByEmail("UncommonHades555");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "67) test473(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LegendaryHades732" + "'", str9, "LegendaryHades732");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "23) test473(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CommonHades965" + "'", str30, "CommonHades965");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(abstractUser36);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.database.MaintainUsers maintainUsers2 = new parkingSystem.database.MaintainUsers();
        parkingSystem.model.AbstractUser abstractUser4 = maintainUsers2.getUserByEmail("hi!");
        boolean boolean7 = maintainUsers2.validateUser("CommonZeus931", "LegendaryAtlas691");
        parkingSystem.model.NonFacultyUser nonFacultyUser11 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray12 = new parkingSystem.model.AbstractUser[] { nonFacultyUser11 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList13 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList13, abstractUserArray12);
        java.lang.String str15 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13);
        boolean boolean17 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13, "EpicAres571");
        boolean boolean19 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13, "CommonAtlas127");
        maintainUsers2.users = abstractUserList13;
        maintainUsers0.users = abstractUserList13;
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList22 = maintainUsers0.users;
        org.junit.Assert.assertNull(abstractUser4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(abstractUserArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "68) test474(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RareAtlas214" + "'", str15, "RareAtlas214");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(abstractUserList22);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setEmail("Super Manager: EpicAres254 ()");
        double double8 = visitorUser3.getRate();
        visitorUser3.setEmail("EpicAres734");
        visitorUser3.removeValidation();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UncommonAtlas387" + "'", str2, "UncommonAtlas387");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str3, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str4, "Super Manager: RareAtlas121 ()");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        superManager0.setValid(false);
        superManager0.setName("RareZeus439");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareAtlas121 ()" + "'", str1, "Super Manager: RareAtlas121 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UncommonAtlas387" + "'", str2, "UncommonAtlas387");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        booking12.updateTime(localDateTime13, localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        booking12.updateTime(localDateTime16, localDateTime17);
        booking12.processDeposit();
        booking12.checkedIn();
        parkingSystem.model.AbstractUser abstractUser21 = booking12.getUser();
        double double22 = abstractUser21.getRate();
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        parkingSystem.model.ManagerUser managerUser8 = superManager0.generateManagerAccount("EpicZeus525", "CommonAtlas875", "RareHades843");
        // The following exception was thrown during execution in test generation
        try {
            double double9 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str1, "Super Manager: RareZeus439 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UncommonAtlas387" + "'", str2, "UncommonAtlas387");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str3, "Super Manager: RareZeus439 ()");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str4, "Super Manager: RareZeus439 ()");
        org.junit.Assert.assertNotNull(managerUser8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("CommonHades705", "EpicKratos321", "CommonAtlas875");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("RareHades843", "CommonAtlas127", "UncommonHades308");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = managerUser3.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        booking23.checkedOut();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        booking23.updateTime(localDateTime32, localDateTime33);
        parkingSystem.model.parking.ParkingSpace parkingSpace35 = booking23.getSpace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(parkingSpace35);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        parkingSystem.model.VisitorUser visitorUser34 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser34.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot38 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace39 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot38);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        parkingSystem.model.parking.Booking booking43 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser34, parkingSpace39, localDateTime40, localDateTime41, "EpicAres254");
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        booking43.updateTime(localDateTime44, localDateTime45);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        booking43.updateTime(localDateTime47, localDateTime48);
        parkingSpace2.removeBooking(booking43);
        java.time.LocalDateTime localDateTime51 = null;
        booking43.extendTime(localDateTime51);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus206", "UncommonZeus401", "LegendaryAtlas691");
        java.lang.String str4 = visitorUser3.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Visitor" + "'", str4, "Visitor");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList1 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingLotList1);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        java.lang.Class<?> wildcardClass5 = maintainUsers0.getClass();
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser5 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray6 = new parkingSystem.model.AbstractUser[] { nonFacultyUser5 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList7 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList7, abstractUserArray6);
        java.lang.String str9 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7);
        boolean boolean11 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "EpicAres571");
        boolean boolean13 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList7, "CommonAtlas127");
        maintainUsers0.users = abstractUserList7;
        parkingSystem.model.AbstractUser abstractUser16 = maintainUsers0.getUserByEmail("hi!");
        parkingSystem.model.AbstractUser abstractUser18 = maintainUsers0.getUserByEmail("Sn6-");
        boolean boolean21 = maintainUsers0.validateUser("", "RareZeus439");
        parkingSystem.model.AbstractUser abstractUser23 = maintainUsers0.getUserByEmail("RareAtlas214");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "69) test488(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LegendaryAres307" + "'", str9, "LegendaryAres307");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(abstractUser23);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.NonFacultyUser nonFacultyUser15 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        parkingSystem.model.parking.ParkingLot parkingLot17 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace18 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot17);
        parkingSpace18.disable();
        parkingSpace18.setOccupied(false);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = parkingSpace18.isAvailable(localDateTime22, localDateTime23);
        boolean boolean25 = parkingSpace18.isOccupied();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        parkingSystem.model.parking.Booking booking29 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) nonFacultyUser15, parkingSpace18, localDateTime26, localDateTime27, "UncommonZeus401");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser15);
        parkingSystem.model.FacultyUser facultyUser34 = new parkingSystem.model.FacultyUser("", "", "");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) facultyUser34);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList36 = parkingSystem0.getUsers();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(abstractUserList36);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        parkingSystem.model.util.ParkingSystem parkingSystem14 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot16 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str17 = parkingLot16.toString();
        parkingSystem14.addLot(parkingLot16);
        parkingLot16.setLocation("UncommonKratos611");
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = new parkingSystem.model.parking.ParkingSpace(1, parkingLot16);
        parkingSystem0.addLot(parkingLot16);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(parkingSystem14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LegendaryZeus350" + "'", str17, "LegendaryZeus350");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("CommonKratos108", "EpicAres254", "UncommonAtlas387");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("UncommonKratos478", "RareZeus439", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("", "UncommonZeus401", "");
        boolean boolean17 = abstractUser16.isValid();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = parkingSpace2.isAvailable(localDateTime6, localDateTime7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = parkingSpace2.getNextAvailableTime(localDateTime9);
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        booking23.updateTime(localDateTime24, localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        booking23.updateTime(localDateTime27, localDateTime28);
        parkingSpace2.removeBooking(booking23);
        booking23.checkedOut();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        booking23.updateTime(localDateTime32, localDateTime33);
        java.time.LocalDateTime localDateTime35 = booking23.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime35);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        parkingSystem.model.AbstractUser abstractUser7 = parkingSystem0.loginViaName("EpicZeus525", "RareAres766");
        parkingSystem.model.AbstractUser abstractUser10 = parkingSystem0.login("LegendaryZeus777", "RareHades843");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertNull(abstractUser7);
        org.junit.Assert.assertNull(abstractUser10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        java.util.List<parkingSystem.model.parking.Booking> bookingList6 = parkingSpace2.getBookings();
        parkingSpace2.setOccupied(true);
        parkingSystem.model.VisitorUser visitorUser12 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser12.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot16 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace17 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        parkingSystem.model.parking.Booking booking21 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser12, parkingSpace17, localDateTime18, localDateTime19, "EpicAres254");
        java.lang.String str22 = booking21.getLicensePlate();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        booking21.updateTime(localDateTime23, localDateTime24);
        java.time.LocalDateTime localDateTime26 = null;
        booking21.extendTime(localDateTime26);
        java.time.LocalDateTime localDateTime28 = booking21.getStartTime();
        booking21.setLicensePlate("CommonKratos832");
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = booking21.getSpace();
        java.time.LocalDateTime localDateTime32 = booking21.getEndTime();
        parkingSpace2.removeBooking(booking21);
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EpicAres254" + "'", str22, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertNull(localDateTime32);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("UncommonAres364");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.clearPastBookings();
        boolean boolean4 = parkingSpace2.isOccupied();
        parkingSpace2.enable();
        parkingSystem.model.parking.ParkingLot parkingLot6 = parkingSpace2.getLot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(parkingLot6);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("RareKratos824");
        java.lang.String str2 = parkingLot1.getLocation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareKratos824" + "'", str2, "RareKratos824");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        java.lang.String str13 = booking12.getLicensePlate();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        booking12.updateTime(localDateTime14, localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        booking12.extendTime(localDateTime17);
        java.time.LocalDateTime localDateTime19 = booking12.getStartTime();
        booking12.checkedOut();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EpicAres254" + "'", str13, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList14 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser17 = parkingSystem0.loginViaName("UncommonZeus401", "CommonHades705");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(parkingLotList14);
        org.junit.Assert.assertNull(abstractUser17);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("hi! (EpicAres254) - Role: Faculty", "LegendaryAtlas185", "LegendaryAtlas691");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("CommonAtlas303", "EpicZeus525", "CommonKratos119");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }
}
