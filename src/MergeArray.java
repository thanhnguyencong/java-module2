import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
       int length1;
       int length2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("độ dài array 1: ");
        length1 = scanner.nextInt();

        System.out.println("Enter height: ");
        length2 = scanner.nextInt();

        int length3 = length1 + length2;

        Integer[] Array1 = new Integer[length1];
        Integer[] Array2 = new Integer[length2];
        Integer[] Array3= new Integer[length3];
    }
}
