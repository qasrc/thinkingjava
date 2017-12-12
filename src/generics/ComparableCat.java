package generics;

/**
 * @author zhan
 * Created on 2017/12/04  22:35
 */
public class ComparableCat extends ComparablePet implements Comparable<ComparablePet>{

    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}
