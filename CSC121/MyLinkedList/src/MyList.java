/**
 *
 * @author Admin
 */
public interface MyList {
    void add(int index, Object element);
    boolean add(Object o);
    void clear();
    boolean contains(Object o);
    Object get(int index);
    int indexOf(Object o);
    boolean isEmpty();
    Object remove(int index);
    boolean remove(Object x);
    Object set(int index, Object element);
    int size();
    MyList subList(int fromIndex, int toIndex);
}
