import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        boolean boolean1 = parkingSystem.model.util.EmailVerifier.isValidEmail("RareZeus486");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = booking12.getSpace();
        booking12.checkedOut();
        booking12.processDeposit();
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace39 = booking31.getSpace();
        parkingSystem.model.parking.ParkingSpace parkingSpace40 = booking31.getSpace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertNotNull(parkingSpace40);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("", "EpicAres571", "");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("CommonAtlas127", "RareZeus486", "LegendaryKratos893");
        parkingSystem.model.AbstractUser abstractUser12 = facultyUserFactory0.createUser("UncommonHades332", "UncommonAtlas990", "EpicZeus556");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        parkingSpace16.enable();
        parkingSpace16.enable();
        java.lang.String str19 = parkingSpace16.toString();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lot 0" + "'", str19, "Lot 0");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str4 = visitorUser3.getPassword();
        java.lang.String str5 = visitorUser3.getRole();
        java.lang.String str6 = visitorUser3.getPassword();
        visitorUser3.setEmail("RareAtlas563");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Visitor" + "'", str5, "Visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("CommonAtlas127", "CommonHades337", "EpicZeus370");
        managerUser3.setPassword("CommonAres479");
        java.lang.String str6 = managerUser3.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CommonAtlas127" + "'", str6, "CommonAtlas127");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        maintainUsers0.update();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        booking31.setCheckedInStatus(true);
        java.time.LocalDateTime localDateTime40 = null;
        booking31.extendTime(localDateTime40);
        java.time.LocalDateTime localDateTime42 = booking31.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime42);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = null; // flaky "1) test510(RegressionTest1)": superManager0.getName();
        java.lang.String str2 = null; // flaky "1) test510(RegressionTest1)": superManager0.getPassword();
        parkingSystem.model.ManagerUser managerUser6 = null; // flaky "1) test510(RegressionTest1)": superManager0.generateManagerAccount("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryAtlas691", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = 0.0; // flaky "1) test510(RegressionTest1)": managerUser6.getRate();
// flaky "1) test510(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "1) test510(RegressionTest1)":         org.junit.Assert.assertNotNull(superManager0);
// flaky "1) test510(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RareZeus439" + "'", str1, "RareZeus439");
// flaky "1) test510(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "1) test510(RegressionTest1)":         org.junit.Assert.assertNotNull(managerUser6);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        java.lang.String str6 = visitorUser3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EpicAres571" + "'", str6, "EpicAres571");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        java.time.LocalDateTime localDateTime26 = booking21.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking21.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        boolean boolean6 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList4, "Super Manager: RareAtlas923 ()");
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace32 = booking23.getSpace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(parkingSpace32);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        java.lang.String str39 = booking30.getLicensePlate();
        parkingSystem.model.AbstractUser abstractUser40 = booking30.getUser();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CommonAtlas875" + "'", str39, "CommonAtlas875");
        org.junit.Assert.assertNotNull(abstractUser40);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        parkingSystem.model.AbstractUser abstractUser18 = parkingSystem12.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList19 = parkingSystem12.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList20 = parkingSystem12.getUsers();
        parkingSystem.model.AbstractUser abstractUser23 = parkingSystem12.login("Super Manager: RareAtlas923 ()", "RareKratos764");
        parkingSystem.model.AbstractUser abstractUser26 = parkingSystem12.login("CommonAtlas674", "EpicHades661");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList27 = parkingSystem12.getLots();
        parkingSystem0.setLots(parkingLotList27);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(parkingLotList19);
        org.junit.Assert.assertNotNull(abstractUserList20);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNull(abstractUser26);
        org.junit.Assert.assertNotNull(parkingLotList27);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser4 = parkingSystem1.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser8 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser8.setPassword("EpicAres571");
        parkingSystem1.removeUser((parkingSystem.model.AbstractUser) studentUser8);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList12 = parkingSystem1.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem13 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot15 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str16 = parkingLot15.toString();
        parkingSystem13.addLot(parkingLot15);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList18 = parkingLot15.getSpaces();
        parkingLot15.setLocation("LegendaryHades662");
        parkingSystem1.addLot(parkingLot15);
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = new parkingSystem.model.parking.ParkingSpace((int) (short) 100, parkingLot15);
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertNull(abstractUser4);
        org.junit.Assert.assertNotNull(parkingLotList12);
        org.junit.Assert.assertNotNull(parkingSystem13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LegendaryZeus350" + "'", str16, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("UncommonKratos492");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser4 = parkingSystem1.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot7 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str8 = parkingLot7.toString();
        parkingSystem5.addLot(parkingLot7);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList10 = parkingLot7.getSpaces();
        parkingSystem1.addLot(parkingLot7);
        java.lang.String str12 = parkingLot7.toString();
        parkingSystem.model.parking.ParkingSpace parkingSpace13 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 1, parkingLot7);
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertNull(abstractUser4);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LegendaryZeus350" + "'", str8, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LegendaryZeus350" + "'", str12, "LegendaryZeus350");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("EpicHades415", "CommonAtlas674", "CommonZeus931");
        boolean boolean9 = abstractUser8.isValid();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        parkingSystem.model.parking.ParkingLot parkingLot6 = parkingSpace2.getLot();
        org.junit.Assert.assertNull(parkingLot6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
// flaky "2) test523(RegressionTest1)":         parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        parkingSystem.model.util.ParkingSystem parkingSystem13 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser16 = parkingSystem13.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem13.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser23 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double24 = nonFacultyUser23.getRate();
        double double25 = nonFacultyUser23.getRate();
        parkingSystem13.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser23);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList27 = parkingSystem13.getLots();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList28 = parkingSystem13.getLots();
        parkingSystem0.setLots(parkingLotList28);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList30 = parkingSystem0.getUsers();
        java.lang.Class<?> wildcardClass31 = parkingSystem0.getClass();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
// flaky "2) test523(RegressionTest1)":         org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(parkingSystem13);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15.0d + "'", double25 == 15.0d);
        org.junit.Assert.assertNotNull(parkingLotList27);
        org.junit.Assert.assertNotNull(parkingLotList28);
        org.junit.Assert.assertNotNull(abstractUserList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "3) test524(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.AbstractUser abstractUser9 = parkingSystem0.login("EpicAres346", "EpicAres571");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList10 = parkingSystem0.getLots();
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray15 = new parkingSystem.model.AbstractUser[] { nonFacultyUser14 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList16 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList16, abstractUserArray15);
        java.lang.String str18 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList16);
        boolean boolean20 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList16, "EpicAres571");
        java.lang.String str21 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList16);
        parkingSystem0.setUsers((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList16);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNull(abstractUser9);
        org.junit.Assert.assertNotNull(parkingLotList10);
        org.junit.Assert.assertNotNull(abstractUserArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "3) test524(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CommonAres966" + "'", str18, "CommonAres966");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "2) test524(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LegendaryAres232" + "'", str21, "LegendaryAres232");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = null; // flaky "4) test525(RegressionTest1)": superManager0.getName();
        java.lang.String str2 = null; // flaky "4) test525(RegressionTest1)": superManager0.getPassword();
        java.lang.String str3 = null; // flaky "3) test525(RegressionTest1)": superManager0.toString();
// flaky "2) test525(RegressionTest1)":         org.junit.Assert.assertNotNull(superManager0);
// flaky "2) test525(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RareZeus439" + "'", str1, "RareZeus439");
// flaky "2) test525(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "2) test525(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str3, "Super Manager: RareZeus439 ()");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList16 = parkingLot3.getSpaces();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        org.junit.Assert.assertNotNull(parkingSpaceList16);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        visitorUser3.setPassword("CommonKratos811");
        boolean boolean6 = visitorUser3.isValid();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        parkingSystem.model.util.ParkingSystem parkingSystem2 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot4 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str5 = parkingLot4.toString();
        parkingSystem2.addLot(parkingLot4);
        parkingLot4.setLocation("RareZeus959");
        parkingLot4.setLocation("UncommonHades257");
        parkingSystem.model.parking.ParkingSpace parkingSpace11 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot4);
        parkingSystem.model.parking.ParkingSpace parkingSpace12 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 100, parkingLot4);
        org.junit.Assert.assertNotNull(parkingSystem2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("RareKratos764", "EpicZeus475", "LegendaryAres929");
        facultyUser3.setEmail("CommonKratos832");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        parkingSystem.model.NonFacultyUser nonFacultyUser29 = new parkingSystem.model.NonFacultyUser("UncommonKratos611", "EpicZeus370", "hi!");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) nonFacultyUser29);
        double double31 = nonFacultyUser29.getRate();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "5) test530(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EpicAres571" + "'", str10, "EpicAres571");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "5) test530(RegressionTest1)":         org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 15.0d + "'", double31 == 15.0d);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        java.time.LocalDateTime localDateTime20 = null;
        booking12.extendTime(localDateTime20);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        java.lang.String str35 = booking30.getLicensePlate();
        java.time.LocalDateTime localDateTime36 = booking30.getStartTime();
        parkingSystem.model.parking.ParkingSpace parkingSpace37 = booking30.getSpace();
        parkingSpace37.clearPastBookings();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNotNull(parkingSpace37);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("UncommonAtlas532");
        java.lang.Class<?> wildcardClass2 = parkingLot1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray4 = new parkingSystem.model.AbstractUser[] { nonFacultyUser3 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList5, abstractUserArray4);
        java.lang.String str7 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "EpicAres571");
        java.lang.String str10 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5);
        boolean boolean12 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList5, "CommonAtlas303");
        org.junit.Assert.assertNotNull(abstractUserArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "6) test534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EpicAres935" + "'", str7, "EpicAres935");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "6) test534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareHades468" + "'", str10, "RareHades468");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        parkingSystem.model.VisitorUser visitorUser5 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser5.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot9 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        parkingSystem.model.parking.Booking booking14 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser5, parkingSpace10, localDateTime11, localDateTime12, "EpicAres254");
        booking14.setLicensePlate("UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser17 = booking14.getUser();
        maintainUser0.addUser(abstractUser17);
        java.lang.Class<?> wildcardClass19 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(abstractUser17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        java.time.LocalDateTime localDateTime40 = null;
        booking25.extendTime(localDateTime40);
        boolean boolean42 = booking25.isCheckedOut();
        java.time.LocalDateTime localDateTime43 = booking25.getStartTime();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(localDateTime43);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "7) test537(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager(" () - Role: Visitor", "EpicZeus850", "");
// flaky "7) test537(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser26 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser26.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot30 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot30);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        parkingSystem.model.parking.Booking booking35 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser26, parkingSpace31, localDateTime32, localDateTime33, "EpicAres254");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        booking35.updateTime(localDateTime36, localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking35.updateTime(localDateTime39, localDateTime40);
        java.time.LocalDateTime localDateTime42 = booking35.getEndTime();
        booking35.checkedOut();
        boolean boolean44 = booking35.isCheckedOut();
        java.time.LocalDateTime localDateTime45 = null;
        booking35.extendTime(localDateTime45);
        booking35.checkedIn();
        parkingSpace22.addBooking(booking35);
        parkingSystem.model.AbstractUser abstractUser49 = booking35.getUser();
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(abstractUser49);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        int int13 = parkingSpace8.getId();
        int int14 = parkingSpace8.getId();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer3 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers4 = new parkingSystem.database.MaintainUsers();
        maintainUsers4.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser9 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray10 = new parkingSystem.model.AbstractUser[] { nonFacultyUser9 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList11 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList11, abstractUserArray10);
        java.lang.String str13 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList11);
        boolean boolean15 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList11, "EpicAres571");
        boolean boolean17 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList11, "CommonAtlas127");
        maintainUsers4.users = abstractUserList11;
        validationRequestBuffer3.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList11);
        parkingSystem.model.ManagerUser managerUser23 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser23.setEmail("EpicAres571");
        validationRequestBuffer3.notifyManager((parkingSystem.model.AbstractUser) managerUser23);
        parkingSystem.model.SuperManager superManager27 = parkingSystem.model.SuperManager.getInstance();
        validationRequestBuffer3.removeRequest((parkingSystem.model.AbstractUser) superManager27);
        parkingSystem.model.NonFacultyUser nonFacultyUser32 = new parkingSystem.model.NonFacultyUser("UncommonKratos611", "EpicZeus370", "hi!");
        validationRequestBuffer3.removeRequest((parkingSystem.model.AbstractUser) nonFacultyUser32);
        maintainUser0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser32);
        org.junit.Assert.assertNotNull(validationRequestBuffer3);
        org.junit.Assert.assertNotNull(abstractUserArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "8) test540(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CommonHades928" + "'", str13, "CommonHades928");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(superManager27);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        parkingSystem.model.SuperManager superManager26 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str27 = null; // flaky "9) test541(RegressionTest1)": superManager26.getName();
        java.lang.String str28 = superManager26.getPassword();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) superManager26);
        java.lang.String str30 = superManager26.getPassword();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "8) test541(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UncommonAtlas828" + "'", str10, "UncommonAtlas828");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(superManager26);
