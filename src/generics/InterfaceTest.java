package generics;

/**
 * @author zhan
 * Created on 2017/11/18  22:04
 */
public class InterfaceTest {
    public static  <T extends InterfaceA> void test(T t) {
        t.a();
    }

    public static void main(String[] args) {
        test(new InterfaceAImple());
    }
}
