package generics;

import java.util.List;

/**
 * @author zhan
 * Created on 2017/12/04  22:31
 */
public interface UseList<K, V> {

    /**
     * 擦除到第一边界后参数类型相同
     * @param kList
     */
    void f(List<K> kList);

    //void f(List<V> vList);
}
