package net.mindview.arrays;

import net.mindview.generics.Generator;

/**
 * @author zhan
 * Created on 2018/01/02  22:24
 */
public class Generated {
    public static <T> T[] array(T[] a, Generator<T> generator) {
        return new CollectionData<>(a.length, generator).toArray(a);
    }
}
