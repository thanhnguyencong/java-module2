import java.lang.*;
import java.math.*;

public class AccessModifierCircle {
    private static double radius=1;
    private static String color="red";

    AccessModifierCircle(){
    }

    AccessModifierCircle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
