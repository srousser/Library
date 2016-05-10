/**
 * Created by Student on 5/9/2016.
 */
public class Patron implements Person
{
    private String name;
    private BookList booksCheckedOut;
    private Integer fine;
    private BookList booksOverDue;

    public Patron(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addBook(Book book, BookList list)
    {

    }
}
