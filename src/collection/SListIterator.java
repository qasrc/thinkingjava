package collection;

/**
 * @author zhan
 * Created on 2018/01/09  21:57
 */
public class SListIterator<T> {


    private T[] ts;

    private int index = 0;

    private T loc;

    public SListIterator(T[] ts) {
        this.ts = ts;
    }

    public boolean hasNext() {
        return index > ts.length;
    }

    public T next() {
        return ts[index++];
    }

    public void set(T t) {
        ts[index] = t;
    }

    public void add(T t) {
        ts[index] = t;
    }


}
