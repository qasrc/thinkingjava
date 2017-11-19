package net.mindview.util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * 各容器间方法的异同
 * @author zhan
 * Created on 2017/11/18  14:25
 */
public class ContainerMethodDifferences {

    static Set<String> objects = ContainerMethodDifferences.getMethods(Object.class);

    static {
        objects.add("clone");
    }

    /**
     * 获取类中的可用方法
     * @param type 类型
     */
    public static Set<String> getMethods(Class<?> type) {
        Set<String> methods = new HashSet<>();
        for (Method method : type.getMethods()) {
            methods.add(method.getName());
        }
        return methods;
    }

    public static void interfaces(Class<?> type) {
        List<String> interfaces = new ArrayList<>();
        for (Class<?> aClass : type.getInterfaces()) {
            interfaces.add(aClass.getSimpleName());
        }
        System.out.println(type.getSimpleName() + "interfaces:" + interfaces);
    }

    public static void difference(Class<?> superClass, Class<?> subClass) {
        System.out.printf("%s extends %s", superClass.getSimpleName(), subClass.getSimpleName());
        Set<String> result = Sets.diffrent(getMethods(superClass), getMethods(subClass));
        result.removeAll(objects);
        System.out.println(result);
        interfaces(superClass);
    }


    public static void main(String[] args) {
        difference(Set.class, Collection.class);
        difference(HashMap.class,Map.class);
        difference(ArrayList.class,List.class);
    }


}
