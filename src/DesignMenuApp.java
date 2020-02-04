import java.util.Scanner;

public class DesignMenuApp {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        while(choice!= 0) {

        }
    }

    public static class NextDay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("day:");
            int day = scanner.nextInt();
            System.out.print("month:");
            int month = scanner.nextInt();
            System.out.print("year:");
            int year = scanner.nextInt();
            DayOfMonth dayOfMonth = new DayOfMonth(month, day);
            int dayCalendar = dayOfMonth.getDayOfMonth();
            if (day == dayCalendar) {
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else month++;

            } else {
                day++;
            }
            System.out.printf("the next year/mont/day:%d/%d/%d", year, month, day);
        }
    }
}
