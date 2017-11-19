package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zhan
 * Created on 2017/11/19  9:04
 */
public class ArrayMaker<T> {
    private Class<T> type;

    public ArrayMaker(Class<T> type) {
        this.type = type;
    }

    @SuppressWarnings("unchecked")
    private T[] create() {
        return (T[]) Array.newInstance(type, 10);
    }

    public static void main(String[] args) {
        ArrayMaker arrayMaker = new ArrayMaker(String.class);
        System.out.println(Arrays.toString(arrayMaker.create()));
    }

}
