import java.util.ArrayList;

/**
 * Created by Student on 5/9/2016.
 */
public class PatronList implements LibraryList<Patron>
{
    private ArrayList<Patron> list;

    @Override
    public void display()
    {

    }

    @Override
    public Patron get(String name)
    {
        for (Patron patron: list)
        {
            if(patron.getName().equals(name))
            {
                return patron;
            }
        }
        return null;
    }

    @Override
    public int find(Patron patron)
    {
        return list.indexOf(patron);
    }

    @Override
    public void add(Patron patron)
    {
        list.add(patron);
    }

    @Override
    public Patron remove(Patron patron)
    {
        list.remove(patron);
        return patron;
    }


    @Override
    public ArrayList getList()
    {
        return list;
    }
}
