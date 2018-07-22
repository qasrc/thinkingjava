package net.mindview.serialize;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_HARD_LIGHTPeer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

/**
 * @author zhangzhan
 * @date 2018/7/21 3:23 PM
 */
public abstract class Shape implements Serializable {
    public static final int RED=1,BLUE=2,GREEN=3;
    private int xPos,yPos,dimension;
    private static Random random = new Random(47);
    private static int counter=0;

    abstract void setColor(int newColor);

    abstract int getColor();




    @Override
    public String toString() {
        return "Shape{" +getClass()+
                "color="+getColor()+
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                ", dimension=" + dimension +
                '}'+'\n';
    }

    public Shape(int xPos, int yPos, int dimension) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.dimension = dimension;
    }


    public static Shape randomFactory() {
        int xPos = random.nextInt(100);
        int yPos = random.nextInt(100);
        int dimension = random.nextInt(100);
        switch (counter++ % 3) {
            default:
            case 0:
                return new Circle(xPos, yPos, dimension);
            case 1:
                return new Square(xPos,yPos,dimension);
            case 2:
                return new Line(xPos,yPos,dimension);
        }
    }
}
