package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/11/18  16:14
 */
public class BigFish {
    private static Integer count = 0;
    private Integer temp = count++;

    //构造器私有，强制使用generator
    private BigFish(){}

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }

    @Override
    public String toString() {
        return "BigFish{" +
                "count=" + temp +
                '}';
    }
}
