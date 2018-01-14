package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhan
 * Created on 2018/01/07  17:37
 */
public class UnSupport {
    static void test(List<String> stringList) {

        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }



    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "nihao", "ok");
        test(Collections.unmodifiableList(strings));
    }
}
