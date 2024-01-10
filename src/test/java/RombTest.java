import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcArea() {
        double actual = this.romb.calcArea(30.0, 80);
        double expected = 0.9848;
    }

    public void testCalcPerimeter() {
        double actual = this.romb.calcPerimeter();
        double expected = 120;
    }


}
