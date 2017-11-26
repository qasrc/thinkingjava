package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/26  8:11
 */
public class Generic1<T> {
    private List<T> list = new ArrayList<>();
    public void printT(T t) {
        System.out.println(t.toString());
    }

    public void add(List<? extends T> list) {
        for (T t : list) {
            printT(t);
        }
    }

    public void push(List<? super T> list) {
        Generic2<T> generic2 = new Generic2<>();
        list.add(generic2.getT());

    }

    public
    static class Generic2<T>{
        T getT() {
            return null;
        }
    }
}


