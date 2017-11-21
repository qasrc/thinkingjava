package generics;

/**
 * @author zhan
 * Created on 2017/11/19  15:16
 */
public class FactoryContainer {
    public static void main(String[] args) {
        System.out.println(new Foo2<>(new Widget.Factory()));
    }
}
