/**
 * Created by Student on 5/9/2016.
 */
public interface Person
{
    //Kept yelling at me if I didn't initialize it, so...
    String name = "";

    public String getName();
    public void setName(String name);
    public void addBook(Book book, BookList list);
    public void removeBook(Book book, BookList list);
}
