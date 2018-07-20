package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/11/19  15:07
 */
public class Foo2<T> {
    private T t;

    public <F extends FactoryI<T>> Foo2(F factoryI) {
        t = factoryI.create();
    }

}
