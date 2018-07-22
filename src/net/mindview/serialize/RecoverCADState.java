package net.mindview.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @author zhangzhan
 * @date 2018/7/22 8:42 AM
 */
public class RecoverCADState {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/store.out"));
        Line.deSerializeStatue(objectInputStream);
        Circle.deSerializeStatue(objectInputStream);
        Square.deSerializeStatue(objectInputStream);
        List<Shape> shapes = (List<Shape>) objectInputStream.readObject();

        System.out.println(shapes);
    }
}
