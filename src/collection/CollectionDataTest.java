package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2018/01/04  22:24
 */
public class CollectionDataTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(CollectionDataAdept.fill(new StringGenerator(), 9));
        System.out.println(stringList);
    }
}
