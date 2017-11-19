package generics;

import java.util.ArrayList;

/**
 * @author zhan
 * Created on 2017/11/18  17:06
 */
public class Dept extends ArrayList<Room> {
    private String name;

    public Dept(String name,int nRoom) {
        this.name = name;
        Generators.fill(this, Room.generator(), nRoom);
    }
}
