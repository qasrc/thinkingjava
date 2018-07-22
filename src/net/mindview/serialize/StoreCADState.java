package net.mindview.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhan
 * @date 2018/7/21 3:51 PM
 */
public class StoreCADState {
    public static void main(String[] args) throws Exception{
        List<Shape> shapes = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            shapes.add(Shape.randomFactory());
        }
        for (int i = 0; i < 10; i++) {
            shapes.get(i).setColor(Shape.GREEN);
        }
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/store.out"));
        Line.serializeStatue(objectOutputStream);
        Circle.serializeStatue(objectOutputStream);
        Square.serializeStatue(objectOutputStream);
        objectOutputStream.writeObject(shapes);

        System.out.println(shapes);
    }
}
