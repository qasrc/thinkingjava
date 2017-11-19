package net.mindview.util.tuple;

/**
 * @author zhan
 * Created on 2017/11/14  21:56
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
