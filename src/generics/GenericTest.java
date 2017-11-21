package generics;

/**
 * @author zhan
 * Created on 2017/11/19  17:02
 */
public class GenericTest<T> {
    private Class<T> type;

    public GenericTest(Class<T> type) {
        this.type = type;
    }

    T getT() throws IllegalAccessException, InstantiationException {
        return type.newInstance();
    }
}

