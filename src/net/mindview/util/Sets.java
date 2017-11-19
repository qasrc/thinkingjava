package net.mindview.util;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhan
 * Created on 2017/11/15  21:36
 */
public class Sets{

    /**
     * 两个集合的所有元素
     * @param a 集合a
     * @param b 集合b
     * @param <T> 集合类型
     * @return 两个集合的所有元素
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    public static <T extends Enum<T>> EnumSet<T> union(EnumSet<T> a, EnumSet<T> b) {
        EnumSet<T> result = a.clone();
        result.addAll(b);
        return result;
    }


    /**
     * 两个集合的交集
     * @param a 集合a
     * @param b 集合b
     * @param <T> 集合类型
     * @return 两个集合的共有元素
     */
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return  result;
    }


    /**
     * 移除集合sub在集合supers中的所有元素
     */
    public static <T> Set<T> diffrent(Set<T> supers, Set<T> sub) {
        Set<T> result = new HashSet<>(supers);
        result.removeAll(sub);
        return result;
    }

    /**
     * 获取除交集之外的所有元素
     */
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return diffrent(union(a, b), intersection(a, b));
    }

}
