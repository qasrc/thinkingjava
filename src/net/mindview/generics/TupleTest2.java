package net.mindview.generics;

import net.mindview.util.tuple.ThreeTuple;
import net.mindview.util.tuple.TwoTuple;

/**
 * @author zhan
 * Created on 2017/11/14  22:09
 */
public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 123);
    }

    static TwoTuple f2() {
        return new TwoTuple("hi", 123);
    }

    static ThreeTuple<String, Integer, Double> h() {
        return new ThreeTuple<>("hello", 123, 12.0);
    }

    public static void main(String[] args) {
        System.out.println(h());
    }

}
