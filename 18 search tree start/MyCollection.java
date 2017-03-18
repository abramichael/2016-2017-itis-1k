import java.util.Iterator;

/**
 * Created by ma on 16.03.2017.
 */
public interface MyCollection<T> {
    boolean add(T e);
    void remove(T e);
    boolean contains(T e);
    int size();
    void clear();
}
