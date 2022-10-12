import java.util.List;

public class BookPrintScreen extends  Book{
    public BookPrintScreen(String title, List<String> pages) {
        super(title, pages);
    }
    @Override
    public void print() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
