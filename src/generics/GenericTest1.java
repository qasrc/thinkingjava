package generics;

/**
 * @author zhan
 * Created on 2017/11/19  17:05
 */
public class GenericTest1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        GenericTest<String> genericTest = new GenericTest<>(String.class);
        System.out.println("123"+genericTest.getT().getClass());
    }
}
