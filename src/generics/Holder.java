package generics;

/**
 * @author zhan
 * Created on 2017/11/21  21:08
 */
public class Holder<T> {

    private T value;

    public Holder() {
    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple d = appleHolder.getValue();
        appleHolder.setValue(d);
        Holder<? extends  Fruit> h = appleHolder;
        Orange orange = (Orange) h.getValue();
    }
}
