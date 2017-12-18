package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/12/17  14:20
 */
public class CheckList {
    @SuppressWarnings("unchecked")
    private static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        oldStyleMethod(dogs);
        List<Dog> dogs1 = Collections.checkedList(new ArrayList<>(), Dog.class);
        oldStyleMethod(dogs1);
    }
}


class Cat{}

class Dog{}

class Coffee{}