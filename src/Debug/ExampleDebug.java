package Debug;
import java.util.*;

public class ExampleDebug {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        Scanner scn = new Scanner(System.in);
        System.out.println("nhap a,b,c");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();

        if (a != 0){
            double solution = -b/a;
        }
    }
}
