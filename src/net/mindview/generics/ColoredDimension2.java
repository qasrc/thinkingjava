package net.mindview.generics;

/**
 * @author zhan
 * Created on 2017/11/20  20:31
 */
public class ColoredDimension2<T extends Dimension & HasColor>
        extends Colored2<T> {
    public ColoredDimension2(T item) {
        super(item);
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

}
