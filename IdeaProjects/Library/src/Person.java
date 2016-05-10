/**
 * Created by Student on 5/9/2016.
 */
public interface Person
{
    String name;

    public String getName();
    public void setName(String name);
    public void addBook(Book book, BookList list);
    public void removeBook(Book book, BookList list);
}
