import java.util.Scanner;

public class NumberStudentPass<size> {
    int size;
    int[] a;
    Scanner scanner = new Scanner(System.in);
 NumberStudentPass(){
 }
    do {
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        if (size > 30)
            System.out.println("Size should not exceed 30");
    } while (size > 30)
    a = int[size];
    int i = 0;
 while (i < a.length) {
        System.out.print("Enter a mark for student " + (i + 1) + ": ");
        a[i] = scanner.nextInt();
        i++;
    }
    int count = 0;
System.out.println("List of mark: ");
 for (int j = 0; j < a.length; j++) {
        System.out.print(a[j] + "\t");
        if (a[j] >= 5 && a[j] <= 10)
            count++;
    }
 System.out.print("\n The number of students passing the exam is " + count);
}
