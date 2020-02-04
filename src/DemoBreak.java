import java.util.Scanner;

public class DemoBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int i = input.nextInt();
            if (i < 0) {
                continue;
            }

            System.out.println("Xin chao");
        }
    }
}
