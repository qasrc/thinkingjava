package generics;

import java.util.Objects;

/**
 * @author zhan
 * Created on 2017/11/21  21:10
 */
public class Fruit {
    public Fruit(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    public Fruit() {
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, size);
    }

    private String color;
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
