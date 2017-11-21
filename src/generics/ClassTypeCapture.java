package generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhan
 * Created on 2017/11/19  10:46
 */
public class ClassTypeCapture<T> {
    private Class<T> type;
    private Map<String, Class<?>> map = new HashMap<>();

    public ClassTypeCapture(Class<T> type) {
        this.type = type;
    }

    public void addType(String typeName, Class<?> kind) {
        map.put(typeName, kind);
    }

    public void createNew(String typeName) throws ClassNotFoundException {
        addType(typeName,Class.forName(typeName));
    }

    private boolean f(Object object) {
        return type.isInstance(object);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ClassTypeCapture<building> buildingClassTypeCapture = new ClassTypeCapture<>(building.class);
        System.out.println(buildingClassTypeCapture.f(new building()));
        System.out.println(buildingClassTypeCapture.f(new Hourse()));
        ClassTypeCapture<Hourse> hourseClassTypeCapture = new ClassTypeCapture<>(Hourse.class);
        System.out.println(hourseClassTypeCapture.f(new building()));
        System.out.println(hourseClassTypeCapture.f(new Hourse()));
        hourseClassTypeCapture.createNew("java.lang.String");
        hourseClassTypeCapture.createNew("java.lang.Integer");

    }

}

class building{}

class Hourse extends building{}
