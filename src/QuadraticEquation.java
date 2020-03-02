import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoop1() {
        return (-b + sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoop2() {
        return (-b - sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tham số của pt: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = getDiscriminant();

        if (delta < 0){
            System.out.println("The equation has no roots");
        }if (delta == 0){
            double root1 = getRoop1();
            System.out.println("The equation has 1 root:" + root1);
        }if (delta > 0){
            double root1 = getRoop1();
            double root2 = getRoop2();
            System.out.println("The equation has 2 root:" + root1 + " & " + root2);

        }

    }
}
