package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/12/13  20:18
 */
public abstract class SelfBounding<T extends SelfBounding<T>> {
    T element;

    SelfBounding<T> set(T args) {
        element = args;
        return this;
    }

    T get() {
        return element;
    }
}

class A extends SelfBounding<A> {
    public static void main(String[] args) {
        A a = new A();
        a = a.get();

    }
}

class B extends SelfBounding<A> {
}

interface testaa<T extends testaa<T>> {
    T getT();
    void setT();
}

class E{}

class C implements testaa<C>{

    @Override
    public C getT() {
        return null;
    }

    @Override
    public void setT() {
    }
}

