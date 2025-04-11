import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.FacultyUser facultyUser4 = new parkingSystem.model.FacultyUser("hi!", "EpicAres254", "hi!");
        double double5 = facultyUser4.getRate();
        java.lang.String str6 = facultyUser4.getName();
        facultyUser4.removeValidation();
        double double8 = facultyUser4.getRate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        validationRequestBuffer0.addRequest((parkingSystem.model.AbstractUser) facultyUser4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        parkingSystem.model.util.ValidationRequestBuffer validationRequestBuffer0 = parkingSystem.model.util.ValidationRequestBuffer.getInstance();
        parkingSystem.model.util.factories.StudentUserFactory studentUserFactory1 = new parkingSystem.model.util.factories.StudentUserFactory();
        parkingSystem.model.AbstractUser abstractUser5 = studentUserFactory1.createUser("LegendaryZeus350", "RareAtlas121", "CommonAres908");
        validationRequestBuffer0.removeRequest(abstractUser5);
        java.util.List<parkingSystem.model.AbstractUser> abstractUserList7 = validationRequestBuffer0.getRequests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = parkingSystem.model.util.DuplicateChecker.usernameNotTaken(abstractUserList7, "RareAtlas563");
    }
}

