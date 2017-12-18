package generics;

/**
 * @author zhan
 * Created on 2017/12/16  15:44
 */
public abstract class GenericAbstract<T extends GenericAbstract<T>> {
    public T t;

    abstract void setT(T t);

    T getT() {
        return t;
    }
}

class GenericExtend extends GenericAbstract<GenericExtend>{

    @Override
    void setT(GenericExtend genericExtend) {

    }
}

