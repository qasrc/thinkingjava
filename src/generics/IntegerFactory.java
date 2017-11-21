package generics;

/**
 * @author zhan
 * Created on 2017/11/19  15:06
 */
public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return 0 ;
    }
}
