import java.util.Date;

/**
 * Created by Student on 5/9/2016.
 */
public class Book
{
    private String title;
    private Author author;
    private Date dueDate;

    public Book(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public Date getDue()
    {
        return dueDate;
    }

    public void setDue(Date dueDate)
    {
        this.dueDate = dueDate;
    }

    public boolean equals(Book book)
    {
        return book.getTitle().equals(title) && book.getAuthor().equals(author) && book.getDue().equals(dueDate);
    }

    public String toString()
    {
        return "Title: " + title + "\tAuthor: " + author.toString() + "\tDue Date: " + dueDate;
    }
}
