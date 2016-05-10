import java.util.ArrayList;

/**
 * Created by Student on 5/9/2016.
 */
public class AuthorList implements LibraryList<Author> {
    private ArrayList<Author> list;

    @Override
    public void display()
    {

    }

    @Override
    public Author get(String name)
    {
        for (Author author:list)
        {
            if(author.getName().equals(name))
            {
                return author;
            }
        }
        return null;
    }

    @Override
    public int find(Author author) {
        return list.indexOf(author);
    }

    @Override
    public void add(Author author) {
        list.add(author);
    }

    @Override
    public Author remove(Author author) {
        list.remove(author);
        return author;
    }

    @Override
    public ArrayList<Author> getList() {
        return list;
    }
}
