package generics;

import java.util.ArrayList;

/**
 * @author zhan
 * Created on 2017/11/18  17:12
 */
public class Office extends ArrayList<Dept>{
    public Office(int nDepat, int nRoom) {
        for (int i = 0; i < nDepat; i++) {
            add(new Dept("dept" + i, nRoom));
        }
    }
}
