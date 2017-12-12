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
        T[] ts = (T[]) Array.newInstance(type, 10);
        return ts;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ArrayMaker<String> arrayMaker = new ArrayMaker<>(String.class);
        System.out.println(arrayMaker.type);
        System.out.println(arrayMaker.type.isInstance("234"));
        System.out.println(arrayMaker.type.newInstance().getClass().getSimpleName());
        System.out.println(Arrays.toString(arrayMaker.create()));
    }

    public void add() {
        System.out.println("------");
    }

    /**
     * 测试添加方法
     */
    public void addMethod() {
        System.out.println("--------------------------------------");
    }

}
