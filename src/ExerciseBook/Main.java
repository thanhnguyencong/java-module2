package ExerciseBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Book Book1 = new ProgramingBook("b111","ABC",5000,"Lilili","Java");
        Book Book2 = new ProgramingBook("b222","DEF",5000,"Lololo","Java");
        Book Book3 = new ProgramingBook("b333","MNO",10000,"Lalala","Python");
        Book Book4 = new ProgramingBook("b444","MNO",10000,"PLPLPL","Python");
        Book Book5 = new ProgramingBook("b555","MNO",15000,"Yeah","English");
        Book Book6 = new FictionBook("b666","XYZ",15000,"yees","English");
        Book Book7 = new FictionBook("b777","GHI",20000,"Nooo","Vietnam");
        Book Book8 = new FictionBook("b888","VWY",20000,"hiiiii","Vietnam");
        Book Book9 = new FictionBook("b999","LMN",30000,"haaaa","China");
        Book Book10 = new FictionBook("b1000","RST",30000,"huuuu","Laos");

        int count=0;
        ProgramingBook a = (ProgramingBook) Book1;
        ProgramingBook b = (ProgramingBook) Book2;
        ProgramingBook c = (ProgramingBook) Book3;
        ProgramingBook d = (ProgramingBook) Book4;
        ProgramingBook e = (ProgramingBook) Book5;
        ProgramingBook[] listbook = {(ProgramingBook) Book1, (ProgramingBook) Book2,(ProgramingBook) Book3, (ProgramingBook) Book4, (ProgramingBook) Book5};
        for (ProgramingBook x:listbook
             ) {
            if (x.getBooklanguage() == "Java")
                count++;
        }
        System.out.println(count);

        //get book to arraylist
        ArrayList<Book> listBook = new ArrayList<>();
        listBook.add(0,Book1);
        listBook.add(1,Book2);
        listBook.add(2,Book3);
        listBook.add(3,Book4);
        listBook.add(4,Book5);
        listBook.add(5,Book6);
        listBook.add(6,Book7);
        listBook.add(7,Book8);
        listBook.add(8,Book9);
        listBook.add(9,Book10);

        //search price by name by sequential search
        Scanner scanner = new Scanner(System.in);
        System.out.print("bookname:");
        String bookname = scanner.next();
        if (listBook.contains(bookname)){
            for (int i = 0; i < listBook.size(); i++) {
                if (bookname == listBook.get(i).getName()){
                }
            }
        }else {
            System.out.println("Not found");
        }

        //sort price
        boolean needNextPass = true;
        for (int i = 0; i < listBook.size(); i++) {
            needNextPass = false;
            for (int j = 0; j < listBook.size() - i ; j++) {
                if (listBook.get(i).getPrice() > listBook.get(i+1).getPrice()){
                    int temp = listBook.get(i).getPrice();
                    listBook.get(i).setPrice( listBook.get(i+1).getPrice());
                    listBook.get(i+1).setPrice(temp);

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
        }



    }
}
