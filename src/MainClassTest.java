import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber() {
        int actual = new MainClass().getClassNumber();
        int compareNumber = 45;
        boolean greaterThan45 = actual > compareNumber;
        Assert.assertTrue("Число полученное из getClassNumber меньше " + compareNumber, greaterThan45);
    }
}
