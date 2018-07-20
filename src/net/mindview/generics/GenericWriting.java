package net.mindview.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/23  21:21
 */
public class GenericWriting {
    private static List<Fruit> fruits = new ArrayList<Fruit>();
    private static List<Apple> apples = new ArrayList<Apple>();

    public static <T> void write(List<T> item, T t) {
        item.add(t);
    }

    public static <T> void writeSuper(List<? super T> item, T t) {
        item.add(t);
    }

    public static void main(String[] args) {
        write(apples, new Apple());
        write(fruits, new Apple());
        writeSuper(fruits, new Apple());
    }

    static class Reader<T>{
        T getT(List<? extends T> list) {
            return list.get(0);
        }
    }

    @Test
    public void test1(){
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit fruit = fruitReader.getT(fruits);
        Fruit fruit1 = fruitReader.getT(apples);
    }
}
