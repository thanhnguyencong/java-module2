package Debug;

import Debug.TriangleExceptionThrow;

import java.util.*;

public class TriangleException{
    public static void main(String[] args) {
        int d;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 3 cạnh của tam giac: ");
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            try {
                if (b + c > d && c + d > b && b + d > c) {
                    System.out.println("Tam giác");
                } else {
                    throw new TriangleExceptionThrow("ko phải tam giác");
                }
            } catch (TriangleExceptionThrow e) {
                System.out.println(e.getMessage());
            }
        } while (b + c <= d || c + d <= b || b + d <= c);
    }

}