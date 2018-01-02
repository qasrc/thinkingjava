package arrays;

import generics.Generator;

import java.util.ArrayList;

/**
 * @author zhan
 * Created on 2018/01/02  22:18
 */
public class CollectionData<T> extends ArrayList<T>{
    public CollectionData(int a, Generator<T> generator) {
        for (int i = 0; i < a; i++) {
            add(generator.next());
        }
    }

}
