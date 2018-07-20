package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/11/20  20:36
 */
public class Solid2<T extends Dimension & HasColor & Weight>
        extends ColoredDimension2<T> {

    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.getWeight();
    }
}
