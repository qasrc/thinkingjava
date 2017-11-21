package generics;

/**
 * @author zhan
 * Created on 2017/11/19  9:32
 */
public class SimpleHolder<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        SimpleHolder<String> simpleHolder = new SimpleHolder<>();
        simpleHolder.setObject("hello world");
        String s =  simpleHolder.getObject();
    }
}
