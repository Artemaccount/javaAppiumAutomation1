import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        String actual = new MainClass().getClassString();
        String containsString = "Hello";
        String containsLowerCase = "hello";
        boolean contains = actual.contains(containsString) || actual.contains(containsLowerCase);
        Assert.assertTrue("Строка не содержит " + containsString  + " и " + containsString.toLowerCase(), contains);
    }
}
