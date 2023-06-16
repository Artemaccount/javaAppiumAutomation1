import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassString() {
        String actual = new MainClass().getClassString();
        String containsString = "Hello";
        boolean contains = actual.contains(containsString) || actual.contains(containsString.toLowerCase());
        Assert.assertTrue("Строка не содержит " + containsString  + " и " + containsString.toLowerCase(), contains);
    }
}
