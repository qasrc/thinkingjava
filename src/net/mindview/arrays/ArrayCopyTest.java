package net.mindview.arrays;

import net.mindview.generics.Apple;

import java.util.Arrays;

/**
 * @author zhan
 * Created on 2017/12/30  16:05
 */
public class ArrayCopyTest {

    public static void main(String[] args) {
        Apple[] apples = {new Apple("blue", 10),
                new Apple("red", 20)};

        Apple[] target = {new Apple("blue", 10),
                new Apple("red", 20)};


        System.out.println(Arrays.equals(apples, target));


        System.arraycopy(apples,0,target,0,apples.length);



        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }
        for (Apple apple : target) {
            System.out.println(apple.toString());
        }

        Apple apple1 = target[0];
        apple1.setColor("black");


        System.out.println("================");
        for (Apple apple : apples) {
            System.out.println(apple.toString());
        }

        for (Apple apple : target) {
            System.out.println(apple.toString());
        }
    }



}
