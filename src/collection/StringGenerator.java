package collection;

import generics.Generator;

/**
 * @author zhan
 * Created on 2018/01/04  22:19
 */
public class StringGenerator implements Generator<String>{

    private int index = 0;
    private String[] s = ("hello my name is zhang ni hao this is my first pattern .").split("\\s+");

    @Override
    public String next() {
        return s[index++];
    }
}
