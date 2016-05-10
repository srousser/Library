/**
 * Created by Student on 5/9/2016.
 */
public class Author implements Person {
    private String name;
    private BookList booksWritten;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addBook(Book book, BookList list)
    {
        list.add(book);
    }

    @Override
    public void removeBook(Book book, BookList list) {
        list.remove(book);
    }
}
