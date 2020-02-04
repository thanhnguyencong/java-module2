import java.util.Scanner;

public class ExerciseDislay20firstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int dem = 0;

        for (int i = number; ; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0)
                    break;
                else{
                    dem = dem + 1;
                    if (dem <= 20)
                        System.out.println("20 so nguyen to tiep theo la: " + i +" ");
                    if (dem > 20)
                        break;
                }
            }
        }
    }
}
