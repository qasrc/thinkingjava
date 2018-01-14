package collection;

/**
 * @author zhan
 * Created on 2018/01/09  21:57
 */
public class SList<T> {


    private T[] ts;

    public SListIterator<T> iterator() {
        return new SListIterator<>(ts);
    }
}