// flaky "4) test541(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RareZeus439" + "'", str27, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = null; // flaky "10) test542(RegressionTest1)": superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        superManager0.setEmail("RareZeus439");
        java.lang.String str7 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
// flaky "9) test542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str1, "Super Manager: RareZeus439 ()");
// flaky "5) test542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UncommonAtlas387" + "'", str2, "UncommonAtlas387");
// flaky "3) test542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str3, "Super Manager: RareZeus439 ()");
// flaky "3) test542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str4, "Super Manager: RareZeus439 ()");
// flaky "3) test542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str7, "Super Manager: RareZeus439 ()");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("EpicAtlas492", "UncommonAres771", "CommonHades928");
// flaky "11) test543(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.lang.String str3 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList2);
        boolean boolean5 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken(abstractUserList2, " () - Role: Faculty");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
// flaky "12) test544(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RareKratos196" + "'", str3, "RareKratos196");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = parkingSpace16.isAvailable(localDateTime19, localDateTime20);
        boolean boolean22 = parkingSpace16.isOccupied();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        int int6 = parkingSpace2.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        parkingSystem.database.MaintainUser maintainUser46 = new parkingSystem.database.MaintainUser();
        maintainUser46.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList48 = maintainUser46.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList49 = maintainUser46.getUsers();
        maintainUser46.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList51 = maintainUser46.getUsers();
        parkingSystem.model.VisitorUser visitorUser55 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser55.setEmail("");
        double double58 = visitorUser55.getRate();
        maintainUser46.addUser((parkingSystem.model.AbstractUser) visitorUser55);
        parkingSystem.model.StudentUser studentUser63 = new parkingSystem.model.StudentUser("Lot 0", "RareAtlas525", "CommonHades705");
        java.lang.String str64 = studentUser63.getPassword();
        maintainUser46.addUser((parkingSystem.model.AbstractUser) studentUser63);
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) studentUser63);
        parkingSystem.database.MaintainUsers maintainUsers67 = new parkingSystem.database.MaintainUsers();
        maintainUsers67.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser72 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray73 = new parkingSystem.model.AbstractUser[] { nonFacultyUser72 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList74 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList74, abstractUserArray73);
        java.lang.String str76 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList74);
        boolean boolean78 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList74, "EpicAres571");
        boolean boolean80 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList74, "CommonAtlas127");
        maintainUsers67.users = abstractUserList74;
        parkingSystem.model.AbstractUser abstractUser83 = maintainUsers67.getUserByEmail("hi!");
        parkingSystem.model.FacultyUser facultyUser87 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double88 = facultyUser87.getRate();
        java.lang.String str89 = facultyUser87.getName();
        facultyUser87.removeValidation();
        maintainUsers67.addUser((parkingSystem.model.AbstractUser) facultyUser87);
        boolean boolean92 = facultyUser87.isValid();
        java.lang.String str93 = facultyUser87.getRole();
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) facultyUser87);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "13) test547(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareZeus928" + "'", str10, "RareZeus928");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray26);
        org.junit.Assert.assertArrayEquals(abstractUserArray26, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "10) test547(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UncommonZeus285" + "'", str29, "UncommonZeus285");
        org.junit.Assert.assertNotNull(abstractUserList45);
        org.junit.Assert.assertNotNull(abstractUserList48);
        org.junit.Assert.assertNotNull(abstractUserList49);
        org.junit.Assert.assertNotNull(abstractUserList51);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 15.0d + "'", double58 == 15.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "CommonHades705" + "'", str64, "CommonHades705");
        org.junit.Assert.assertNotNull(abstractUserArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
// flaky "6) test547(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "UncommonZeus490" + "'", str76, "UncommonZeus490");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(abstractUser83);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 15.0d + "'", double88 == 15.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Faculty" + "'", str93, "Faculty");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "14) test548(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.loginViaName("EpicAres346", "Manager:  (Sn6-)");
        parkingSystem.model.util.ParkingSystem parkingSystem12 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser15 = parkingSystem12.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser18 = parkingSystem12.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList19 = parkingSystem12.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList20 = parkingSystem12.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList21 = parkingSystem12.getUsers();
        java.lang.String str22 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList21);
        parkingSystem0.setUsers(abstractUserList21);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(abstractUserList8);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(parkingLotList19);
        org.junit.Assert.assertNotNull(abstractUserList20);
        org.junit.Assert.assertNotNull(abstractUserList21);
