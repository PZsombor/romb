import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void testCalc() {
        this.romb = new Romb();
    }

    @Test
    public void testCalc2() {
        this.romb.calc();
    }
}
