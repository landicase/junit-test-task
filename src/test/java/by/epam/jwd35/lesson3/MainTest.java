package by.epam.jwd35.lesson3;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void isFalse() {

        Main main = new Main();
        Assert.assertTrue(main.ifInside(1, 4));
    }

}
