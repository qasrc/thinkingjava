package generics;

/**
 * @author zhan
 * Created on 2017/11/20  20:38
 */
public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> boundedSolid2 = new Solid2<>(new Bounded());
        boundedSolid2.getColor();
        boundedSolid2.getY();
        boundedSolid2.getX();
    }
}
