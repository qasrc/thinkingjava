package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/23  21:00
 */
public class SuperType {
    public void write(List<? super Apple> apple) {
        apple.add(new Apple());
        apple.add(new Jonathan());

    }


}
