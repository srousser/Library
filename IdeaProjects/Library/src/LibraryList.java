import java.util.ArrayList;

/**
 * Created by Student on 5/9/2016.
 */
public interface LibraryList <E>
{
    //Unsure what error is here
    ArrayList<E> list = new ArrayList<E>();

    public void display();
    public E get(String name);
    public int find(E e);
    public void add(E e);
    public E remove(E e);
    public ArrayList<E> getList();
}
