package net.mindview.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaQs {

    public void fly(Flyable flyable) {
        flyable.fly();
    }

    public void run(Runable runable) {
        runable.run("i am run");
    }

    public void work(Workable workable) {
        workable.distance(1,2);
    }

    public static void main(String[] args) {
        LambdaQs lambdaQs = new LambdaQs();
        lambdaQs.fly(() -> System.out.println("i am fly"));

        lambdaQs.run(name -> System.out.println(name + ",zhangzhan"));

        lambdaQs.work((a, b) -> System.out.println(a+b));

        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.removeIf(ele -> (((String) ele).length() < 10));

    }

    @Test
    public void test() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(i);
        }
        long count = integers.stream().filter(ele -> ele > 10).count();
        System.out.println(count);
        System.out.println(integers);
    }

}
