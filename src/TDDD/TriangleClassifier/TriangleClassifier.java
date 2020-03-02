package TDDD.TriangleClassifier;

public class TriangleClassifier {
    int a;
    int b;
    int c;

    public static String size(int a, int b, int c) {
        String result = "null";
        if (a <= 0 || b <= 0 || c <= 0) {
            result = "khong phai tam giac";
            return result;
        }
        if (a + b < c || b + c < a || c + a < b) {
            result = "khong phai tam giac";
            return result;
        }
        if (a == b || b == c || c == a) {
            result = "tam giac can";
            return result;
        }
        if (a == b && b == c) {
            result = "tam giac deu";
            return result;
        }
        return result;
    }
}