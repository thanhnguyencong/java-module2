import java.util.Scanner;

public class DeleteElementinArray {
    public static void main(String[] args) {
        int[] array = {10 , 4 , 6, 7 , 8 , 6, 0 , 0 , 0 , 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("vi tri muon xoa: ");
        int vitri = scanner.nextInt();

        if ( vitri < array.length ){
            for (int i = vitri - 1; i < array.length; i++) {
                array[i] = array[i + 1];
                array[array.length - 1] = 0;
            }
            return;
        }
        System.out.println(array);

    }
}