// flaky "11) test548(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LegendaryZeus494" + "'", str22, "LegendaryZeus494");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "15) test549(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
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
        parkingSystem.model.util.ParkingSystem parkingSystem40 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser43 = parkingSystem40.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser47 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem40.registerUser((parkingSystem.model.AbstractUser) facultyUser47);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList49 = parkingSystem40.getLots();
        parkingSystem0.setLots(parkingLotList49);
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
        org.junit.Assert.assertNotNull(parkingSystem40);
        org.junit.Assert.assertNull(abstractUser43);
        org.junit.Assert.assertNotNull(parkingLotList49);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("", "EpicKratos229", "Manager:  (Sn6-)");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("LegendaryZeus350", "RareAtlas121", "CommonAres908");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("CommonAres691", "hi!", "CommonAres499");
        parkingSystem.model.AbstractUser abstractUser12 = studentUserFactory0.createUser("LegendaryAres100", "RareKratos196", "EpicAres495");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        boolean boolean35 = booking30.isCheckedOut();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "16) test553(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem12 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot14 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str15 = parkingLot14.toString();
        parkingSystem12.addLot(parkingLot14);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList17 = parkingLot14.getSpaces();
        parkingLot14.setLocation("LegendaryHades662");
        parkingSystem0.addLot(parkingLot14);
        parkingSystem.model.AbstractUser abstractUser23 = parkingSystem0.login("EpicAres527", "Manager:  (Sn6-)");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LegendaryZeus350" + "'", str15, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        org.junit.Assert.assertNull(abstractUser23);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("CommonHades705", "CommonHades337", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("RareZeus959", "EpicHades661", "");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("UncommonAtlas387", "Sn6-", "CommonZeus931");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("", "UncommonKratos282", "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList36 = maintainUsers0.users;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "17) test556(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonKratos845" + "'", str9, "CommonKratos845");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(abstractUserList36);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("LegendaryHades507", "CommonAres908", "LegendaryHades409");
        boolean boolean4 = studentUser3.isValid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "18) test558(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
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
        parkingSystem.model.util.ParkingSystem parkingSystem32 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser35 = parkingSystem32.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser38 = parkingSystem32.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser42 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double43 = nonFacultyUser42.getRate();
        double double44 = nonFacultyUser42.getRate();
        parkingSystem32.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser42);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList46 = parkingSystem32.getLots();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList47 = parkingSystem32.getLots();
        parkingSystem0.setLots(parkingLotList47);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
        org.junit.Assert.assertNull(abstractUser28);
        org.junit.Assert.assertNull(abstractUser31);
        org.junit.Assert.assertNotNull(parkingSystem32);
        org.junit.Assert.assertNull(abstractUser35);
        org.junit.Assert.assertNull(abstractUser38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 15.0d + "'", double43 == 15.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 15.0d + "'", double44 == 15.0d);
        org.junit.Assert.assertNotNull(parkingLotList46);
        org.junit.Assert.assertNotNull(parkingLotList47);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("RareAtlas525", "EpicHades415", "UncommonHades308");
        boolean boolean13 = abstractUser12.isValidated();
        abstractUser12.setPassword("");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("RareAtlas502", "EpicZeus370", "CommonAtlas127");
        parkingSystem.model.AbstractUser abstractUser12 = facultyUserFactory0.createUser("LegendaryHades566", "LegendaryHades566", "RareKratos824");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        java.lang.String str27 = parkingLot1.toString();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList28 = parkingLot1.getOpenSpaces();
        java.lang.String str29 = parkingLot1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendaryZeus350" + "'", str2, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LegendaryZeus350" + "'", str27, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "LegendaryZeus350" + "'", str29, "LegendaryZeus350");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser4 = parkingSystem0.loginViaName("RareZeus936", "CommonHades765");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser4);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "19) test563(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser7 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) facultyUser7);
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.loginViaName("UncommonAtlas387", "CommonAres908");
        parkingSystem.model.FacultyUser facultyUser15 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double16 = facultyUser15.getRate();
        boolean boolean17 = facultyUser15.isValid();
        facultyUser15.removeValidation();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) facultyUser15);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "20) test564(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser10 = parkingSystem0.login("RareAtlas502", "");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNull(abstractUser10);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("RareAtlas525", "EpicHades415", "UncommonHades308");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("CommonAtlas397", "LegendaryAres113", "RareHades279");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("EpicHades825", "UncommonAres364", "UncommonKratos188");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.enable();
        boolean boolean7 = parkingSpace2.isEnabled();
        parkingSpace2.enable();
        parkingSystem.model.parking.ParkingLot parkingLot10 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace11 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot10);
        parkingSpace11.disable();
        parkingSpace11.setOccupied(false);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = parkingSpace11.isAvailable(localDateTime15, localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = parkingSpace11.getNextAvailableTime(localDateTime18);
        parkingSystem.model.VisitorUser visitorUser23 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser23.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot27 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace28 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        parkingSystem.model.parking.Booking booking32 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser23, parkingSpace28, localDateTime29, localDateTime30, "EpicAres254");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        booking32.updateTime(localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        booking32.updateTime(localDateTime36, localDateTime37);
        parkingSpace11.removeBooking(booking32);
        booking32.checkedOut();
        parkingSpace2.removeBooking(booking32);
        // The following exception was thrown during execution in test generation
        try {
            booking32.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("RareAres662", "CommonHades495", "EpicHades661");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        int int51 = parkingSpace16.getId();
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        visitorUser3.setEmail("Super Manager: EpicAres254 ()");
        double double8 = visitorUser3.getRate();
        visitorUser3.setEmail("EpicAres734");
        java.lang.String str11 = visitorUser3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EpicAres734" + "'", str11, "EpicAres734");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser3.removeValidation();
        double double5 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "21) test572(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        double double14 = nonFacultyUser10.getRate();
        double double15 = nonFacultyUser10.getRate();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
            java.lang.String str53 = booking44.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EpicAres254" + "'", str48, "EpicAres254");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setLicensePlate("UncommonZeus401");
        booking12.setCheckedInStatus(false);
        java.lang.String str17 = booking12.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UncommonZeus401" + "'", str17, "UncommonZeus401");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList3 = null;
        validationRequestBuffer0.setRequests(abstractUserList3);
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
        maintainUsers5.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList23 = maintainUsers5.users;
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer25 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers26 = new parkingSystem.database.MaintainUsers();
        maintainUsers26.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser31 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray32 = new parkingSystem.model.AbstractUser[] { nonFacultyUser31 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList33 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList33, abstractUserArray32);
        java.lang.String str35 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList33);
        boolean boolean37 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList33, "EpicAres571");
        boolean boolean39 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList33, "CommonAtlas127");
        maintainUsers26.users = abstractUserList33;
        validationRequestBuffer25.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList33);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer42 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser46 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double47 = facultyUser46.getRate();
        java.lang.String str48 = facultyUser46.getName();
        validationRequestBuffer42.notifyManager((parkingSystem.model.AbstractUser) facultyUser46);
        validationRequestBuffer25.removeRequest((parkingSystem.model.AbstractUser) facultyUser46);
        parkingSystem.model.VisitorUser visitorUser54 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser54.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot58 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace59 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot58);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        parkingSystem.model.parking.Booking booking63 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser54, parkingSpace59, localDateTime60, localDateTime61, "EpicAres254");
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        booking63.updateTime(localDateTime64, localDateTime65);
        parkingSystem.model.parking.ParkingSpace parkingSpace67 = booking63.getSpace();
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = parkingSpace67.getNextAvailableTime(localDateTime68);
        parkingSpace67.enable();
        parkingSpace67.disable();
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        parkingSystem.model.parking.Booking booking75 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) facultyUser46, parkingSpace67, localDateTime72, localDateTime73, "Sn6-");
        boolean boolean76 = facultyUser46.isValidated();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) facultyUser46);
        double double78 = facultyUser46.getRate();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "22) test575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CommonKratos254" + "'", str14, "CommonKratos254");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserList23);
        org.junit.Assert.assertNotNull(validationRequestBuffer25);
        org.junit.Assert.assertNotNull(abstractUserArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// flaky "12) test575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LegendaryAtlas970" + "'", str35, "LegendaryAtlas970");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 15.0d + "'", double47 == 15.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace67);
        org.junit.Assert.assertNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 15.0d + "'", double78 == 15.0d);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        boolean boolean24 = maintainUsers0.validateUser("RareKratos764", "EpicAres527");
        parkingSystem.model.AbstractUser abstractUser26 = maintainUsers0.getUserByEmail("EpicAtlas994");
        maintainUsers0.updateUser("Manager", "Sn6-", "LegendaryZeus837", "RareZeus928");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "23) test576(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareZeus461" + "'", str9, "RareZeus461");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(abstractUser26);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot2);
        parkingSystem.model.VisitorUser visitorUser8 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser8.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot12 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace13 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot12);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        parkingSystem.model.parking.Booking booking17 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser8, parkingSpace13, localDateTime14, localDateTime15, "EpicAres254");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        booking17.updateTime(localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        booking17.updateTime(localDateTime21, localDateTime22);
        booking17.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime26 = null;
        booking17.extendTime(localDateTime26);
        booking17.checkedIn();
        parkingSpace4.addBooking(booking17);
        booking17.checkedOut();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareKratos824", "LegendaryHades409", "EpicHades661");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("EpicZeus525", "RareAtlas502", "EpicHades661");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryAres100", "EpicKratos686");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        booking12.setLicensePlate("RareHades843");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        booking12.updateTime(localDateTime18, localDateTime19);
        java.time.LocalDateTime localDateTime21 = booking12.getEndTime();
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace22 = booking12.getSpace();
        parkingSystem.model.VisitorUser visitorUser26 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser26.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot30 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot30);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        parkingSystem.model.parking.Booking booking35 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser26, parkingSpace31, localDateTime32, localDateTime33, "EpicAres254");
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        booking35.updateTime(localDateTime36, localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking35.updateTime(localDateTime39, localDateTime40);
        java.time.LocalDateTime localDateTime42 = booking35.getEndTime();
        booking35.checkedOut();
        boolean boolean44 = booking35.isCheckedOut();
        java.time.LocalDateTime localDateTime45 = null;
        booking35.extendTime(localDateTime45);
        booking35.checkedIn();
        parkingSpace22.addBooking(booking35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = booking35.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        maintainUsers0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem6 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser9 = null; // flaky "24) test581(RegressionTest1)": parkingSystem6.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser13 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser13.setPassword("EpicAres571");
        parkingSystem6.removeUser((parkingSystem.model.AbstractUser) studentUser13);
        studentUser13.setName("UncommonAres378");
        boolean boolean19 = studentUser13.isValidated();
        double double20 = studentUser13.getRate();
        double double21 = studentUser13.getRate();
        double double22 = studentUser13.getRate();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) studentUser13);
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList24 = maintainUsers0.users;
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertNotNull(parkingSystem6);
        org.junit.Assert.assertNull(abstractUser9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertNotNull(abstractUserList24);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "25) test582(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList11 = parkingLot6.getOpenSpaces();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(parkingSpaceList11);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        java.lang.String str5 = parkingLot2.toString();
        java.lang.String str6 = parkingLot2.toString();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendaryZeus350" + "'", str5, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LegendaryZeus350" + "'", str6, "LegendaryZeus350");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        superManager0.setPassword("CommonKratos485");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "26) test584(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str1, "Super Manager: RareZeus439 ()");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
// flaky "13) test584(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str3, "Super Manager: RareZeus439 ()");
// flaky "7) test584(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareZeus439 ()" + "'", str4, "Super Manager: RareZeus439 ()");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.load();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.load();
        maintainUser0.load();
        maintainUser0.load();
        maintainUser0.load();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        java.lang.String str5 = abstractUser4.getName();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RareAtlas121" + "'", str5, "RareAtlas121");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "27) test588(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem9 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot11 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str12 = parkingLot11.toString();
        parkingSystem9.addLot(parkingLot11);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList14 = parkingLot11.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace15 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot11);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList16 = parkingLot11.getOpenSpaces();
        parkingSystem0.addLot(parkingLot11);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNotNull(parkingSystem9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LegendaryZeus350" + "'", str12, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        org.junit.Assert.assertNotNull(parkingSpaceList16);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        parkingSystem.model.parking.ParkingLot parkingLot7 = parkingSpace2.getLot();
        parkingSpace2.disable();
        parkingSpace2.enable();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertNull(parkingLot7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        double double4 = visitorUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareKratos824", "LegendaryHades409", "EpicHades661");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("EpicZeus525", "RareAtlas502", "EpicHades661");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("UncommonKratos611", "Super Manager: LegendaryAres481 ()", "CommonAres479");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("RareAtlas151", "CommonHades477", "RareAtlas923");
        abstractUser16.removeValidation();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser3.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot7 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace8 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot7);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        parkingSystem.model.parking.Booking booking12 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser3, parkingSpace8, localDateTime9, localDateTime10, "EpicAres254");
        booking12.setCheckedInStatus(true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        boolean boolean20 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList18, "Manager");
        boolean boolean22 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList18, "Manager:  (Sn6-)");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "28) test593(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonHades285" + "'", str9, "CommonHades285");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        parkingSystem.model.NonFacultyUser nonFacultyUser21 = new parkingSystem.model.NonFacultyUser("UncommonKratos282", "RareKratos824", "UncommonAtlas241");
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) nonFacultyUser21);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "29) test594(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonZeus590" + "'", str10, "CommonZeus590");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(abstractUserList17);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("RareAtlas121", "LegendaryHades409", "LegendaryAtlas957");
        java.lang.String str4 = facultyUser3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryAtlas957" + "'", str4, "LegendaryAtlas957");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("EpicHades415", "CommonAtlas674", "CommonZeus931");
        parkingSystem.model.AbstractUser abstractUser12 = facultyUserFactory0.createUser("RareAres448", "LegendaryHades903", "UncommonKratos542");
        parkingSystem.model.AbstractUser abstractUser16 = facultyUserFactory0.createUser("RareKratos196", "LegendaryZeus891", "CommonKratos108");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double4 = nonFacultyUser3.getRate();
        nonFacultyUser3.setValid(false);
        double double7 = nonFacultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        parkingSystem.model.VisitorUser visitorUser27 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser27.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot31 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace32 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot31);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        parkingSystem.model.parking.Booking booking36 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser27, parkingSpace32, localDateTime33, localDateTime34, "EpicAres254");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        booking36.updateTime(localDateTime37, localDateTime38);
        java.lang.String str40 = booking36.getLicensePlate();
        parkingSpace19.addBooking(booking36);
        booking36.setLicensePlate("CommonAres499");
        parkingSpace2.removeBooking(booking36);
        parkingSystem.model.VisitorUser visitorUser48 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser48.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot52 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace53 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot52);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        parkingSystem.model.parking.Booking booking57 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser48, parkingSpace53, localDateTime54, localDateTime55, "EpicAres254");
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        booking57.updateTime(localDateTime58, localDateTime59);
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        booking57.updateTime(localDateTime61, localDateTime62);
        java.time.LocalDateTime localDateTime64 = booking57.getEndTime();
        booking57.checkedOut();
        boolean boolean66 = booking57.isCheckedOut();
        java.time.LocalDateTime localDateTime67 = null;
        booking57.extendTime(localDateTime67);
        booking57.checkedIn();
        parkingSpace2.removeBooking(booking57);
        booking57.noShow();
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EpicAres254" + "'", str40, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "30) test599(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
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
        parkingSystem.model.util.ParkingSystem parkingSystem32 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser35 = parkingSystem32.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser38 = parkingSystem32.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList39 = parkingSystem32.getLots();
        parkingSystem0.setLots(parkingLotList39);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
        org.junit.Assert.assertNull(abstractUser28);
        org.junit.Assert.assertNull(abstractUser31);
        org.junit.Assert.assertNotNull(parkingSystem32);
        org.junit.Assert.assertNull(abstractUser35);
        org.junit.Assert.assertNull(abstractUser38);
        org.junit.Assert.assertNotNull(parkingLotList39);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
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
        booking18.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime27 = null;
        booking18.extendTime(localDateTime27);
        booking18.checkedIn();
        parkingSpace2.addBooking(booking18);
        boolean boolean31 = parkingSpace2.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        boolean boolean1 = parkingSystem.model.util.PasswordVerifier.isStrongPassword("EpicAtlas442");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
        parkingSystem.model.AbstractUser abstractUser24 = maintainUsers0.getUserByEmail("LegendaryKratos893");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "31) test602(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareHades926" + "'", str9, "RareHades926");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNull(abstractUser24);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("RareZeus959");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList8 = parkingLot3.getOpenSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace9 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot3);
        parkingSpace9.clearPastBookings();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("LegendaryZeus350", "RareKratos824", "LegendaryZeus350");
        double double4 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("EpicHades415", "LegendaryAtlas957", "CommonAres479");
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
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        booking16.updateTime(localDateTime20, localDateTime21);
        java.time.LocalDateTime localDateTime23 = booking16.getEndTime();
        booking16.checkedOut();
        java.lang.String str25 = booking16.getLicensePlate();
        parkingSystem.model.parking.ParkingSpace parkingSpace26 = booking16.getSpace();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        parkingSystem.model.parking.Booking booking30 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) managerUser3, parkingSpace26, localDateTime27, localDateTime28, "LegendaryZeus777");
        java.lang.String str31 = booking30.getLicensePlate();
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EpicAres254" + "'", str25, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LegendaryZeus777" + "'", str31, "LegendaryZeus777");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        boolean boolean32 = parkingSpace2.isEnabled();
        java.time.LocalDateTime localDateTime33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime34 = parkingSpace2.getNextAvailableTime(localDateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        boolean boolean6 = visitorUser3.isValidated();
        visitorUser3.removeValidation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
        parkingSystem.model.SuperManager superManager26 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str27 = superManager26.getName();
        java.lang.String str28 = superManager26.getPassword();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) superManager26);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList30 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList31 = validationRequestBuffer0.getRequests();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "32) test608(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UncommonZeus546" + "'", str10, "UncommonZeus546");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(superManager26);
