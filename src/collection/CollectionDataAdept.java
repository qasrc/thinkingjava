package collection;

import generics.Generator;

import java.util.ArrayList;

/**
 * @author zhan
 * Created on 2018/01/04  22:13
 */
public class CollectionDataAdept<T> extends ArrayList<T> {

    public CollectionDataAdept(Generator<T> generator, int num) {
        for (int i = 0; i < num; i++) {
            add(generator.next());
        }
    }


    public static <T> CollectionDataAdept<T> fill(Generator<T> generator, int num) {
        return new CollectionDataAdept<>(generator, num);
    }
}
