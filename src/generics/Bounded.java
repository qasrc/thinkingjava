package generics;

import java.awt.*;

/**
 * @author zhan
 * Created on 2017/11/20  20:39
 */
public class Bounded extends Dimension implements HasColor,Weight {
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
