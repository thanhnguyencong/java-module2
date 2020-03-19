package OIBinaryFile;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class ExampleManagerCustomer {

    private static void saveFileUsingStream(File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter ID:");
        String destPath = in.nextLine();
        System.out.println("Enter Name");
        String destPath = in.nextLine();
        System.out.println("Enter Producer");
        String destPath = in.nextLine();
        System.out.println("Enter Price");

        File destFile = new File(destPath);

        try {
            saveFileUsingStream(destFile);
            System.out.printf("save completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }

}
