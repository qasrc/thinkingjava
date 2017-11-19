package generics;

import java.util.Collection;

/**
 * @author zhan
 * Created on 2017/11/18  16:07
 */
public class Generators {
    public static <T> void fill(Collection<T> collection, Generator<T> source, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(source.next());
        }
    }
}
