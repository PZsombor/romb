import org.testng.Assert;
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
        double actual = this.romb.calcArea(30.0, 90);
        double expected = 804.596;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Nem 804.596.. az eredmény!");
    }

    @Test
    public void testCalcArea2() {
        double actual = this.romb.calcArea(0, 90);
        double expected = 804.596;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Nem 804.596 az eredmény!");
    }

    @Test
    public void testCalcPerimeter() {
        double actual = this.romb.calcPerimeter(30);
        double expected = 120;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Nem 120 az eredmény!");
    }

    @Test
    public void testCalcPerimeter2() {
        double actual = this.romb.calcPerimeter(0);
        double expected = 120;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Nem 120 az eredmény!");
    }


}
