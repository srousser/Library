import java.util.ArrayList;

/**
 * Created by Student on 5/9/2016.
 */
public class BookList implements LibraryList<Book> {
    ArrayList<Book> list;

    public BookList() {
        list = new ArrayList<Book>();
    }

    public Book getBook(String name) {
        for (Book book : list) {
            if (book.getTitle().equals(name)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void display()
    {

    }

    @Override
    public ArrayList<Book> getList()
    {
        return list;
    }

    @Override
    public void add(Book book)
    {
        list.add(book);
    }

    @Override
    public Book remove(Book book) {
        list.remove(book);
        return book;
    }

    @Override
    public Book get(String name)
    {
        for (Book book: list) {
            if(book.getTitle().equals(name))
            {
                return book;
            }
        }
        return null;
    }
    //Forgot what this was for, feel free to fix.
    @Override
    public int find(Book book)
    {
        if (list.contains(book))
        {
            return list.indexOf(book);
        }
        return -1;
    }
}
