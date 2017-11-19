package generics;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zhan
 * Created on 2017/11/18  17:16
 */
public class Ship extends ArrayList<Office> {
    public Ship(int nOffice, int nDepat, int nRoom) {
        for (int i = 0; i < nOffice; i++) {
            new Office(nDepat, nRoom);
        }
    }

    public Ship(){}

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Office depts : this) {
            for (Dept dept : depts) {
                for (Room room : dept) {
                    stringBuilder.append(room);
                    stringBuilder.append(System.lineSeparator());
                }
            }
        }

        return stringBuilder.toString();
    }





    public static void main(String[] args) {
        System.out.println(new Ship(10, 12, 15));
    }
}
