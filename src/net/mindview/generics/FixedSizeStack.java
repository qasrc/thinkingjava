package net.mindview.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/12/01  22:20
 */
public class FixedSizeStack<T> {
    private int index = 0;
    //private Object[] storage;
    private List<T> list;

    public FixedSizeStack() {
        list = new ArrayList<>();
    }

    public void push(T item) {
        list.add(item);
        index++;
    }

    public T pop() {
        return list.get(--index);
    }
}

