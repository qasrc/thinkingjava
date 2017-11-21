package generics;

/**
 * @author zhan
 * Created on 2017/11/20  20:27
 */
public class Colored2<T extends HasColor> extends HoldItem<T>{
    public Colored2(T item) {
        super(item);
    }

    java.awt.Color getColor() {
        return item.getColor();
    }

}
