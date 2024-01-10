package lan.zold;

import java.math.*;

public class Romb {
    public double calcArea(double side, int angle) {
        return Math.pow(side, 2)*Math.sin(angle);
    }

    public double calcPerimeter(double side){
        return 4*side
    }
}