// flaky "14) test608(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RareZeus439" + "'", str27, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CommonKratos485" + "'", str28, "CommonKratos485");
        org.junit.Assert.assertNotNull(abstractUserList30);
        org.junit.Assert.assertNotNull(abstractUserList31);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryAtlas691");
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList4 = parkingLot3.getSpaces();
        parkingLot1.setSpaces(parkingSpaceList4);
        java.lang.String str6 = parkingLot1.getLocation();
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LegendaryAtlas691" + "'", str6, "LegendaryAtlas691");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.lang.String str3 = parkingSystem.model.util.Generator.generateUniqueUsername(abstractUserList2);
        boolean boolean5 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList2, "EpicAres571 () - Role: Visitor");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
// flaky "33) test610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EpicZeus936" + "'", str3, "EpicZeus936");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList1 = maintainUsers0.users;
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonKratos108");
        parkingSystem.model.SuperManager superManager4 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str5 = superManager4.toString();
        java.lang.String str6 = superManager4.getEmail();
        superManager4.setValid(false);
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) superManager4);
        parkingSystem.database.MaintainUser maintainUser10 = new parkingSystem.database.MaintainUser();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList11 = maintainUser10.getUsers();
        maintainUsers0.users = abstractUserList11;
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList13 = maintainUsers0.users;
        boolean boolean16 = maintainUsers0.validateUser("LegendaryAres258", "EpicAres571");
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(superManager4);
// flaky "34) test611(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareZeus439 (CommonKratos485)" + "'", str5, "Super Manager: RareZeus439 (CommonKratos485)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RareZeus439" + "'", str6, "RareZeus439");
        org.junit.Assert.assertNotNull(abstractUserList11);
        org.junit.Assert.assertNotNull(abstractUserList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        parkingSystem.model.util.ParkingSystem parkingSystem1 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem1.addLot(parkingLot3);
        parkingLot3.setLocation("RareZeus959");
        parkingLot3.setLocation("UncommonHades257");
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot3);
        java.lang.String str11 = parkingLot3.getLocation();
        org.junit.Assert.assertNotNull(parkingSystem1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UncommonHades257" + "'", str11, "UncommonHades257");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        parkingSystem.model.VisitorUser visitorUser5 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser5.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot9 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace10 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot9);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        parkingSystem.model.parking.Booking booking14 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser5, parkingSpace10, localDateTime11, localDateTime12, "EpicAres254");
        booking14.setLicensePlate("UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser17 = booking14.getUser();
        maintainUser0.addUser(abstractUser17);
        maintainUser0.load();
        org.junit.Assert.assertNotNull(abstractUser17);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace28 = new parkingSystem.model.parking.ParkingSpace(100, parkingLot2);
        parkingSpace28.disable();
        int int30 = parkingSpace28.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("EpicKratos229", "CommonHades495", "RareHades369");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        maintainUsers0.update();
        maintainUsers0.load();
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "35) test616(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EpicHades824" + "'", str11, "EpicHades824");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(abstractUser18);
        org.junit.Assert.assertNotNull(abstractUser23);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        parkingSystem.model.parking.ParkingLot parkingLot1 = new parkingSystem.model.parking.ParkingLot("LegendaryHades592");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        double double4 = nonFacultyUser3.getRate();
        double double5 = nonFacultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
        java.lang.String str6 = parkingSpace2.toString();
        java.lang.String str7 = parkingSpace2.toString();
        parkingSystem.model.VisitorUser visitorUser11 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser11.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        parkingSystem.model.parking.Booking booking20 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser11, parkingSpace16, localDateTime17, localDateTime18, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser24 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser24.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot28 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot28);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        parkingSystem.model.parking.Booking booking33 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser24, parkingSpace29, localDateTime30, localDateTime31, "EpicAres254");
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        booking33.updateTime(localDateTime34, localDateTime35);
        java.lang.String str37 = booking33.getLicensePlate();
        parkingSpace16.addBooking(booking33);
        parkingSpace2.addBooking(booking33);
        java.lang.String str40 = booking33.getLicensePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lot 0" + "'", str6, "Lot 0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lot 0" + "'", str7, "Lot 0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EpicAres254" + "'", str37, "EpicAres254");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EpicAres254" + "'", str40, "EpicAres254");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("LegendaryAres113", "RareHades279", "EpicAres571");
        double double4 = studentUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = booking30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace17);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
        parkingSystem.model.SuperManager superManager26 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str27 = superManager26.getName();
        java.lang.String str28 = superManager26.getPassword();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) superManager26);
        superManager26.validateUser();
        superManager26.setName("RareZeus883");
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "36) test622(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareHades563" + "'", str10, "RareHades563");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(superManager26);
// flaky "15) test622(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RareZeus439" + "'", str27, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CommonKratos485" + "'", str28, "CommonKratos485");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "37) test623(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser10 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double11 = nonFacultyUser10.getRate();
        double double12 = nonFacultyUser10.getRate();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser10);
        parkingSystem.model.SuperManager superManager14 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str15 = superManager14.getName();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager14);
        parkingSystem.model.util.ParkingSystem parkingSystem17 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser20 = parkingSystem17.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser23 = parkingSystem17.loginViaName("", "EpicAres254");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList24 = parkingSystem17.getLots();
        parkingSystem0.setLots(parkingLotList24);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertNotNull(superManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RareZeus883" + "'", str15, "RareZeus883");
        org.junit.Assert.assertNotNull(parkingSystem17);
        org.junit.Assert.assertNull(abstractUser20);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("LegendaryKratos893", "RareAres306", "RareAtlas563");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
        parkingSpace17.setOccupied(false);
        boolean boolean37 = parkingSpace17.isEnabled();
        java.util.List<parkingSystem.model.parking.Booking> bookingList38 = parkingSpace17.getBookings();
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookingList38);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
        parkingSystem.model.StudentUser studentUser17 = new parkingSystem.model.StudentUser("Lot 0", "RareAtlas525", "CommonHades705");
        java.lang.String str18 = studentUser17.getPassword();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser17);
        parkingSystem.model.ManagerUser managerUser23 = new parkingSystem.model.ManagerUser("", "Sn6-", "Sn6-");
        managerUser23.setEmail("EpicAres571");
        maintainUser0.addUser((parkingSystem.model.AbstractUser) managerUser23);
        boolean boolean27 = managerUser23.isValidated();
        java.lang.String str28 = managerUser23.toString();
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(abstractUserList5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CommonHades705" + "'", str18, "CommonHades705");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Manager:  (Sn6-)" + "'", str28, "Manager:  (Sn6-)");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
        java.lang.String str22 = abstractUser21.getEmail();
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("", "EpicAres571", "");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("UncommonZeus957", "EpicAres346", "LegendaryZeus653");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "38) test629(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList11 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser14 = parkingSystem0.login("RareAtlas923", "EpicAres734");
        parkingSystem.model.VisitorUser visitorUser18 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str19 = visitorUser18.getPassword();
        java.lang.String str20 = visitorUser18.getEmail();
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) visitorUser18);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList22 = parkingSystem0.getUsers();
        boolean boolean24 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList22, "EpicHades772");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNull(abstractUser14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str20, "Super Manager: EpicAres254 ()");
        org.junit.Assert.assertNotNull(abstractUserList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("UncommonHades257", "UncommonZeus401", "CommonAres499");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("RareHades926", "UncommonKratos575", "CommonZeus931");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 100, parkingLot1);
        parkingSystem.model.parking.ParkingLot parkingLot4 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace5 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot4);
        parkingSpace5.disable();
        parkingSpace5.setOccupied(false);
        java.lang.String str9 = parkingSpace5.toString();
        java.lang.String str10 = parkingSpace5.toString();
        parkingSystem.model.VisitorUser visitorUser14 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser14.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot18 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace19 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot18);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        parkingSystem.model.parking.Booking booking23 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser14, parkingSpace19, localDateTime20, localDateTime21, "EpicAres254");
        parkingSystem.model.VisitorUser visitorUser27 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser27.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot31 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace32 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot31);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        parkingSystem.model.parking.Booking booking36 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser27, parkingSpace32, localDateTime33, localDateTime34, "EpicAres254");
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        booking36.updateTime(localDateTime37, localDateTime38);
        java.lang.String str40 = booking36.getLicensePlate();
        parkingSpace19.addBooking(booking36);
        parkingSpace5.addBooking(booking36);
        parkingSpace2.addBooking(booking36);
        // The following exception was thrown during execution in test generation
        try {
            booking36.noShow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.chrono.ChronoLocalDateTime.toLocalDate()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lot 0" + "'", str9, "Lot 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lot 0" + "'", str10, "Lot 0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EpicAres254" + "'", str40, "EpicAres254");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = parkingSpace2.isAvailable(localDateTime3, localDateTime4);
        parkingSpace2.setOccupied(true);
        boolean boolean8 = parkingSpace2.isOccupied();
        parkingSystem.model.parking.ParkingLot parkingLot9 = parkingSpace2.getLot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "39) test633(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        studentUser7.setName("UncommonAres378");
        boolean boolean13 = studentUser7.isValidated();
        double double14 = studentUser7.getRate();
        double double15 = studentUser7.getRate();
        double double16 = studentUser7.getRate();
        boolean boolean17 = studentUser7.isValidated();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 15.0d + "'", double14 == 15.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 15.0d + "'", double15 == 15.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        boolean boolean6 = parkingSpace2.isEnabled();
        java.util.List<parkingSystem.model.parking.Booking> bookingList7 = parkingSpace2.getBookings();
        parkingSystem.model.VisitorUser visitorUser11 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser11.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        parkingSystem.model.parking.Booking booking20 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser11, parkingSpace16, localDateTime17, localDateTime18, "EpicAres254");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        booking20.updateTime(localDateTime21, localDateTime22);
        booking20.processDeposit();
        parkingSpace2.addBooking(booking20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("LegendaryHades732", "LegendaryAres113", "UncommonKratos478");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        boolean boolean24 = maintainUsers0.validateUser("RareKratos764", "EpicAres527");
        parkingSystem.database.MaintainUsers maintainUsers25 = new parkingSystem.database.MaintainUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList26 = maintainUsers25.users;
        maintainUsers0.users = abstractUserList26;
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "40) test636(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CommonAtlas578" + "'", str9, "CommonAtlas578");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(abstractUserList26);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getName();
        java.lang.String str2 = superManager0.getPassword();
        parkingSystem.model.ManagerUser managerUser6 = superManager0.generateManagerAccount("UncommonZeus401 (Lot 0) - Role: Non-Faculty", "LegendaryAtlas691", "hi!");
        superManager0.setValid(true);
        java.lang.String str9 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RareZeus883" + "'", str1, "RareZeus883");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CommonKratos485" + "'", str2, "CommonKratos485");
        org.junit.Assert.assertNotNull(managerUser6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Super Manager: RareZeus883 (CommonKratos485)" + "'", str9, "Super Manager: RareZeus883 (CommonKratos485)");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        boolean boolean6 = visitorUser3.isValidated();
        double double7 = visitorUser3.getRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 15.0d + "'", double7 == 15.0d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "41) test639(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.FacultyUser facultyUser7 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) facultyUser7);
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.loginViaName("UncommonAtlas387", "CommonAres908");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList12 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList13 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList14 = parkingSystem0.getUsers();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNotNull(parkingLotList12);
        org.junit.Assert.assertNotNull(parkingLotList13);
        org.junit.Assert.assertNotNull(abstractUserList14);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus883 (CommonKratos485)" + "'", str1, "Super Manager: RareZeus883 (CommonKratos485)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Super Manager: RareZeus883 (CommonKratos485)" + "'", str2, "Super Manager: RareZeus883 (CommonKratos485)");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "42) test641(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
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
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer26 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers27 = new parkingSystem.database.MaintainUsers();
        maintainUsers27.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser32 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray33 = new parkingSystem.model.AbstractUser[] { nonFacultyUser32 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList34 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList34, abstractUserArray33);
        java.lang.String str36 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList34);
        boolean boolean38 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList34, "EpicAres571");
        boolean boolean40 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList34, "CommonAtlas127");
        maintainUsers27.users = abstractUserList34;
        validationRequestBuffer26.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList34);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer43 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser47 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double48 = facultyUser47.getRate();
        java.lang.String str49 = facultyUser47.getName();
        validationRequestBuffer43.notifyManager((parkingSystem.model.AbstractUser) facultyUser47);
        validationRequestBuffer26.removeRequest((parkingSystem.model.AbstractUser) facultyUser47);
        facultyUser47.setEmail("RareAres766");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) facultyUser47);
        parkingSystem.model.util.ParkingSystem parkingSystem56 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot58 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str59 = parkingLot58.toString();
        parkingSystem56.addLot(parkingLot58);
        parkingLot58.setLocation("RareZeus959");
        parkingLot58.setLocation("UncommonHades257");
        parkingSystem.model.parking.ParkingSpace parkingSpace65 = new parkingSystem.model.parking.ParkingSpace((int) 'a', parkingLot58);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList66 = parkingLot58.getOpenSpaces();
        parkingSystem0.addLot(parkingLot58);
        java.lang.String str68 = parkingLot58.getLocation();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
        org.junit.Assert.assertNotNull(validationRequestBuffer26);
        org.junit.Assert.assertNotNull(abstractUserArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "16) test641(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UncommonAtlas211" + "'", str36, "UncommonAtlas211");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer43);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 15.0d + "'", double48 == 15.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parkingSystem56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "LegendaryZeus350" + "'", str59, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UncommonHades257" + "'", str68, "UncommonHades257");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace28 = new parkingSystem.model.parking.ParkingSpace(100, parkingLot2);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList29 = parkingLot2.getSpaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parkingSpaceList29);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "43) test643(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        parkingSystem.model.util.ParkingSystem parkingSystem13 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser16 = parkingSystem13.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem13.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser23 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double24 = nonFacultyUser23.getRate();
        double double25 = nonFacultyUser23.getRate();
        parkingSystem13.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser23);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList27 = parkingSystem13.getLots();
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList28 = parkingSystem13.getLots();
        parkingSystem0.setLots(parkingLotList28);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList30 = parkingSystem0.getUsers();
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList30, "LegendaryAres929");
        boolean boolean34 = parkingSystem.model.util.DuplicateChecker.emailNotTaken(abstractUserList30, "RareAtlas525");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(parkingSystem13);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15.0d + "'", double25 == 15.0d);
        org.junit.Assert.assertNotNull(parkingLotList27);
        org.junit.Assert.assertNotNull(parkingLotList28);
        org.junit.Assert.assertNotNull(abstractUserList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "44) test644(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
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
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList26 = parkingSystem0.getUsers();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingLotList11);
        org.junit.Assert.assertNotNull(parkingSystem12);
        org.junit.Assert.assertNull(abstractUser15);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNotNull(parkingLotList24);
        org.junit.Assert.assertNotNull(abstractUserList26);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        java.time.LocalDateTime localDateTime40 = null;
        booking25.extendTime(localDateTime40);
        boolean boolean42 = booking25.isCheckedOut();
        parkingSystem.model.parking.ParkingSpace parkingSpace43 = booking25.getSpace();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpace43);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double4 = facultyUser3.getRate();
        java.lang.String str5 = facultyUser3.getName();
        double double6 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicHades610", "Super Manager: RareAtlas923 ()", "RareAtlas525");
        double double4 = studentUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("CommonKratos108", "EpicAres254", "UncommonAtlas387");
        abstractUser8.removeValidation();
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
        boolean boolean51 = facultyUser21.isValidated();
        facultyUser21.setValid(true);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "45) test649(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UncommonAtlas166" + "'", str10, "UncommonAtlas166");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 15.0d + "'", double22 == 15.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        parkingSystem.model.AbstractUser abstractUser2 = maintainUsers0.getUserByEmail("hi!");
        maintainUsers0.load();
        maintainUsers0.load();
        maintainUsers0.updateUser("CommonAres287", "UncommonZeus957", "LegendaryAres307", "RareZeus883");
        parkingSystem.model.AbstractUser abstractUser10 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintainUsers0.addUser(abstractUser10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.AbstractUser.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(abstractUser2);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory0 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = visitorUserFactory0.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser8 = visitorUserFactory0.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser12 = visitorUserFactory0.createUser("LegendaryHades662", "EpicZeus525", "LegendaryAres100");
        parkingSystem.model.AbstractUser abstractUser16 = visitorUserFactory0.createUser("CommonZeus931", "Lot 0", "EpicAres571 () - Role: Visitor");
        parkingSystem.model.AbstractUser abstractUser20 = visitorUserFactory0.createUser("EpicAtlas994", "RareAres448", "RareKratos584");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser20);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        parkingSystem.model.NonFacultyUser nonFacultyUser21 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray22 = new parkingSystem.model.AbstractUser[] { nonFacultyUser21 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList23 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList23, abstractUserArray22);
        java.lang.String str25 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23);
        boolean boolean27 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23, "EpicAres571");
        java.lang.String str28 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23);
        boolean boolean30 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23, "Manager");
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList23);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "46) test652(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CommonZeus114" + "'", str10, "CommonZeus114");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(abstractUserList17);
        org.junit.Assert.assertNotNull(abstractUserArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "17) test652(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CommonHades776" + "'", str25, "CommonHades776");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky "8) test652(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryAtlas535" + "'", str28, "LegendaryAtlas535");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        validationRequestBuffer0.notifyManager((parkingSystem.model.AbstractUser) facultyUser4);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = validationRequestBuffer0.getRequests();
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(abstractUserList8);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory0 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = facultyUserFactory0.createUser("", "EpicAres571", "");
        parkingSystem.model.AbstractUser abstractUser8 = facultyUserFactory0.createUser("RareAtlas502", "UncommonAtlas532", "UncommonAres378");
        parkingSystem.model.AbstractUser abstractUser12 = facultyUserFactory0.createUser("UncommonAtlas990", "LegendaryHades566", "EpicAres918");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser3.validateUser();
        boolean boolean5 = facultyUser3.isValidated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUsers0.users;
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer5 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers6 = new parkingSystem.database.MaintainUsers();
        maintainUsers6.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser11 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray12 = new parkingSystem.model.AbstractUser[] { nonFacultyUser11 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList13 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList13, abstractUserArray12);
        java.lang.String str15 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13);
        boolean boolean17 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13, "EpicAres571");
        boolean boolean19 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13, "CommonAtlas127");
        maintainUsers6.users = abstractUserList13;
        validationRequestBuffer5.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList13);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer22 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser26 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double27 = facultyUser26.getRate();
        java.lang.String str28 = facultyUser26.getName();
        validationRequestBuffer22.notifyManager((parkingSystem.model.AbstractUser) facultyUser26);
        validationRequestBuffer5.removeRequest((parkingSystem.model.AbstractUser) facultyUser26);
        parkingSystem.model.AbstractUser[] abstractUserArray31 = new parkingSystem.model.AbstractUser[] {};
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList32 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList32, abstractUserArray31);
        java.lang.String str34 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList32);
        validationRequestBuffer5.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList32);
        boolean boolean37 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList32, "UncommonAres378");
        maintainUsers0.users = abstractUserList32;
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertNotNull(validationRequestBuffer5);
        org.junit.Assert.assertNotNull(abstractUserArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "47) test656(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EpicKratos437" + "'", str15, "EpicKratos437");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 15.0d + "'", double27 == 15.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(abstractUserArray31);
        org.junit.Assert.assertArrayEquals(abstractUserArray31, new parkingSystem.model.AbstractUser[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "18) test656(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UncommonKratos583" + "'", str34, "UncommonKratos583");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = parkingSpace2.isAvailable(localDateTime3, localDateTime4);
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = parkingSpace2.getNextAvailableTime(localDateTime6);
        int int8 = parkingSpace2.getId();
        java.util.List<parkingSystem.model.parking.Booking> bookingList9 = parkingSpace2.getBookings();
        boolean boolean10 = parkingSpace2.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        maintainUser0.update();
        maintainUser0.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList4 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList5 = maintainUser0.getUsers();
        maintainUser0.update();
        org.junit.Assert.assertNotNull(abstractUserList4);
        org.junit.Assert.assertNotNull(abstractUserList5);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        parkingSystem.model.parking.ParkingSpace parkingSpace39 = booking31.getSpace();
        parkingSystem.model.parking.ParkingLot parkingLot41 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace42 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot41);
        parkingSpace42.disable();
        parkingSpace42.setOccupied(false);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = parkingSpace42.isAvailable(localDateTime46, localDateTime47);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = parkingSpace42.getNextAvailableTime(localDateTime49);
        parkingSystem.model.VisitorUser visitorUser54 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser54.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot58 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace59 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot58);
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        parkingSystem.model.parking.Booking booking63 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser54, parkingSpace59, localDateTime60, localDateTime61, "EpicAres254");
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        booking63.updateTime(localDateTime64, localDateTime65);
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        booking63.updateTime(localDateTime67, localDateTime68);
        parkingSpace42.removeBooking(booking63);
        parkingSystem.model.VisitorUser visitorUser74 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser74.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot78 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace79 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot78);
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        parkingSystem.model.parking.Booking booking83 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser74, parkingSpace79, localDateTime80, localDateTime81, "EpicAres254");
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        booking83.updateTime(localDateTime84, localDateTime85);
        java.time.LocalDateTime localDateTime87 = null;
        java.time.LocalDateTime localDateTime88 = null;
        booking83.updateTime(localDateTime87, localDateTime88);
        parkingSpace42.removeBooking(booking83);
        parkingSpace39.removeBooking(booking83);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(localDateTime50);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
        parkingSystem.model.VisitorUser visitorUser23 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser23.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot27 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace28 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot27);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        parkingSystem.model.parking.Booking booking32 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser23, parkingSpace28, localDateTime29, localDateTime30, "EpicAres254");
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        booking32.updateTime(localDateTime33, localDateTime34);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        booking32.updateTime(localDateTime36, localDateTime37);
        booking32.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime41 = null;
        booking32.extendTime(localDateTime41);
        booking32.checkedIn();
        parkingSpace19.removeBooking(booking32);
        parkingSystem.model.AbstractUser abstractUser45 = booking32.getUser();
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNotNull(abstractUser45);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser3.setValid(false);
        double double6 = studentUser3.getRate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("RareAtlas472", "UncommonKratos922", "EpicAtlas442");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        parkingSystem.model.ManagerUser managerUser3 = new parkingSystem.model.ManagerUser("EpicZeus667", "RareAtlas409", "UncommonHades555");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        parkingSystem.model.VisitorUser visitorUser6 = new parkingSystem.model.VisitorUser("LegendaryAtlas957", "RareZeus439", "LegendaryHades409");
        validationRequestBuffer0.removeRequest((parkingSystem.model.AbstractUser) visitorUser6);
        parkingSystem.model.util.ParkingSystem parkingSystem8 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser11 = null; // flaky "48) test664(RegressionTest1)": parkingSystem8.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser14 = parkingSystem8.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList15 = parkingSystem8.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList16 = parkingSystem8.getUsers();
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem8.login("Super Manager: RareAtlas923 ()", "RareKratos764");
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList20 = parkingSystem8.getUsers();
        parkingSystem.database.MaintainUsers maintainUsers21 = new parkingSystem.database.MaintainUsers();
        maintainUsers21.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser26 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray27 = new parkingSystem.model.AbstractUser[] { nonFacultyUser26 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList28 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList28, abstractUserArray27);
        java.lang.String str30 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28);
        boolean boolean32 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "EpicAres571");
        boolean boolean34 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList28, "CommonAtlas127");
        maintainUsers21.users = abstractUserList28;
        parkingSystem.model.AbstractUser abstractUser37 = maintainUsers21.getUserByEmail("hi!");
        maintainUsers21.load();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList39 = maintainUsers21.users;
        parkingSystem8.setUsers((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList39);
        validationRequestBuffer0.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList39);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(parkingSystem8);
        org.junit.Assert.assertNull(abstractUser11);
        org.junit.Assert.assertNull(abstractUser14);
        org.junit.Assert.assertNotNull(parkingLotList15);
        org.junit.Assert.assertNotNull(abstractUserList16);
        org.junit.Assert.assertNull(abstractUser19);
        org.junit.Assert.assertNotNull(abstractUserList20);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "19) test664(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LegendaryAres475" + "'", str30, "LegendaryAres475");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(abstractUser37);
        org.junit.Assert.assertNotNull(abstractUserList39);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("CommonAtlas127");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList3 = parkingLot2.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace4 = new parkingSystem.model.parking.ParkingSpace((int) '4', parkingLot2);
        parkingLot2.setLocation("CommonZeus931");
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList7 = parkingLot2.getOpenSpaces();
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList8 = parkingLot2.getOpenSpaces();
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        parkingSystem.model.parking.ParkingLot parkingLot3 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str4 = parkingLot3.toString();
        parkingSystem.model.parking.ParkingLot parkingLot6 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace7 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot6);
        parkingSpace7.disable();
        parkingSpace7.setOccupied(false);
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = parkingSpace7.isAvailable(localDateTime11, localDateTime12);
        parkingSystem.model.parking.ParkingLot parkingLot15 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace16 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot15);
        parkingSpace16.disable();
        parkingSpace16.setOccupied(false);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = parkingSpace16.isAvailable(localDateTime20, localDateTime21);
        parkingSystem.model.parking.Booking booking23 = null;
        parkingSpace16.addBooking(booking23);
        parkingSystem.model.parking.ParkingSpace[] parkingSpaceArray25 = new parkingSystem.model.parking.ParkingSpace[] { parkingSpace7, parkingSpace16 };
        java.util.ArrayList<parkingSystem.model.parking.ParkingSpace> parkingSpaceList26 = new java.util.ArrayList<parkingSystem.model.parking.ParkingSpace>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList26, parkingSpaceArray25);
        parkingLot3.setSpaces((java.util.List<parkingSystem.model.parking.ParkingSpace>) parkingSpaceList26);
        parkingSystem.model.parking.ParkingSpace parkingSpace29 = new parkingSystem.model.parking.ParkingSpace(100, parkingLot3);
        parkingSystem.model.parking.ParkingSpace parkingSpace30 = new parkingSystem.model.parking.ParkingSpace((int) (short) 100, parkingLot3);
        boolean boolean31 = parkingSpace30.isOccupied();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendaryZeus350" + "'", str4, "LegendaryZeus350");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(parkingSpaceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        superManager0.setName("RareZeus212");
        // The following exception was thrown during execution in test generation
        try {
            double double6 = superManager0.getRate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Managers do not have rate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus883 (CommonKratos485)" + "'", str1, "Super Manager: RareZeus883 (CommonKratos485)");
// flaky "49) test667(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus883 (CommonKratos485)" + "'", str3, "Super Manager: RareZeus883 (CommonKratos485)");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "50) test668(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.SuperManager superManager11 = parkingSystem.model.SuperManager.getInstance();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) superManager11);
        parkingSystem.model.util.ParkingSystem parkingSystem13 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser16 = parkingSystem13.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem13.login("Lot 0", "");
        parkingSystem.model.AbstractUser abstractUser22 = parkingSystem13.login("EpicAres346", "EpicAres571");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList23 = parkingSystem13.getLots();
        parkingSystem.model.util.ParkingSystem parkingSystem24 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser27 = parkingSystem24.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser30 = parkingSystem24.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList31 = parkingSystem24.getLots();
        parkingSystem13.setLots(parkingLotList31);
        parkingSystem0.setLots(parkingLotList31);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertNotNull(parkingSystem13);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNull(abstractUser19);
        org.junit.Assert.assertNull(abstractUser22);
        org.junit.Assert.assertNotNull(parkingLotList23);
        org.junit.Assert.assertNotNull(parkingSystem24);
        org.junit.Assert.assertNull(abstractUser27);
        org.junit.Assert.assertNull(abstractUser30);
        org.junit.Assert.assertNotNull(parkingLotList31);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "51) test669(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList18 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList19 = parkingSystem0.getUsers();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList20 = parkingSystem0.getUsers();
        parkingSystem.model.util.ParkingSystem parkingSystem21 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser24 = parkingSystem21.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem25 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot27 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str28 = parkingLot27.toString();
        parkingSystem25.addLot(parkingLot27);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList30 = parkingLot27.getSpaces();
        parkingSystem21.addLot(parkingLot27);
        parkingSystem.model.util.ParkingSystem parkingSystem32 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser35 = parkingSystem32.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser39 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser39.setPassword("EpicAres571");
        parkingSystem32.removeUser((parkingSystem.model.AbstractUser) studentUser39);
        parkingSystem.model.NonFacultyUser nonFacultyUser46 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str47 = nonFacultyUser46.toString();
        parkingSystem32.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser46);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList49 = parkingSystem32.getLots();
        parkingSystem21.setLots(parkingLotList49);
        parkingSystem0.setLots(parkingLotList49);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNotNull(abstractUserList18);
        org.junit.Assert.assertNotNull(abstractUserList19);
        org.junit.Assert.assertNotNull(abstractUserList20);
        org.junit.Assert.assertNotNull(parkingSystem21);
        org.junit.Assert.assertNull(abstractUser24);
        org.junit.Assert.assertNotNull(parkingSystem25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LegendaryZeus350" + "'", str28, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        org.junit.Assert.assertNotNull(parkingSystem32);
        org.junit.Assert.assertNull(abstractUser35);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str47, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList49);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = parkingSpace17.getNextAvailableTime(localDateTime18);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "52) test671(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.StudentUser studentUser14 = new parkingSystem.model.StudentUser("CommonAres691", "CommonHades477", "CommonZeus931");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) studentUser14);
        parkingSystem.model.AbstractUser abstractUser18 = parkingSystem0.login("", "UncommonKratos282");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNull(abstractUser18);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList1 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList2 = validationRequestBuffer0.getRequests();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList3 = null;
        validationRequestBuffer0.setRequests(abstractUserList3);
        parkingSystem.model.ManagerUser managerUser8 = new parkingSystem.model.ManagerUser("CommonAtlas127", "CommonHades337", "EpicZeus370");
        managerUser8.setPassword("LegendaryAres929");
        java.lang.String str11 = managerUser8.toString();
        // The following exception was thrown during execution in test generation
        try {
            validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) managerUser8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.requests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserList1);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Manager: CommonAtlas127 (LegendaryAres929)" + "'", str11, "Manager: CommonAtlas127 (LegendaryAres929)");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
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
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        booking31.updateTime(localDateTime39, localDateTime40);
        // The following exception was thrown during execution in test generation
        try {
            booking31.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        boolean boolean26 = parkingSpace2.isEnabled();
        parkingSpace2.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryAtlas691");
        java.lang.String str3 = parkingLot2.getLocation();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot7 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str8 = parkingLot7.toString();
        parkingSystem5.addLot(parkingLot7);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList10 = parkingLot7.getSpaces();
        parkingSystem.model.parking.ParkingSpace parkingSpace11 = new parkingSystem.model.parking.ParkingSpace((int) (short) 10, parkingLot7);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList12 = parkingLot7.getOpenSpaces();
        parkingLot2.setSpaces(parkingSpaceList12);
        parkingSystem.model.parking.ParkingSpace parkingSpace14 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 100, parkingLot2);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList15 = parkingLot2.getSpaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryAtlas691" + "'", str3, "LegendaryAtlas691");
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LegendaryZeus350" + "'", str8, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        org.junit.Assert.assertNotNull(parkingSpaceList15);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
        booking52.setCheckedInStatus(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lot 0" + "'", str11, "Lot 0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EpicAres254" + "'", str45, "EpicAres254");
        org.junit.Assert.assertNotNull(parkingSpace48);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.clearPastBookings();
        java.util.List<parkingSystem.model.parking.Booking> bookingList5 = parkingSpace2.getBookings();
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem.model.SuperManager superManager3 = parkingSystem.model.SuperManager.generateSuperManagerAccount("Super Manager: RareZeus883 (CommonKratos485)", "LegendaryAres481", "RareKratos584");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        parkingSystem.model.util.factories.NonFacultyUserFactory nonFacultyUserFactory0 = new parkingSystem.model.util.factories.NonFacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = nonFacultyUserFactory0.createUser("hi! (EpicAres254) - Role: Faculty", "LegendaryAtlas185", "LegendaryAtlas691");
        parkingSystem.model.AbstractUser abstractUser8 = nonFacultyUserFactory0.createUser("", "LegendaryAres724", "UncommonZeus748");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        booking12.setLicensePlate("CommonKratos832");
        java.time.LocalDateTime localDateTime22 = null;
        booking12.extendTime(localDateTime22);
        java.time.LocalDateTime localDateTime24 = booking12.getStartTime();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EpicAres254" + "'", str13, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        parkingSystem.model.NonFacultyUser nonFacultyUser3 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str4 = nonFacultyUser3.toString();
        java.lang.String str5 = nonFacultyUser3.getName();
        nonFacultyUser3.setEmail("hi!");
        nonFacultyUser3.validateUser();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str4, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UncommonZeus401" + "'", str5, "UncommonZeus401");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
        java.lang.String str39 = booking31.getLicensePlate();
        java.time.LocalDateTime localDateTime40 = booking31.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EpicAres254" + "'", str39, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime40);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        maintainUsers0.update();
        boolean boolean37 = maintainUsers0.validateUser("RareAres306", "RareAres306");
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "53) test683(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareKratos341" + "'", str9, "RareKratos341");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        booking12.extendTime(localDateTime25);
        parkingSystem.model.parking.ParkingSpace parkingSpace27 = booking12.getSpace();
        booking12.setCheckedInStatus(false);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertNotNull(parkingSpace27);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        java.lang.String str16 = parkingSpace7.toString();
        boolean boolean17 = parkingSpace7.isOccupied();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lot 0" + "'", str11, "Lot 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lot 0" + "'", str16, "Lot 0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser8 = null; // flaky "54) test686(RegressionTest1)": parkingSystem5.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser12.setPassword("EpicAres571");
        parkingSystem5.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        studentUser12.setPassword("UncommonZeus120");
        double double18 = studentUser12.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser12);
        parkingSystem.model.FacultyUser facultyUser23 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser23.removeValidation();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) facultyUser23);
        double double26 = facultyUser23.getRate();
        facultyUser23.setName("CommonKratos313");
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 15.0d + "'", double26 == 15.0d);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
        booking23.processDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        int int17 = parkingSpace6.getId();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("CommonAres479", "CommonKratos119", "RareZeus212");
        double double4 = visitorUser3.getRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
            double double31 = booking25.calculateFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EpicAres254" + "'", str29, "EpicAres254");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "55) test691(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.util.ParkingSystem parkingSystem4 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot6 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str7 = parkingLot6.toString();
        parkingSystem4.addLot(parkingLot6);
        java.util.List<parkingSystem.model.parking.ParkingSpace> parkingSpaceList9 = parkingLot6.getSpaces();
        parkingSystem0.addLot(parkingLot6);
        parkingSystem.model.StudentUser studentUser14 = new parkingSystem.model.StudentUser("CommonAres691", "CommonHades477", "CommonZeus931");
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) studentUser14);
        parkingSystem.model.util.ParkingSystem parkingSystem16 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser19 = parkingSystem16.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser23 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser23.setPassword("EpicAres571");
        parkingSystem16.removeUser((parkingSystem.model.AbstractUser) studentUser23);
        parkingSystem.model.NonFacultyUser nonFacultyUser30 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str31 = nonFacultyUser30.toString();
        parkingSystem16.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser30);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList33 = parkingSystem16.getLots();
        parkingSystem0.setLots(parkingLotList33);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNotNull(parkingSystem4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LegendaryZeus350" + "'", str7, "LegendaryZeus350");
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        org.junit.Assert.assertNotNull(parkingSystem16);
        org.junit.Assert.assertNull(abstractUser19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str31, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList33);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory0 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser4 = studentUserFactory0.createUser("UncommonAtlas241", "RareAtlas923", "LegendaryAtlas957");
        parkingSystem.model.AbstractUser abstractUser8 = studentUserFactory0.createUser("RareKratos824", "hi! (EpicAres254) - Role: Faculty", "CommonHades705");
        parkingSystem.model.AbstractUser abstractUser12 = studentUserFactory0.createUser("EpicHades610", "CommonHades705", "LegendaryAres724");
        parkingSystem.model.AbstractUser abstractUser16 = studentUserFactory0.createUser("Super Manager: LegendaryAres481 ()", "LegendaryHades566", "EpicHades772");
        org.junit.Assert.assertNotNull(abstractUser4);
        org.junit.Assert.assertNotNull(abstractUser8);
        org.junit.Assert.assertNotNull(abstractUser12);
        org.junit.Assert.assertNotNull(abstractUser16);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.parking.ParkingLot parkingLot2 = new parkingSystem.model.parking.ParkingLot("LegendaryZeus350");
        java.lang.String str3 = parkingLot2.toString();
        parkingSystem0.addLot(parkingLot2);
        parkingLot2.setLocation("RareZeus959");
        java.lang.String str7 = parkingLot2.toString();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendaryZeus350" + "'", str3, "LegendaryZeus350");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RareZeus959" + "'", str7, "RareZeus959");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        booking31.setCheckedInStatus(true);
        java.time.LocalDateTime localDateTime40 = null;
        booking31.extendTime(localDateTime40);
        parkingSystem.model.AbstractUser abstractUser42 = booking31.getUser();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNotNull(abstractUser42);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.disable();
        parkingSpace2.setOccupied(false);
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
        booking18.setCheckedInStatus(false);
        java.time.LocalDateTime localDateTime27 = null;
        booking18.extendTime(localDateTime27);
        booking18.checkedIn();
        parkingSpace2.addBooking(booking18);
        parkingSystem.model.parking.ParkingSpace parkingSpace31 = booking18.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace31);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.toString();
        java.lang.String str5 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str1, "Super Manager: RareZeus212 (CommonKratos485)");
