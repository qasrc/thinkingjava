package net.mindview.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhan
 * Created on 2017/11/26  15:54
 */
public class CaptureConversion {

    static <T> void f1(Holder<T> holder) {
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder holder) {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        //f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f2(rawBasic);

        Holder wildvarded = new Holder<>(1.0);
        f2(wildvarded);

        Holder<Integer> integerHolder = new Holder<>();
        int a = 2;
        integerHolder.setValue(a);
        int b = integerHolder.getValue();
        Integer c = 3;
        int[] ints = new int[3];
        ints[0] = c;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ints[i] = integers.get(i);
        }
    }

    public void test(Holder<List<?>> holder) {
        List<?> list = holder.getValue();
        //list.set(new Object()); //error
        Object o = list.get(0);
        //holder.setValue(new Object());
    }

    public void test1(List<Holder<?>> holders) {
        holders.add(new Holder<>());
        //holders.add(new Object());
        holders.set(0, new Holder<>());
        Holder<?> holder = holders.get(0);
        //holder.setValue(new Object()); //error
        Object o  = holder.getValue();
    }
}
