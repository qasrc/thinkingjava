package generics;

/**
 * @author zhan
 * Created on 2017/11/20  20:25
 */
public class HoldItem<T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    T getItem(){
        return item;
    }
}