// flaky "56) test696(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str3, "Super Manager: RareZeus212 (CommonKratos485)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str4, "Super Manager: RareZeus212 (CommonKratos485)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str5, "Super Manager: RareZeus212 (CommonKratos485)");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        parkingSystem.model.SuperManager superManager0 = parkingSystem.model.SuperManager.getInstance();
        java.lang.String str1 = superManager0.toString();
        java.lang.String str2 = superManager0.getEmail();
        java.lang.String str3 = superManager0.toString();
        java.lang.String str4 = superManager0.getRole();
        java.lang.String str5 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str1, "Super Manager: RareZeus212 (CommonKratos485)");
// flaky "57) test697(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RareZeus439" + "'", str2, "RareZeus439");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str3, "Super Manager: RareZeus212 (CommonKratos485)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Manager" + "'", str4, "Manager");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Super Manager: RareZeus212 (CommonKratos485)" + "'", str5, "Super Manager: RareZeus212 (CommonKratos485)");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("UncommonZeus490", "UncommonZeus401", "LegendaryHades903");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
        parkingSystem.model.NonFacultyUser nonFacultyUser40 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str41 = nonFacultyUser40.toString();
        java.lang.String str42 = nonFacultyUser40.getName();
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser40);
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "58) test699(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RareAres707" + "'", str9, "RareAres707");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str41, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UncommonZeus401" + "'", str42, "UncommonZeus401");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
        java.time.LocalDateTime localDateTime39 = booking31.getEndTime();
        java.time.LocalDateTime localDateTime40 = null;
        booking31.extendTime(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime39);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        maintainUsers0.update();
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer36 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.database.MaintainUsers maintainUsers37 = new parkingSystem.database.MaintainUsers();
        maintainUsers37.load();
        parkingSystem.model.NonFacultyUser nonFacultyUser42 = new parkingSystem.model.NonFacultyUser("EpicAres254", "EpicAres254", "");
        parkingSystem.model.AbstractUser[] abstractUserArray43 = new parkingSystem.model.AbstractUser[] { nonFacultyUser42 };
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList44 = new java.util.ArrayList<parkingSystem.model.AbstractUser>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<parkingSystem.model.AbstractUser>) abstractUserList44, abstractUserArray43);
        java.lang.String str46 = parkingSystem.model.util.Generator.generateUniqueUsername((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList44);
        boolean boolean48 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList44, "EpicAres571");
        boolean boolean50 = parkingSystem.model.util.DuplicateChecker.emailNotTaken((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList44, "CommonAtlas127");
        maintainUsers37.users = abstractUserList44;
        validationRequestBuffer36.setRequests((java.util.List<parkingSystem.model.AbstractUser>) abstractUserList44);
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer53 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser57 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double58 = facultyUser57.getRate();
        java.lang.String str59 = facultyUser57.getName();
        validationRequestBuffer53.notifyManager((parkingSystem.model.AbstractUser) facultyUser57);
        validationRequestBuffer36.removeRequest((parkingSystem.model.AbstractUser) facultyUser57);
        parkingSystem.model.VisitorUser visitorUser65 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser65.setEmail("");
        double double68 = visitorUser65.getRate();
        validationRequestBuffer36.addRequest((parkingSystem.model.AbstractUser) visitorUser65);
        parkingSystem.model.ManagerUser managerUser73 = new parkingSystem.model.ManagerUser("CommonAtlas127", "CommonHades337", "EpicZeus370");
        managerUser73.setPassword("LegendaryAres929");
        validationRequestBuffer36.addRequest((parkingSystem.model.AbstractUser) managerUser73);
        maintainUsers0.addUser((parkingSystem.model.AbstractUser) managerUser73);
        org.junit.Assert.assertNotNull(abstractUserArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "59) test701(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EpicAres388" + "'", str9, "EpicAres388");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractUser16);
        org.junit.Assert.assertNotNull(abstractUser21);
        org.junit.Assert.assertNotNull(abstractUserArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky "20) test701(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "LegendaryKratos822" + "'", str30, "LegendaryKratos822");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer36);
        org.junit.Assert.assertNotNull(abstractUserArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
// flaky "9) test701(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UncommonZeus110" + "'", str46, "UncommonZeus110");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(validationRequestBuffer53);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 15.0d + "'", double58 == 15.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 15.0d + "'", double68 == 15.0d);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
        boolean boolean20 = booking12.isCheckedOut();
        java.time.LocalDateTime localDateTime21 = null;
        booking12.extendTime(localDateTime21);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
        booking31.setCheckedInStatus(true);
        // The following exception was thrown during execution in test generation
        try {
            booking31.refundFees();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EpicAres254" + "'", str35, "EpicAres254");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser8 = null; // flaky "60) test704(RegressionTest1)": parkingSystem5.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser12.setPassword("EpicAres571");
        parkingSystem5.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        studentUser12.setPassword("UncommonZeus120");
        double double18 = studentUser12.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser12);
        parkingSystem.model.util.ParkingSystem parkingSystem20 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser23 = parkingSystem20.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser26 = parkingSystem20.login("Lot 0", "");
        parkingSystem.model.NonFacultyUser nonFacultyUser30 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        double double31 = nonFacultyUser30.getRate();
        double double32 = nonFacultyUser30.getRate();
        parkingSystem20.removeUser((parkingSystem.model.AbstractUser) nonFacultyUser30);
        maintainUser0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser30);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertNotNull(parkingSystem20);
        org.junit.Assert.assertNull(abstractUser23);
        org.junit.Assert.assertNull(abstractUser26);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 15.0d + "'", double31 == 15.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Sn6-", "");
        java.lang.String str4 = visitorUser3.getEmail();
        visitorUser3.validateUser();
        boolean boolean6 = visitorUser3.isValid();
        java.lang.String str7 = visitorUser3.getRole();
        visitorUser3.setPassword("UncommonKratos478");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sn6-" + "'", str4, "Sn6-");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Visitor" + "'", str7, "Visitor");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
        java.lang.String str21 = booking12.getLicensePlate();
        java.time.LocalDateTime localDateTime22 = null;
        booking12.extendTime(localDateTime22);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EpicAres254" + "'", str21, "EpicAres254");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        parkingSystem.model.StudentUser studentUser29 = new parkingSystem.model.StudentUser("RareZeus959", "LegendaryAres929", "EpicAres734");
        boolean boolean30 = studentUser29.isValid();
        java.lang.String str31 = studentUser29.getRole();
        double double32 = studentUser29.getRate();
        double double33 = studentUser29.getRate();
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) studentUser29);
        org.junit.Assert.assertNotNull(validationRequestBuffer0);
        org.junit.Assert.assertNotNull(abstractUserArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "61) test707(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RareAtlas433" + "'", str10, "RareAtlas433");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Student" + "'", str31, "Student");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 15.0d + "'", double32 == 15.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 15.0d + "'", double33 == 15.0d);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("EpicAres734", "LegendaryHades566", "UncommonHades257");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer20 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.VisitorUser visitorUser24 = new parkingSystem.model.VisitorUser("LegendaryZeus350", "Super Manager: EpicAres254 ()", "");
        java.lang.String str25 = visitorUser24.getPassword();
        java.lang.String str26 = visitorUser24.getEmail();
        validationRequestBuffer20.addRequest((parkingSystem.model.AbstractUser) visitorUser24);
        parkingSystem.model.VisitorUser visitorUser31 = new parkingSystem.model.VisitorUser("EpicAres571", "EpicAres254", "EpicAres571");
        visitorUser31.setEmail("");
        parkingSystem.model.parking.ParkingLot parkingLot35 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace36 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot35);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        parkingSystem.model.parking.Booking booking40 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser31, parkingSpace36, localDateTime37, localDateTime38, "EpicAres254");
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        booking40.updateTime(localDateTime41, localDateTime42);
        parkingSystem.model.parking.ParkingSpace parkingSpace44 = booking40.getSpace();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = parkingSpace44.getNextAvailableTime(localDateTime45);
        parkingSpace44.enable();
        boolean boolean48 = parkingSpace44.isEnabled();
        java.lang.String str49 = parkingSpace44.toString();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        parkingSystem.model.parking.Booking booking53 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) visitorUser24, parkingSpace44, localDateTime50, localDateTime51, "");
        parkingSpace16.addBooking(booking53);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(validationRequestBuffer20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Super Manager: EpicAres254 ()" + "'", str26, "Super Manager: EpicAres254 ()");
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Lot 0" + "'", str49, "Lot 0");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        parkingSystem.database.MaintainUser maintainUser0 = new parkingSystem.database.MaintainUser();
        maintainUser0.update();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList2 = maintainUser0.getUsers();
        java.util.ArrayList<parkingSystem.model.AbstractUser> abstractUserList3 = maintainUser0.getUsers();
        maintainUser0.load();
        parkingSystem.model.util.ParkingSystem parkingSystem5 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser8 = null; // flaky "62) test710(RegressionTest1)": parkingSystem5.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser12 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser12.setPassword("EpicAres571");
        parkingSystem5.removeUser((parkingSystem.model.AbstractUser) studentUser12);
        studentUser12.setPassword("UncommonZeus120");
        double double18 = studentUser12.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) studentUser12);
        parkingSystem.model.FacultyUser facultyUser23 = new parkingSystem.model.FacultyUser("", "", "");
        facultyUser23.removeValidation();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) facultyUser23);
        parkingSystem.model.NonFacultyUser nonFacultyUser29 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str30 = nonFacultyUser29.toString();
        java.lang.String str31 = nonFacultyUser29.getName();
        boolean boolean32 = nonFacultyUser29.isValid();
        double double33 = nonFacultyUser29.getRate();
        maintainUser0.addUser((parkingSystem.model.AbstractUser) nonFacultyUser29);
        org.junit.Assert.assertNotNull(abstractUserList2);
        org.junit.Assert.assertNotNull(abstractUserList3);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNull(abstractUser8);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.0d + "'", double18 == 15.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str30, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UncommonZeus401" + "'", str31, "UncommonZeus401");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 15.0d + "'", double33 == 15.0d);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        parkingSystem.database.MaintainUsers maintainUsers0 = new parkingSystem.database.MaintainUsers();
        maintainUsers0.load();
        parkingSystem.model.AbstractUser abstractUser3 = maintainUsers0.getUserByEmail("CommonAtlas127");
        maintainUsers0.update();
        maintainUsers0.load();
        org.junit.Assert.assertNull(abstractUser3);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        boolean boolean4 = facultyUser3.isValidated();
        double double5 = facultyUser3.getRate();
        double double6 = facultyUser3.getRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSystem.model.parking.Booking booking3 = null;
        parkingSpace2.addBooking(booking3);
        parkingSpace2.enable();
        parkingSpace2.disable();
        parkingSystem.model.parking.Booking booking7 = null;
        parkingSpace2.addBooking(booking7);
        parkingSpace2.disable();
        boolean boolean10 = parkingSpace2.isOccupied();
        // The following exception was thrown during execution in test generation
        try {
            parkingSpace2.clearPastBookings();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"parkingSystem.model.parking.Booking.getEndTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        parkingSystem.model.FacultyUser facultyUser3 = new parkingSystem.model.FacultyUser(" () - Role: Faculty", "EpicHades825", "CommonHades705");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "63) test715(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList8 = parkingSystem0.getUsers();
        parkingSystem.model.AbstractUser abstractUser11 = parkingSystem0.loginViaName("EpicAres346", "Manager:  (Sn6-)");
        // The following exception was thrown during execution in test generation
        try {
            parkingSystem0.generateSuperManager("EpicAtlas442", "CommonKratos811", "UncommonZeus401");
// flaky "21) test715(RegressionTest1)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instance already exists");
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
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace((int) (byte) 100, parkingLot1);
        parkingSpace2.enable();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "64) test717(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("Lot 0", "");
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList7 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser10 = parkingSystem0.loginViaName("EpicAres254", "UncommonHades257");
        parkingSystem.model.AbstractUser abstractUser13 = parkingSystem0.loginViaName("UncommonKratos575", "EpicHades170");
        parkingSystem.model.VisitorUser visitorUser17 = new parkingSystem.model.VisitorUser("EpicZeus370", "UncommonKratos808", "Lot 0");
        visitorUser17.validateUser();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) visitorUser17);
        java.lang.String str20 = visitorUser17.toString();
        double double21 = visitorUser17.getRate();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNotNull(parkingLotList7);
        org.junit.Assert.assertNull(abstractUser10);
        org.junit.Assert.assertNull(abstractUser13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EpicZeus370 (UncommonKratos808) - Role: Visitor" + "'", str20, "EpicZeus370 (UncommonKratos808) - Role: Visitor");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 15.0d + "'", double21 == 15.0d);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "65) test718(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.AbstractUser abstractUser6 = parkingSystem0.login("UncommonAres378", "Lot 0");
        parkingSystem.model.AbstractUser abstractUser9 = parkingSystem0.login("LegendaryZeus350", "LegendaryAtlas957");
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList10 = parkingSystem0.getUsers();
        parkingSystem.model.util.factories.VisitorUserFactory visitorUserFactory11 = new parkingSystem.model.util.factories.VisitorUserFactory();
        parkingSystem.model.AbstractUser abstractUser15 = visitorUserFactory11.createUser("RareAres766", "LegendaryHades507", "RareKratos824");
        parkingSystem.model.AbstractUser abstractUser19 = visitorUserFactory11.createUser("UncommonHades257", "LegendaryZeus350", "hi!");
        parkingSystem.model.AbstractUser abstractUser23 = visitorUserFactory11.createUser("CommonAres499", "UncommonZeus401", "Super Manager: RareAtlas121 ()");
        double double24 = abstractUser23.getRate();
        abstractUser23.setPassword("RareAres512");
        parkingSystem0.registerUser(abstractUser23);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertNull(abstractUser6);
        org.junit.Assert.assertNull(abstractUser9);
        org.junit.Assert.assertNotNull(abstractUserList10);
        org.junit.Assert.assertNotNull(abstractUser15);
        org.junit.Assert.assertNotNull(abstractUser19);
        org.junit.Assert.assertNotNull(abstractUser23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        parkingSystem.model.VisitorUser visitorUser3 = new parkingSystem.model.VisitorUser("LegendaryHades935", "UncommonAtlas241", "");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
        parkingSystem.model.AbstractUser abstractUser23 = maintainUsers0.getUserByEmail("UncommonAtlas828");
        org.junit.Assert.assertNull(abstractUser4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(abstractUserArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "66) test720(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CommonKratos422" + "'", str15, "CommonKratos422");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractUser23);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        parkingSystem.model.util.ParkingSystem parkingSystem0 = parkingSystem.model.util.ParkingSystem.getInstance();
        parkingSystem.model.AbstractUser abstractUser3 = null; // flaky "67) test721(RegressionTest1)": parkingSystem0.login("EpicZeus370", "RareHades843");
        parkingSystem.model.StudentUser studentUser7 = new parkingSystem.model.StudentUser("EpicAres571", "EpicAres254", "");
        studentUser7.setPassword("EpicAres571");
        parkingSystem0.removeUser((parkingSystem.model.AbstractUser) studentUser7);
        parkingSystem.model.NonFacultyUser nonFacultyUser14 = new parkingSystem.model.NonFacultyUser("UncommonZeus401", "Lot 0", "hi!");
        java.lang.String str15 = nonFacultyUser14.toString();
        parkingSystem0.registerUser((parkingSystem.model.AbstractUser) nonFacultyUser14);
        java.util.List<parkingSystem.model.parking.ParkingLot> parkingLotList17 = parkingSystem0.getLots();
        parkingSystem.model.AbstractUser abstractUser20 = parkingSystem0.login("LegendaryAres100", "LegendaryAres481");
        parkingSystem.model.util.factories.FacultyUserFactory facultyUserFactory21 = new parkingSystem.model.util.factories.FacultyUserFactory();
        parkingSystem.model.AbstractUser abstractUser25 = facultyUserFactory21.createUser("RareAtlas121", "hi!", "UncommonZeus401");
        parkingSystem.model.AbstractUser abstractUser29 = facultyUserFactory21.createUser("RareAtlas121", "CommonHades477", "RareAtlas409");
        parkingSystem.model.AbstractUser abstractUser33 = facultyUserFactory21.createUser("EpicAres716", "UncommonKratos282", "RareZeus439");
        parkingSystem0.registerUser(abstractUser33);
        abstractUser33.removeValidation();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNull(abstractUser3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UncommonZeus401 (Lot 0) - Role: Non-Faculty" + "'", str15, "UncommonZeus401 (Lot 0) - Role: Non-Faculty");
        org.junit.Assert.assertNotNull(parkingLotList17);
        org.junit.Assert.assertNull(abstractUser20);
        org.junit.Assert.assertNotNull(abstractUser25);
        org.junit.Assert.assertNotNull(abstractUser29);
        org.junit.Assert.assertNotNull(abstractUser33);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        parkingSystem.model.parking.ParkingLot parkingLot1 = null;
        parkingSystem.model.parking.ParkingSpace parkingSpace2 = new parkingSystem.model.parking.ParkingSpace(0, parkingLot1);
        parkingSpace2.clearPastBookings();
        int int4 = parkingSpace2.getId();
        parkingSpace2.setOccupied(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        parkingSystem.model.StudentUser studentUser3 = new parkingSystem.model.StudentUser("LegendaryZeus206", "EpicAres571 () - Role: Visitor", " () - Role: Visitor");
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
        booking16.processDeposit();
        parkingSystem.model.parking.ParkingSpace parkingSpace21 = booking16.getSpace();
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
        parkingSpace21.removeBooking(booking34);
        java.lang.String str39 = booking34.getLicensePlate();
        java.time.LocalDateTime localDateTime40 = booking34.getStartTime();
        parkingSystem.model.parking.ParkingSpace parkingSpace41 = booking34.getSpace();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        parkingSystem.model.parking.Booking booking45 = new parkingSystem.model.parking.Booking((parkingSystem.model.AbstractUser) studentUser3, parkingSpace41, localDateTime42, localDateTime43, "RareAtlas502");
        studentUser3.setPassword("CommonHades495");
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EpicAres254" + "'", str39, "EpicAres254");
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNotNull(parkingSpace41);
    }
}
