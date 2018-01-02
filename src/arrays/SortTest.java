package arrays;

import generics.Apple;
import generics.Generator;

import java.util.Arrays;
import java.util.Random;

/**
 * @author zhan
 * Created on 2018/01/02  22:13
 */
public class SortTest {
    static String[] colors = {"red", "blue", "yellow", "green", "black", "white"};
    static Random random = new Random(47);

    public static void main(String[] args) {
        Apple[] apples = Generated.array(new Apple[10], generator());
        System.out.println(Arrays.asList(apples));
        Arrays.sort(apples, new ArrayComparable());
        System.out.println(Arrays.asList(apples));
    }

    public static Generator generator() {
        return new Generator() {
            @Override
            public Object next() {
                return new Apple(colors[random.nextInt(6)], random.nextInt(100));
            }
        };
    }
}
