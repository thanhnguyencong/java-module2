package ExerciseBook;


public class FictionBook extends Book {
    String Booklanguage;

    FictionBook(){
    }

    public FictionBook(String BookbookCode, String name,int price, String author, String Booklanguage){
        super(BookbookCode,name,price,author);
        this.Booklanguage = Booklanguage;
    }

    public String getBooklanguage() {
        return Booklanguage;
    }

    public void setBooklanguage(String booklanguage) {
        Booklanguage = booklanguage;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "Booklanguage='" + Booklanguage + '\'' +
                '}';
    }
}
