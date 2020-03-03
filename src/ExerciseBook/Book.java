package ExerciseBook;

public class Book {
    String BookbookCode;
    String name;
    int price;
    String author;
    Book() {
    }
    public Book(String BookbookCode,String name,int price,String author){
        this.BookbookCode = BookbookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getBookbookCode() {
        return BookbookCode;
    }

    public void setBookbookCode(String bookbookCode) {
        BookbookCode = bookbookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookbookCode='" + BookbookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

}
