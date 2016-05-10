/**
 * Created by Student on 5/9/2016.
 */
public class Patron implements Person
{
    private String name;
    private BookList booksCheckedOut;
    private Integer fine;
    private BookList booksOverDue;

    public Patron()
    {

    }

    public Patron(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
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

    public BookList getCheckedOut()
    {
        return booksCheckedOut;
    }

    public BookList getOverDue()
    {
        return booksOverDue;
    }

    public int getFine()
    {
        return fine;
    }

    public void setFine(int fine)
    {
        this.fine = fine;
    }

    public boolean equals(Patron patron)
    {
        return patron.getName().equals(name) && patron.getCheckedOut().equals(booksCheckedOut) && patron.getOverDue().equals(booksOverDue) && patron.getFine() == fine;
    }

    public String toString()
    {
        return "";
    }
}
