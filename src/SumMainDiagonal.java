import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
    int length;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào số dòng của mảng: ");
    length = scanner.nextInt();

    // khai báo và cấp phát bộ nhớ cho mảng
    int[][] A = new int[length][length];

    // Để nhập giá trị các phần tử cho mảng
    // chúng ta sẽ sử dụng 2 vòng lặp for
    // vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
    // và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
    // mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
    for (int i = 0; i < length; i++) {
    for (int j = 0; j < length; j++) {
    System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
    A[i][j] = scanner.nextInt();
}
}
    // hiển thị các phần tử trong mảng vừa nhập
    // chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
    System.out.println("Mảng vừa nhập: ");
    for (int i = 0; i < length; i++) {
    for (int j = 0; j < length; j++) {
    System.out.print(A[i][j] + "\t");
    }
    // sau khi viết xong 1 dòng thi xuống hàng
    System.out.println("\n");
    }
    int Sum = 0;
    //tính tổng chéo chính
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ( i == j)
            Sum =+ A[i][j];
            }

        }
    }
}
