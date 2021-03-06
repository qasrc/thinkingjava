package net.mindview.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zhangzhan
 * @date 2018/7/21 3:38 PM
 */
public class Circle extends Shape {
    private static int color = RED;
    public Circle(int xPos, int yPos, int dimension) {
        super(xPos, yPos, dimension);
    }

    @Override
    void setColor(int newColor) {
        color=newColor;
    }

    @Override
    int getColor() {
        return color;
    }

    static void serializeStatue(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(color);
    }

    static void deSerializeStatue(ObjectInputStream objectInputStream) throws IOException {
        color = objectInputStream.readInt();
    }

}
