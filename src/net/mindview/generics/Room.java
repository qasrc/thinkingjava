package net.mindview.generics;

import java.util.Random;

/**
 * @author zhan
 * Created on 2017/11/18  16:57
 */
public class Room {
    private String id;
    private String descrip;

    public Room(String id, String descrip) {
        this.id = id;
        this.descrip = descrip;
        System.out.println("id = [" + id + "], descrip = [" + descrip + "]");
    }

    public static Generator<Room> generator() {
        return new Generator<Room>() {
            private Random random = new Random(47);
            @Override
            public Room next() {
                return new Room(String.valueOf(random.nextInt(1000)), "测试");
            }
        };
    }


}
