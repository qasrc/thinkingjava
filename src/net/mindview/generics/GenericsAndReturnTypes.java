package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/12/16  15:20
 */
interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}

interface Getter extends GenericGetter<Getter>{}

public class GenericsAndReturnTypes {
    void test(Getter getter) {
        Getter getter1 = getter.get();
        GenericGetter genericGetter = getter.get();
    }

    void test1() {
        Child child = new Child();

    }
}

 class Parent{}

 class Child extends Parent{
     void set(Child child) {

     }
 }

class CChild extends Child {

}

